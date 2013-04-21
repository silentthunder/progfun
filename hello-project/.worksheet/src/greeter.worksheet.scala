package greeter

object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(79); 
  println("Welcome to the Scala worksheet");$skip(12); 
  val x = 1;System.out.println("""x  : Int = """ + $show(x ));$skip(31); 
  def increase(i: Int) = i + 1;System.out.println("""increase: (i: Int)Int""");$skip(14); val res$0 = 
  increase(x);System.out.println("""res0: Int = """ + $show(res$0));$skip(55); 
  def and(x: Boolean ,y:Boolean) = if (x) y else false;System.out.println("""and: (x: Boolean, y: Boolean)Boolean""");$skip(18); val res$1 = 
  and(true, true);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(19); val res$2 = 
  and(false, true);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(19); val res$3 = 
  and(true, false);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(20); val res$4 = 
  and(false, false);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(62); 
  
  
  def or(x: Boolean ,y:Boolean) =
  	if (x) true else y;System.out.println("""or: (x: Boolean, y: Boolean)Boolean""");$skip(22); val res$5 = 
  		
  or(true,true);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(17); val res$6 = 
  or(false,true);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(17); val res$7 = 
  or(true,false);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(18); val res$8 = 
  or(false,false);System.out.println("""res8: Boolean = """ + $show(res$8))}
}
