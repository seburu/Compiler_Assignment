import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{}

abstract class Something extends AST{
    abstract public void eval(Environment env);
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

    public void eval(Environment env) {
        this.hardware.eval(env);
    }
}

class Hardware extends Something{
    String id;

    public Hardware(String id){
        this.id = id;
    }

    public void eval(Environment env) {
        System.out.println("");
    }
}

class Inputs extends Something{
    List<String> ids = new ArrayList<>();

    public Inputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
        }
    }

    public void eval(Environment env) {

    }
}

class Outputs extends Something{
    List<String> ids = new ArrayList<>();

    public Outputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
        }
    }

    public void eval(Environment env) {

    }
}

class Latch extends Something{
    String id1,id2;

    public Latch(Token id1, Token id2) {
        this.id1=id1.getText();
        this.id2=id2.getText();

    }

    public void eval(Environment env) {

    }
}

class Update extends Something{
    List<Assignment> assignments;

    public Update(List<Assignment> assignments){
        this.assignments=assignments;
    }

    public void eval(Environment env) {

    }
}

class Simulate extends Something{
    String id;
    String b;

    public Simulate(String id, String b){
        this.id = id;
        this.b = b;
    }

    public void eval(Environment env) {

    }
}

class Assignment extends Something{
    String id;
    Expr e;

    public Assignment(String id, Expr e){
        this.id = id;
        this.e = e;
    }

    public void eval(Environment env){
        env.setVariable(id,e.eval(env));
    }
}

abstract class Expr extends AST{
    abstract public Boolean eval(Environment env);
}

class And extends Expr{
    Expr e1;
    Expr e2;

    public And(Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public Boolean eval(Environment env) {
        return e1.eval(env) && e2.eval(env);
    }
}

class Var extends Expr{
    String ID;

    Var(String ID){
        this.ID=ID;
    }

    public Boolean eval(Environment env) {
        //return false;
        return 	env.getVariable(ID);
    }
}

class Not extends Expr{
    Expr expr;

    Not(Expr expr){
        this.expr=expr;
    }

    public Boolean eval(Environment env) {
        return !expr.eval(env);
    }
}

class Or extends Expr{
    Expr e1;
    Expr e2;

    public Or(Expr e1, Expr e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    public Boolean eval(Environment env) {
        return (e1.eval(env) || e2.eval(env));
    }
}