package com.benchi.day06.pattern

import scala.io.StdIn

/**
  * 模式匹配(类似java的switch)
  *
  * 格式:
  * value match{
  * case 条件1 (常量/变量)  => 执行的操作
  * case  条件2       => 执行的操作
  * }
  */
object PatternDemo1 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val op = StdIn.readLine("请输入一个运算符:")
        op match {
            case "+" =>
                println(a + b)
            case "-" =>
                println(a - b)
            case "*" =>
                println(a * b)
            case "/" =>
                println(a / b)
            //一般写在最后
            case _ =>
                println("你输入的运算符不对")
        }
    }
}
