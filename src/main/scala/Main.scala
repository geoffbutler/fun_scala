package main

object Main {
  def main(args: Array[String]) : Unit = {
    println("test")

    val test = new Test()
    val result = test.ReturnFalse()
    println(result)
  }
}