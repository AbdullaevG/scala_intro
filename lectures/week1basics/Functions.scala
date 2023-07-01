package lectures.week1basics

object Functions extends App{
  def aPerson(name: String, surname: String): String = {
    s"$name $surname"
  }

  // println(aPerson("John", "Smith"))


  def aaPerson(name: String, surname: String): Unit = println(s"$name $surname")
  // aaPerson("John" , "Smith")

  // Здесь вам стоит запомнить, что если создается функция без параметров, то ее вызов возможен двумя способами:
  def aParameterlessFunction(): Unit = println("Function with no parameters")

  //aParameterlessFunction()
  //aParameterlessFunction

  // В Scala мы можем задавать дефолтные значения для параметров, что позволит нам лишний раз
  // не указывать параметры при вызове функции. Только следите за порядком аргументов.

  def aFunctionWithDefaultParameter(x: Int, y: String = "Default Parameter"): String = {
    s"x = $x and y = $y"
  }

  // println(aFunctionWithDefaultParameter(1)) // выводит x = 1 and y = Default Parameter


  // Вызов по имени(call-by-name) vs Вызов по значению(call-by-value)
  def callByValue(x: Long): Unit = {
    println(s"call by value: x1 = $x")
    println(s"call by value: x2 = $x")
  }

  def callByName(x: => Long): Unit = {
    println(s"call by name: x1 = $x")
    println(s"call by name: x2 = $x")
  }

  //callByValue(System.nanoTime())
  //

  def multiply(y: Int): Int = 5*y

  def aCondition(): Boolean = if (1 < 2) true else false

  def someFunnc(x: Int, y: => Int): Int = {
    if (aCondition) x * 2
    else multiply(y)
  }

  println(someFunnc(13, 14))
}
