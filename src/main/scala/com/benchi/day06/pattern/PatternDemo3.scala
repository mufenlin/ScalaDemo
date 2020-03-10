package com.benchi.day06.pattern

import scala.io.StdIn

/**
  *
  * 任何语法结构都有返回值
  * 模式匹配的返回值即case语句最后一行的返回值
  */

object PatternDemo3 {
    def main(args: Array[String]): Unit = {
        val a = 10
        val b = 20
        val op = StdIn.readLine("请输入一个运算符:")
        val res = op match {
            case "+" =>
                a + b
            case "-" =>
                a - b
            case "*" =>
                a * b
            case "/" =>
                a / b
            //一般写在最后
            case _ =>
                -1
        }

        println(s"res:$res")
    }
}
