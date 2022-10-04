public abstract class AST{};

abstract class Expr extends AST{
    abstract public Boolean eval();
}

class And extends Expr{
    Expr e1, e2;

    And(Expr e1, Expr e2){this.e1 = e1; this.e2 = e2;}
    public Boolean eval(){
        return e1.eval() && e2.eval();
    }
}
class Var Extends AST{}
class Equal Extends AST{}
class Or Extends AST{}
class Not Extends AST{}
class Parenthesis extends AST{}

class Assignment extends AST{}
class Command extends AST{}
class Sequence extends AST{}

class Addition extends Expr{
    Expr e1, e2;
    Addition(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}    
    public Integer eval(){	
	return e1.eval() + e2.eval();
    };
}

class Subtraction extends Expr{
    Expr e1, e2;
    Subtraction(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}    
    public Integer eval(){	
	return e1.eval() - e2.eval();
    };
}

class Multiplication extends Expr{
    Expr e1, e2;
    Multiplication(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Integer eval(){
	return e1.eval() * e2.eval();
    };
}

class Division extends Expr{
    Expr e1, e2;
    Division(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Integer eval(){
	return e1.eval() / e2.eval();
    };
}

class Constant extends Expr{
    public Integer i;
    Constant(Integer i){ this.i=i;}
    public Integer eval(){
	return i;
    };
};

class Variable extends Expr{
    public String varname;
    Variable(String varname){this.varname=varname;}
    public Integer eval(){
	System.out.println("Variable not implemented, assuming "+varname+"=0");
	return 0;
    };
};


// 3*(y+1)
/* 
Expr e= new Multiplication(new Constant(3),
                           new Addition(new Variable("y"),
			                new Constant(1))) */
