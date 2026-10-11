package differences.recursionvstailrecursion

import scala.annotation.tailrec

object TailRecursion {

  def factorial(n: Int): Int = {
    @tailrec def factorialAcc(acc: Int, n: Int): Int = {
        if (n <= 1)
          acc
        else
          factorialAcc(n * acc, n-1)
      }
      factorialAcc(1, n)
    }

  def main(args:Array[String]):Unit={
    println(factorial(6))
  }

}
