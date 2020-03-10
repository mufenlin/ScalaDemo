package com.benchi.day06.pattern

/**
  * 模式匹配添加循环守卫
  */
object PatternDemo4 {
    def main(args: Array[String]): Unit = {
        val a: Any = 100
        a match {
            case a: Int if a > 110 => println(a + 10)
            case s: String => println(s.toUpperCase())
            case b: Boolean => println(b)
            case _ => println(-1)
        }
    }
}
