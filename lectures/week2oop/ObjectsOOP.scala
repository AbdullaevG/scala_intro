package lectures.week2oop

object ObjectsOOP extends App{
  val student = new Student(0, "Andrey")
  //println(student.getId(name="Pam", id=42)) // Pam has ID 42 and Pam  has ID 42
  val employee = new Employee()
  //println(s"${employee.name}'s salary is ${employee.salary}")
  val instructor: Instructor = new Instructor(1, "вася", "пупкин")
  println(instructor.fullName())
  val course: Course = new Course(2, "Course Name", "1234", instructor)
  println(course.getID)
  println(course.isTaughtBy(instructor))
  println(course.isTaughtBy(new Instructor(1, "Вася", "Пупкин")))
  println(course.copyCourse("4321").releaseYear)
}

class Student(id: Int, var name: String) {

  val uni = "University"
  def getId(name: String, id: Int): String = s"${this.name} has ID ${this.id} and $name  has ID $id"
  //("I'm in class") // printed firs
}


class Employee(val name: String, var salary: Double) {
  // здесь пропущена строка кода
  def this()=this("John", 0)
}

class Instructor(val id: Int, val name: String, val surname: String) {
  def fullName(): String = s"${name.capitalize} ${surname.capitalize}"

}

class Course(val courseID: Int, val title: String, val releaseYear: String, val instructor: Instructor) {
  def getID(): String = instructor.id.toString + courseID.toString
  def isTaughtBy(new_instructor: Instructor): Boolean = if (this.instructor == new_instructor) true else false
 def copyCourse(newReleaseYear: String): Course = {
    new Course(this.courseID, this.title, newReleaseYear, this.instructor)
  }
}


