package differences.recursionvstailrecursion

// Factorial Programme
object StandardRecursion {

  def main(args:Array[String]):Unit={
    println(fact(5))
  }

    def fact(n:Int):Int={
      if (n==1) 1
      else n * fact(n-1)
    }

}
