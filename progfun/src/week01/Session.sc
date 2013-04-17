package week01

import scala.annotation.tailrec


object Session {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  	
  def sqrt(x: Double) = {
	  def abs(x:Double) = if (x < 0) -x else x
	  
	  val eps = 0.001
	  
	  def isGoodEnough(guess: Double, x: Double):Boolean =
	  	if (x > 1) abs(guess*guess - x)/x < eps
	  	else (isGoodEnough(1/guess, 1/x))
	  	
	  def improve(guess: Double, x: Double) =
	  	(guess + x/guess) / 2
	  	
	  def sqrIter(guess: Double, x: Double):Double =
	  	if(isGoodEnough(guess, x)) guess
	  	else sqrIter(improve(guess, x), x)
	  	
  	sqrIter(1.0, x)
 	}                                         //> sqrt: (x: Double)Double
	sqrt(4)                                   //> res0: Double = 2.000609756097561
	sqrt(2)                                   //> res1: Double = 1.4142156862745097
	sqrt(1e-6)                                //> res2: Double = 0.0010000001533016628
	sqrt(0.1e-20)                             //> res3: Double = 3.1633394544890125E-11
	sqrt(1e60)                                //> res4: Double = 1.0000788456669446E30
	 
	def gdc(a: Int, b:Int):Int =
		if (b==0) a else gdc(b, a % b)    //> gdc: (a: Int, b: Int)Int
		
	gdc(4,2)                                  //> res5: Int = 2
	gdc(2,4)                                  //> res6: Int = 2
	4%2                                       //> res7: Int(0) = 0
	
	def fact(x: Int):Int =
		if (x==0) 1 else x * fact(x-1)    //> fact: (x: Int)Int
		
 	fact(4)                                   //> res8: Int = 24
 	
 	def factRec(n: Int)= {
 		def factStep(acc: Int, n: Int):Int =
	 		if (n == 0) acc
	 		else factStep(acc * n, n-1)
	 	factStep(1, n)
 	}                                         //> factRec: (n: Int)Int
 		
 	factRec(1)                                //> res9: Int = 1
 	factRec(0)                                //> res10: Int = 1
 	factRec(2)                                //> res11: Int = 2
 	factRec(3)                                //> res12: Int = 6
 	factRec(4)                                //> res13: Int = 24
 	
}