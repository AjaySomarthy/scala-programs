package controlstatements.loops

// printing 1 to 5 numbers
object For {
  def main(args:Array[String]):Unit={

    println("The values of i are :")
    for ( i <- 1 to 5) {
      println(i)
    }

  }
}
