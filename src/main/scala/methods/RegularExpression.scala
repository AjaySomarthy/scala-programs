package methods

import scala.util.matching.Regex

object RegularExpression {
  def main(args:Array[String]):Unit={
    // var x = "Hello".r
    // var y = "Hello Ajay How are you"
    // println(x findFirstIn y)

    // var a = new Regex("Ajay")
    // var b = "My name is Ajay"
    // println(a replaceFirstIn(b, "Bharath"))

    var l = new Regex("(G|g)fg")
    var m = "Gfg is a portal. I like gfg"
    println((l findAllIn m).mkString(", "))
  }
}
