package lectures.week1basics



/*
    Byte [ 8 битовое знаковое значение. Диапазон от -128 до 127 ]
    Short [ 16 битовое знаковое значение. Диапазон от -32768 to 32767 ]
    Int [ 32 битовое знаковое значение. Диапазон от -2147483648 to 2147483647 ]
    Long [ 64 битовое знаковое значение. Диапазон от -9223372036854775808 to 9223372036854775807 ]
    Float [ 32 битовое IEEE 754 число с плавающей точкой одинарной точности ]
    Double [ 64 битовое IEEE 754 число с плавающей точкой двойной точности ]
    Char [ 16 битовое беззнаковый символ Unicode. Диапазон от U+0000 to U+FFFF ]
    String [ Последовательность экземпляров Char ]
    Boolean [ Логическое буквенное значение true или false ]
    Unit [ Соответствует отсутствию значения ]
    Null [ Null или пустая ссылка ]
    Nothing [ Подтип любого другого типа, включает в себя отсутствие значения. ]
    AnyRef [ Супертип любого ссылочного типа. ]
*/

object TypesValuesVariables extends App{
  var aString: String = "hello"
  val aChar = 'C'

  val aInt = 11
  val aLong = 11L
  val aFloat = 2.0f
  val aDouble = 2.0

  val aBoolean = true

  println(aLong.getClass)

  aString = "Hello, world!"

  println(aString.length) // выводит 13
  println(aString.charAt(1)) // выводит e
  println(aString.substring(0, 2)) // выводит He
  println(aString.split(" ").toList) // выводит List(Hello,, world!)
  println(aString.startsWith("He")) // выводит true
  println(aString.replace("!", ".")) // выводит Hello, world.
  println(aString.toLowerCase) // выводит hello, world!
  println(aString.toUpperCase) // выводит HELLO, WORLD!
  println("abcd".reverse) // выводит dcba
  println("abcd".take(2)) // выводит ab
  aString = "Scala course"
  println(aString.replace("a", "").take(3).reverse) // выводит lcS
  val aNumber = "42".toInt
  println(aNumber) // выводит 42
  println(aNumber.getClass) // выводит int
  val aaString = 42.toString // Преобразование числа в строку
  println('1' +: "42" :+ '3') // выводит 1423
  println('a' +: "bc" :+ 'd') // abcd
  println("a" ++ "bc" :++ "d") // abcd



    /* добавление в начало подразумевает наличие двоеточия после  плюса.
       Соответственно, добавление в конец - перед плюсом
       +: или :+ подразумевает, что присоединять будем одиночные элементы (работаем с типом char)
       ++ или :++ указывает, что присоединять будем несколько элементов (используем элементы типа String),
       следовательно здесь уже понадобятся двойные кавычки
     */


  // s-интерполятор - используется для подставления значения переменной типа String в строку.
  val name = "John"
  println(s"Hello, $name") // выводит Hello, John,
  // raw-интерполятор - при встрече символа \n курсор переводится на новую строку

  val link = "https://stepik.org"
  println(raw"The link is \t $link") // The link is \t https://stepik.org
  println(s"The link is link") // The link is link
  println(s"The link is ${link.toUpperCase}") // The link is HTTPS://STEPIK.ORG
  println(s"The link is \t $link")  // The link is   https://stepik.org
  println(s"The link is $link.toUpperCase") // The link is https://stepik.org.toUpperCase
  println(link :++ "/catalog") // https://stepik.org/catalog

}
