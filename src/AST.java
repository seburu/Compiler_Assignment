import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexerErrorListener;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Something extends AST{

}

class Program extends Something{
    Hardware hardware;
    Inputs inputs;
    Outputs outputs;
    List<Latch> latches;
    Update updates;
    Simulate simulate;


    public Program(
            Hardware hardware,
            Inputs inputs,
            Outputs outputs,
            List<Latch> latches,
            Update updates,
            Simulate simulate) {
        this.hardware = hardware;
        this.inputs = inputs;
        this.outputs = outputs;
        this.latches = latches;
        this.updates = updates;
        this.simulate = simulate;
    }
}

class Hardware extends Something{
    String id;

    public Hardware(String id){
        this.id = id;
    }
}

class Inputs extends Something{
    List<String> ids = new ArrayList<>();

    public Inputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
        }
    }

}

class Outputs extends Something{
    List<String> ids = new ArrayList<>();

    public Outputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
        }
    }
}


class Latch extends Something{
    String id1,id2;

    public Latch(Token id1, Token id2) {
        this.id1=id1.getText();
        this.id2=id2.getText();

    }
}
/*
class Assignment extends AST{
    String id;
    Expr e;

    public Assignment(String id, Expr e){
        this.id = id;
        this.e = e;
    }


}
*/

class Update extends Something{
    List<implParser.AssignmentContext> assignments = new ArrayList<>();

    public Update(List<implParser.AssignmentContext> assignments){
        for (implParser.AssignmentContext i : assignments){
            this.assignments.add(i);
        }
    }

}

class Simulate extends Something{
    String id;
    String b;

    public Simulate(String id, String b){
        this.id = id;
        this.b = b;
    }
}

abstract class Expr extends AST{
    //abstract public boolean eval(Environment env);
}

class Assignment extends Something{
    String id;
    Expr e;

    public Assignment(String id, Expr e){
        this.id = id;
        this.e = e;
    }
}

class And extends Expr{
    Expr e1;
    Expr e2;

    public And(Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }
    /*
    public boolean eval(Environment env){
        return e1.eval(env) && e2.eval(env);
    };
    */

}

