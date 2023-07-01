package lectures.week1basics

object Expressions extends App {
  val aVal = 1 + 2 * 3
  println(aVal)

  val aCondition = true

  val ifExpressionValue = if (aCondition) "True Condition" else "False Condition"
  println(ifExpressionValue) // выведет True Condition
  // Кто до сих пор не верит, что if - это выражение, смотрите
  val aaCondition = true
  println(if (aCondition) "True Condition" else "False Condition") // выведет True Condition

  // Unit особенно полезен в функциях, когда нам ничего, кроме как вывести что-то на экран, не требуется.
  // val someVal: Unit = print("I just want to print")

  // val someVal1 = print("It is just a value")
  // print(someVal1) // выведет It is just a value()

  val aCodeBlock = {
    val someVal = 1
    val y = 2

    if (someVal + y > 1) true else false
  }

  println(aCodeBlock) // выводит true


  val someValue = {
    1 < 0
    2 == 5
    4 < 9
  }

  val someCodeBlock = {
    if (someValue) 1 else 0
    0
  }

  println(someCodeBlock)
}
