package com.benchi.day06.pattern

object sqrt {
    def unapply(a: Double) = {
        if (a >= 0) Some(math.sqrt(a))
        else None
    }
}

/**
  * 使用对象匹配的方式将一个数的平方根匹配出来
  */
object ObjMatchDemo2 {
    def main(args: Array[String]): Unit = {
        val a = 9.0

        a match {
            case sqrt(c) => println(c)
        }
    }
}
