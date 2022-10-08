import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.xpath.XPathLexerErrorListener;

import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Command extends AST{
}

class NOP extends Command{
    NOP(){}
    public void eval(Environment env){};
}

abstract class Expr extends AST{
    abstract public Integer eval(Environment env);
}

class Sequence extends Command{
    Command c1,c2;
    Sequence(Command c1,Command c2){this.c1=c1; this.c2=c2;}
}

class Hardware extends Command{
    String var;
    Hardware(String var){this.var = var;}
}

class Inputs extends Command{
    List<ParseTree> children = new ArrayList<>();
    public Inputs(List<ParseTree> children){

    }
}

class Outputs extends Command{
    List<ParseTree> children = new ArrayList<>();
    public Outputs(List<ParseTree> children){

    }
}

class Latch extends Command{
    String id1,id2;


    public Latch(String id1, String id2) {
        this.id1 = id1;
        this.id2 = id2;
    }
}

class Update extends Command{
    List<ParseTree> children = new ArrayList<>();
    public Update(List<ParseTree> children){

    }
}

class Simulate extends Command{
    String var;
    int value;

    public Simulate(String var, int value) {
        this.var = var;
        this.value = value;
    }
}

class Assignment extends Command{
    String varname;
    Expr e;
    Assignment(String varname, Expr e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
        env.setVariable(varname,e.eval(env));
    }
}

//TODO Placeholder metode
class Not extends Command{

}

class Var extends Command{
    String var;
    Var(String var){
        this.var = var;
    }

}






// 3*(y+1)
/*
Expr e= new Multiplication(new Constant(3),
                           new Addition(new Variable("y"),
			                new Constant(1))) */
