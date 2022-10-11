import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{

        // we expect exactly one argument: the name of the input file
        if (args.length!=1) {
            System.err.println("\n");
            System.err.println("Impl Interpreter\n");
            System.err.println("=================\n\n");
            System.err.println("Please give as input argument a filename\n");
            System.exit(-1);
        }
        String filename=args[0];

        // open the input file
        CharStream input = CharStreams.fromFileName(filename);
        //new ANTLRFileStream (filename); // depricated

        // create a lexer/scanner
        implLexer lex = new implLexer(input);

        // get the stream of tokens from the scanner
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // create a parser
        implParser parser = new implParser(tokens);

        // and parse anything from the grammar for "start"
        ParseTree parseTree = parser.start();

        // Construct an interpreter and run it on the parse tree
        Interpreter interpreter = new Interpreter();
        Command result = (Command) interpreter.visit(parseTree);
        System.out.println(result);
   }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Integer.

class Interpreter extends AbstractParseTreeVisitor<AST> implements implVisitor<AST> {

    public AST visitStart(implParser.StartContext ctx){

        return visit(ctx.cs);
    }

    public AST visitSequence(implParser.SequenceContext ctx) {
        return new Sequence((Command)visit(ctx.c),(Command)visit(ctx.cs));
    }

    public AST visitNOP(implParser.NOPContext ctx) {

        return new NOP();
    }

    public AST visitHardware(implParser.HardwareContext ctx) {
        return new Hardware(ctx.id.getText());
    }

    public AST visitInputs(implParser.InputsContext ctx) {
        return new Inputs(ctx.children);
    }

    public AST visitOutputs(implParser.OutputsContext ctx) {

        return new Outputs(ctx.children);
    }

    public AST visitLatch(implParser.LatchContext ctx) {

        return new Latch(ctx.id1.getText(),ctx.id2.getText());
    }

    public AST visitUpdate(implParser.UpdateContext ctx) {
        ArrayList<Assignment> updates = new ArrayList<Assignment>();
        for (implParser.AssignmentContext a : ctx.assignment()) {
            updates.add((Assignment) visit(a));
        }
        return null;
    }

    public AST visitSimulate(implParser.SimulateContext ctx) {

        return new Simulate(ctx.id.getText(),Integer.parseInt(ctx.b.getText()));
    }

    //TODO Spørg TA om hvorfor vi aldrig kommer ned til denne metode
    public AST visitAssignment(implParser.AssignmentContext ctx){
        return new Assignment(ctx.id.getText(),(Expr) visit(ctx.e));
    }

    public AST visitParenthesis(implParser.ParenthesisContext ctx) {
        return visit(ctx.e);
    }

    //TODO Spørg TA om hvordan denne metode skal laves
    public AST visitNot(implParser.NotContext ctx) {

        return null;
    }

    //TODO Spørg TA om hvordan denne metode skal laves
    public AST visitOr(implParser.OrContext ctx) {

        return null;
    }

    //TODO Spørg TA om hvordan denne metode skal laves
    public AST visitEqual(implParser.EqualContext ctx) {

        return null;
    }

    public AST visitVar(implParser.VarContext ctx) {

        return new Var(ctx.x.getText());
    }

    //TODO Spørg TA om hvordan denne metode skal laves
    public AST visitAnd(implParser.AndContext ctx) {

        return null;
    }



}

