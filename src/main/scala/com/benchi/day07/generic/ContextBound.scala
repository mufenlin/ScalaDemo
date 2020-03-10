package com.benchi.day07.generic

/**
  * 上下文界限
  */
case class User(name: String, age: Int)

object User {
    implicit val ord: Ordering[User] = new Ordering[User]() {
        override def compare(x: User, y: User): Int = x.age - y.age
    }
}


object ContextBound {
    def main(args: Array[String]): Unit = {
        val user1 = User("wangwu", 20)
        val user2 = User("zhaosi", 30)

        println(max(user1, user2))
    }

    def max[T: Ordering](x: T, y: T) = {
        val ord = implicitly[Ordering[T]]
        if (ord.gt(x, y)) x
        else y

    }

}
