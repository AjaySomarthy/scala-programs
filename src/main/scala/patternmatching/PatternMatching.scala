package patternmatching

// Pattern Matching example in Scala
object PatternMatching {
  def main(args:Array[String]):Unit={
    println(patrnMatching(0))
    println(patrnMatching(1))
    println(patrnMatching(2))
    println(patrnMatching("Hyd"))
    println(patrnMatching("Ind"))
  }
  def patrnMatching(x : Any):String = x match {
    case 0 => "Zero"
    case 1 => "One"
    case "Hyd" => "Hyderabad"
    case _ => "Others_Codes"
  }
}
