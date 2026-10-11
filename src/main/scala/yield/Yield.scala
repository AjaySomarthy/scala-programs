package `yield`

// Finding doubled list using yield
object Yield {
def main(args:Array[String]):Unit={

  val inputList = List(1,2,3)
  val doubledList = for (i <- inputList) yield i*2
  println(doubledList)

  }
}
