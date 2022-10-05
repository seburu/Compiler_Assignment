import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

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
        Sequence result=interpreter.visit(parseTree);
        System.out.println(result);
   }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Integer.

class Interpreter extends AbstractParseTreeVisitor<Sequence> implements implVisitor<Sequence> {

    public Sequence visitStart(implParser.StartContext ctx){
        return visit(ctx.c);
    }

    public Sequence visitSequence(implParser.SequenceContext ctx) {
        return visit(ctx);
    }

    public Sequence visitHardware(implParser.HardwareContext ctx) {
        return null;
    }

    public Sequence visitInputs(implParser.InputsContext ctx) {
        return null;
    }

    public Sequence visitOutputs(implParser.OutputsContext ctx) {
        return null;
    }

    public Sequence visitLatch(implParser.LatchContext ctx) {
        return null;
    }

    public Sequence visitUpdate(implParser.UpdateContext ctx) {
        return null;
    }

    public Sequence visitSimulate(implParser.SimulateContext ctx) {
        return null;
    }


    public Sequence visitCommand(implParser.CommandContext ctx) {
        return null;
    }

    public Sequence visitAssignment(implParser.AssignmentContext ctx) {
        return null;
    }

    public Sequence visitParenthesis(implParser.ParenthesisContext ctx) {
        return null;
    }

    public Sequence visitNot(implParser.NotContext ctx) {
        return null;
    }

    public Sequence visitOr(implParser.OrContext ctx) {
        return null;
    }

    public Sequence visitEqual(implParser.EqualContext ctx) {
        return null;
    }

    public Sequence visitVar(implParser.VarContext ctx) {
        return null;
    }

    public Sequence visitAnd(implParser.AndContext ctx) {
        return null;
    }

    ;



}

