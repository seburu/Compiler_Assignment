import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexerErrorListener;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Expr extends AST{
    abstract public boolean eval(Environment env);
}

class Program extends AST{
    Hardware hardware;
    Inputs inputs;
    Outputs outputs;
    List<Latch> latches;
    List<Update> updates;
    Simulate simulate;


    public Program(
            Hardware hardware,
            Inputs inputs,
            Outputs outputs,
            List<Latch> latches,
            List<Update> updates,
            Simulate simulate) {
        this.hardware = hardware;
        this.inputs = inputs;
        this.outputs = outputs;
        this.latches = latches;
        this.updates = updates;
        this.simulate = simulate;
    }
}

class Hardware extends AST{
    String id;

    public Hardware(String id){
        this.id = id;
    }
}

class Inputs extends AST{
    List<String> ids = new ArrayList<>();

    public Inputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
        }
    }

}

class Outputs extends AST{
    List<String> ids = new ArrayList<>();

    public Outputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
        }
    }
}


class Latch extends AST{
    String id1,id2;

    public Latch(Token id1, Token id2) {
        this.id1=id1.getText();
        this.id2=id2.getText();

    }
}

class Update extends AST{
    String id;
    Expr e;

    public Update(String id, Expr e){
        this.id = id;
        this.e = e;
    }

}

class Simulate extends AST{
    String id;
    String b;

    public Simulate(String id, String b){
        this.id = id;
        this.b = b;
    }

}

/*


class Hardware extends AST{
    String var;
    Hardware(String var){this.var = var;}
}



class Outputs extends AST{
    List<ParseTree> children = new ArrayList<>();
    public Outputs(List<ParseTree> children){

    }
}


class Update extends AST{
    List<ParseTree> children = new ArrayList<>();
    public Update(List<ParseTree> children){

    }
}

class Simulate extends AST{
    String var;
    int value;

    public Simulate(String var, int value) {
        this.var = var;
        this.value = value;
    }
}

class Assignment extends AST{
    String varname;
    Expr e;
    Assignment(String varname, Expr e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
        env.setVariable(varname,e.eval(env));
    }
}

//TODO Placeholder metode
class Not extends AST{

}

class Var extends AST{
    String var;
    Var(String var){
        this.var = var;
    }

}

*/




// 3*(y+1)
/*
Expr e= new Multiplication(new Constant(3),
                           new Addition(new Variable("y"),
			                new Constant(1))) */
