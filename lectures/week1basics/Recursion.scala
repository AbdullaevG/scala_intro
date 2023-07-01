package lectures.week1basics

object Recursion extends App{
  var i = 0
  while (i < 3) {
    println("hello")
    i += 1
  }


  def factorial1(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial1(n - 1)
  }

  println(factorial1(3)) // выводит 6

  // factorial(3)

  def factorialWithTailRecursion(n: Int): Int = {
    def loop(x: Int, accumulator: Int): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }

    loop(n, 1)
  }

  println(factorialWithTailRecursion(5))

  /*
  Как писать функции в стиле хвостовой рекурсии
  1. Определяете функцию. Назовем ее основной.

  2. Внутри основной функции прописываете еще одну функцию. Назовем ее вспомогательной.

  3. В качестве аргументов вспомогательной функции указываете число вызовов (этот аргумент совпадает
  с одним из аргументов основной функции) - плюс аккумулятор, который будет содержать конечный результат.

  4.  Прописываете код с рекурсией в теле вспомогательной функции с использованием аккумулятора (так,
  чтобы значение постепенно накапливалось)

  5. Вызываете вспомогательную функцию из основной функции. Не забудьте указать начальное
   значение аккумулятора, задающее отправную точку всех вычислений. Используйте аргумент по
   умолчанию для оптимизации кода.

   */

  import scala.annotation.tailrec

  def factorialWithTailRecursion1(n: Int): Int = {
    @tailrec
    def loop(x: Int, accumulator: Int = 1): Int = {
      if (x <= 1) accumulator
      else loop(x - 1, x * accumulator)
    }

    loop(n)
  }

  def repeatWord(word: String, n: Int): String = {
    @tailrec
    def loop(i: Int, acc: String = word): String = {
      if (i <= 1) acc
      else loop(i - 1, s"$word $acc")
    }

    loop(n)
  }

  println(repeatWord("hello", 3))
}
