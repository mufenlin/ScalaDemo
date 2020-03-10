package com.benchi.day07.mypattern

/**
  * 偏函数
  */
object PatternDemo1 {
    def main(args: Array[String]): Unit = {
        val list = List(10, 20, 1, "aa", false)
        val list2 = list.collect({
            case a: Int => a
        })
        println(list2)
    }
}
