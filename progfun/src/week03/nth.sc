package week03

object nth {
	def nth[T](n: Int, xs:List[T]):T = {
		if (xs.isEmpty) throw new IndexOutOfBoundsException
		if (n == 0) xs.head else nth(n-1, xs.tail)
	}                                         //> nth: [T](n: Int, xs: week03.List[T])T
	val l = new Cons(1, new Cons(2, new Cons(3, new Nill)))
                                                  //> l  : week03.Cons[Int] = week03.Cons@535b58
	nth(0,l)                                  //> res0: Int = 1
	nth(2,l)                                  //> res1: Int = 3
}