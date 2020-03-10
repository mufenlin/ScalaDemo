package com.benchi.day06.pattern

/**
  * 匹配变量
  * case aa
  * aa是case语句中的变量,只能在case中使用
  * case  Ba
  * 大写字母开头的,scala会认为是一个常量
  * case _
  * 匹配一个变量
  */
object PatternDemo2 {
    def main(args: Array[String]): Unit = {
        /*        val a = 20
                a match {
                    //case语句声明的变量
                    case aa =>
                        println(aa)
                }*/
        val aA = 15

        val a = 30
        a match {
            //            case aA => println(aA)
            // `aA`  常量
            case `aA` => println(aA)
        }

    }
}
