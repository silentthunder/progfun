package recfun


object worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 

  println("Welcome to the Scala worksheet");$skip(19); val res$0 = 
  Main.pascal(2,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(43); val res$1 = 
  Main.balance("(just an) example".toList);System.out.println("""res1: Boolean = """ + $show(res$1))}
  
 }
