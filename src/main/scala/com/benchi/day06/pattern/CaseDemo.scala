package com.benchi.day06.pattern

/**
  * 样例类
  * apply
  * unapply
  * equals
  * hashcode
  *
  */
case class User(name: String, age: Int)

object CaseDemo {
    def main(args: Array[String]): Unit = {
        val user = User("lisi", 28)

        user match {
            case User(name, age) => println(name, age)
        }

    }
}
