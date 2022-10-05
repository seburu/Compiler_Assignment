public abstract class AST{};

abstract class Sequence extends AST{

}

class Hardware extends Sequence{


}




// 3*(y+1)
/* 
Expr e= new Multiplication(new Constant(3),
                           new Addition(new Variable("y"),
			                new Constant(1))) */
