package greeter

object worksheet {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val x = 1                                       //> x  : Int = 1
  def increase(i: Int) = i + 1                    //> increase: (i: Int)Int
  increase(x)                                     //> res0: Int = 2
  def and(x: Boolean ,y:Boolean) = if (x) y else false
                                                  //> and: (x: Boolean, y: Boolean)Boolean
  and(true, true)                                 //> res1: Boolean = true
  and(false, true)                                //> res2: Boolean = false
  and(true, false)                                //> res3: Boolean = false
  and(false, false)                               //> res4: Boolean = false
  
  
  def or(x: Boolean ,y:Boolean) =
  	if (x) true else y                        //> or: (x: Boolean, y: Boolean)Boolean
  		
  or(true,true)                                   //> res5: Boolean = true
  or(false,true)                                  //> res6: Boolean = true
  or(true,false)                                  //> res7: Boolean = true
  or(false,false)                                 //> res8: Boolean = false
}