import org.antlr.v4.runtime.Token;
import java.util.ArrayList;
import java.util.Arrays;
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
        this.inputs.eval(env);
        initializeOuputs(env);
        initializeLatches(env);
        initializeUpdate(env);

        for(String sim : simulate.b){
            env.setVariable(simulate.id, env.toBoolean(Integer.parseInt(sim)));
            updates.eval(env);
            for(Latch latch : latches){
                latch.eval(env);
            }
            outputs.eval(env);
        }

    }

    private void initializeOuputs(Environment env) {
        for(String i : outputs.ids){
            env.setVariable(i, false);
        }
    }

    private void initializeUpdate(Environment env) {
        for (Assignment i : updates.assignments){
                env.setVariable(i.id,false);
                //System.out.println("Jeg eksisterede ikke, opretter: " + env.getVariable(i.id));
        }
    }

    private void initializeLatches(Environment env) {
        for(Latch i : latches){
            if(env.containsKey(i.id2)){
                //System.out.println("jeg findes allerede");
                env.setVariable(i.id2, env.getVariable(i.id1));
            }else{
                //System.out.println("jeg findes ikke endnu");
                env.setVariable(i.id2,false);
            }
        }
    }
    public void prinProgram(){
        for (String binaryInput: simulate.b) {
            System.out.print(binaryInput);
        }
        System.out.println(" " + simulate.id);

        for (int i = 0; i < outputs.tracess.size(); i++) {
            for(String trace :outputs.tracess.get(i)){
                System.out.print((trace.equals("true")) ? "1" : "0");
            }
            System.out.println(" " + outputs.ids.get(i));
        }
    }

    public void run(Environment env){
        eval(env);
        prinProgram();
    }
}

class Hardware extends Something{
    String id;

    public Hardware(String id){
        this.id = id;
    }

    public void eval(Environment env) {

    }
}

class Inputs extends Something{
    String id;

    public Inputs(String id){
        this.id=id;
    }

    public void eval(Environment env) {
        env.setVariable(id, false);//TODO Maybe fix
    }
}

class Outputs extends Something{
    List<String> ids = new ArrayList<>();
    List<List<String>> tracess= new ArrayList<>();

    public Outputs(List<Token> ids){
        for(Token i : ids){
            this.ids.add(i.getText());
            tracess.add(new ArrayList<String>());
        }
    }

    public void eval(Environment env) {

        for (int i = 0; i < ids.size(); i++) {
            tracess.get(i).add(env.getVariable(ids.get(i)).toString());
        }
    }
}

class Latch extends Something{
    String id1,id2;
    List<String> trace = new ArrayList<>();
    public Latch(Token id1, Token id2) {
        this.id1=id1.getText();
        this.id2=id2.getText();

    }

    public void eval(Environment env) {
        env.setVariable(id2,env.getVariable(id1));
        trace.add(id2);
    }
}

class Update extends Something{
    List<Assignment> assignments;

    public Update(List<Assignment> assignments){
        this.assignments=assignments;
    }

    public void eval(Environment env) {
        for (Assignment i : assignments){
            env.setVariable(i.id,i.e.eval(env));
        }
    }
}

class Simulate extends Something{
    String id;
    String[] b;

    public Simulate(String id, String b){
        this.id = id;
        this.b = b.split("");
    }

    public void eval(Environment env) {
        for(String i : b){

        }


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