package com.benchi.day03.controlabs
/*
* @File:   NameValue2.scala
* @Author: IntelligenceBen
* @Description:  名调用和值调用
* @Date  18:46 2020/3/5
*/

object NameValue2 {
    def main(args: Array[String]): Unit = {
//        add(3+4)  //值传递
/*        val f() : Int = () => {
            println("f ....")
            10
        }*/
//        foo(f())
        foo({
            println("aaaa...")
            println("vvvvv")
            3
        })

    }

    //名调用
    def foo(a: => Int)={
        println(a)
        println(a)
    }
}
