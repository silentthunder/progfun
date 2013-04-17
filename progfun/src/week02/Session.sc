package week02

object Session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int
  sum(x => x)(1, 3)                               //> res0: Int = 6

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    if (a > b) 1 else f(a) * product(f)(a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  product(x => x * x)(1, 3)                       //> res1: Int = 36
  
  def step(f:Int => Int,
  				 g:(Int, Int)=>Int,
  				 t: Int)(a:Int, b:Int): Int = {
  	if (a > b) t else g(f(a), step(f,g,t)(a+1,b))
  }                                               //> step: (f: Int => Int, g: (Int, Int) => Int, t: Int)(a: Int, b: Int)Int
  
  def sum2(f: Int => Int)(a: Int, b: Int) =
  	step(f, (m,n)=>m+n, 0)(a,b)               //> sum2: (f: Int => Int)(a: Int, b: Int)Int
  
  sum2(x=>x)(1,3)                                 //> res2: Int = 6
  
  def averageDamp(f: Double => Double)(x:Double)
  	= (x+f(x))/2                              //> averageDamp: (f: Double => Double)(x: Double)Double
  val tolerance = 0.0001                          //> tolerance  : Double = 1.0E-4
  
  def abs(x:Double) = if (x < 0) -x else x        //> abs: (x: Double)Double
  def isCloseEnough(x: Double, y:Double)=
  		abs((x-y)/x)/x < tolerance        //> isCloseEnough: (x: Double, y: Double)Boolean
  def fixedPoint(f : Double => Double)(firstGuess: Double) = {
  	def iterate(guess: Double):Double = {
  	  println(guess)
  		val next = f(guess)
  		if (isCloseEnough(guess, next)) next
  		else iterate(next)
  	}
  	iterate(firstGuess)
  }                                               //> fixedPoint: (f: Double => Double)(firstGuess: Double)Double
  def sqrt (x:Double):Double = fixedPoint(averageDamp(y => x/y))(1)
                                                  //> sqrt: (x: Double)Double
  sqrt(2)                                         //> 1.0
                                                  //| 1.5
                                                  //| 1.4166666666666665
                                                  //| 1.4142156862745097
                                                  //| res3: Double = 1.4142135623746899
}