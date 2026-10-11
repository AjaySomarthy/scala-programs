package methods

object Closure {
  def main(args:Array[String]):Unit={
    var a = 5
    var sum = (b: Int) => a + b
    println(s"The sum is "+sum(2))
  }
}
