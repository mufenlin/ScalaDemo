package com.benchi.day06.pattern

/**
  * 元祖匹配
  */
object PatternDemo7 {
    def main(args: Array[String]): Unit = {
        val t1 = ("lisi", 20)
        t1 match {
            //            case (name,age)  => println(name)
            case (name: String, age) => println(name)
            //编译不通过,和元祖中第一个元素类型不匹配
            //  case (name:Int,age)  => println(name)
        }
    }
}
