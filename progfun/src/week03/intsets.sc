package week03

object intsets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val t1 = new NonEmpty(3,Empty, Empty)           //> t1  : week03.NonEmpty = {.3.}
  val t2 = t1.incl(4)                             //> t2  : week03.IntSet = {.3{.4.}}
  val t3 = t2.incl(5)                             //> t3  : week03.IntSet = {.3{.4{.5.}}}
  val t4 = t2.incl(1)                             //> t4  : week03.IntSet = {{.1.}3{.4.}}
  val u34 = t3 union t4                           //> u34  : week03.IntSet = {{.1.}3{.4{.5.}}}
}

abstract class IntSet{
	def incl (x: Int): IntSet
	def contains(x: Int): Boolean
	def union(other: IntSet): IntSet
}

object Empty extends IntSet{
	def incl (x: Int): IntSet = new NonEmpty(x, Empty, Empty)
	def contains(x: Int): Boolean = false
	def union(other: IntSet) = other
	override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
	def incl (x: Int): IntSet = {
		if (x < elem) new NonEmpty(elem, left incl x, right)
		else if (x > elem) new NonEmpty(elem, left, right incl x)
		else this
	}
	def contains(x: Int): Boolean = {
		if (x > elem) right contains elem
		else if (x < elem) left contains elem
		else true
	}
	def union(other: IntSet) = {
		other union left union right incl elem
	}
	override def toString = "{"+left+elem+right+"}"
}