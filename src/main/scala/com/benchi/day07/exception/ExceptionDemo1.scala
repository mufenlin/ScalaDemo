package com.benchi.day07.exception

import java.io.IOException


/**
  * 异常处理
  */
object ExceptionDemo1 {
    def main(args: Array[String]): Unit = {

        try {
            foo()
        } catch {
            case e: IOException => println(e)
        }

    }

    @throws(classOf[RuntimeException])
    @throws(classOf[IOException])
    def foo() = {
        println("aaa")
    }
}
