package recfun
import common._

object Main {
  def main(args: Array[String]) {
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = 
    if (c == 0 || c == r) 1 else (pascal(c-1,r-1) + pascal(c,r-1))

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    def checkNegativeBalance(currentBalance: Int) = currentBalance < 0
    def balanceCalc (currentBalance: Int, c: Char) =
      if (c == '(') currentBalance+1 else if (c == ')') currentBalance-1 else currentBalance
    step(chars,0, balanceCalc, checkNegativeBalance) == 0
 }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    if (money < 0) 0
    else if (coins.isEmpty) 0
    else if (money == 0) 1+countChange(money-coins.head, coins.tail)
    else sumSteps(coins, money, countChange, 0)
  }
  
  def sumSteps(aList: List[Int], currMoney: Int, aFunc: (Int, List[Int])=> Int, acc: Int): Int ={
    if (aList.isEmpty) acc
    else sumSteps(aList.tail, currMoney, aFunc, acc + aFunc(currMoney-aList.head,aList))
  }
  
  def step (aList: List[Char], acc: Int, aFunc: (Int,Char) => Int , breakCond: (Int)=>Boolean): Int = 
   	if (breakCond(acc) || aList.isEmpty) acc else step(aList.tail, aFunc(acc, aList.head), aFunc, breakCond)
  
}
