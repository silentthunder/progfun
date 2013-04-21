package week03

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def nth(n:Int): T
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
	def isEmpty = false
	def nth(n : Int) = {
	  if (n == 0) head else tail nth(n-1)
	}
}

class Nill[T] extends List[T] {
  def nth(n : Int) = throw new IndexOutOfBoundsException
  def isEmpty = true
  def head: Nothing = throw new NoSuchElementException("Nil.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
}