import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) throws IOException{

        // we expect exactly one argument: the name of the input file
        if (args.length!=1) {
            System.err.println("\n");
            System.err.println("Impl Interpreterr\n");
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
        Program result = (Program) interpreter.visit(parseTree);
        result.run(new Environment());
   }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Integer.

class Interpreter extends AbstractParseTreeVisitor<AST> implements implVisitor<AST> {

    public AST visitStart(implParser.StartContext ctx){

        Hardware hardware=(Hardware) visit(ctx.ha);

        Inputs inputs = visitInputs(ctx.in);

        Outputs outputs = visitOutputs(ctx.ou);

        List<Latch> latches = new ArrayList<>();

        for(implParser.LatchContext i : ctx.la){
            latches.add(visitLatch(i));
        }

        Update updates = visitUpdate(ctx.up);


        Simulate simulate = visitSimulate(ctx.si);


        Something p = new Program(hardware, inputs, outputs, latches, updates, simulate);
        return p;

    }

    public Hardware visitHardware(implParser.HardwareContext ctx) {
        return new Hardware(ctx.id.getText());
    }

    public Inputs visitInputs(implParser.InputsContext ctx) {

        return new Inputs(ctx.ids);
    }

    public Outputs visitOutputs(implParser.OutputsContext ctx) {
        return new Outputs(ctx.ids);
    }

    public Latch visitLatch(implParser.LatchContext ctx) {
        return new Latch(ctx.id1,ctx.id2);
    }

    public Update visitUpdate(implParser.UpdateContext ctx) {
        List<Assignment> assignments = new ArrayList<>();
        for(implParser.AssignmentContext as: ctx.as){
            assignments.add((Assignment) visit(as));
        }
        return new Update(assignments);

    }

    public Simulate visitSimulate(implParser.SimulateContext ctx) {
        return new Simulate(ctx.id.getText(),ctx.b.getText());
    }

    public AST visitAssignment(implParser.AssignmentContext ctx) {

        //visit(ctx.e);
        return new Assignment(ctx.id.getText(),(Expr) visit(ctx.e));
    }

    public AST visitParenthesis(implParser.ParenthesisContext ctx) {
        return visit(ctx.e);
    }

    public AST visitNot(implParser.NotContext ctx) {
        return new Not((Expr)visit(ctx.e));
        //return null;
    }

    public AST visitOr(implParser.OrContext ctx) {
        return new Or((Expr)visit(ctx.e1),(Expr)visit(ctx.e2));
    }


    public AST visitVar(implParser.VarContext ctx) {
        return new Var(ctx.getText());
    }

    public AST visitAnd(implParser.AndContext ctx) {
        return new And((Expr) visit(ctx.e1), (Expr)visit(ctx.e2));
    }


}

