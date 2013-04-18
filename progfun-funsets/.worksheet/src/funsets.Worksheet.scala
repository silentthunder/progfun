package funsets
import funsets.FunSets._
object Worksheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(105); 
	
  println("Welcome to the Scala worksheet");$skip(31); val res$0 = 
  contains(singletonSet(4), 4);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(35); val res$1 = 
  
  contains(singletonSet(4), -1);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(56); val res$2 = 
  
  contains(union(singletonSet(4),singletonSet(2)),2);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(78); val res$3 = 

  contains(diff( union(singletonSet(4),singletonSet(2)) ,singletonSet(2)),4);System.out.println("""res3: Boolean = """ + $show(res$3))}
}
