package com.benchi.day02.highfunc
/*
* @File:   Closure.scala
* @Author: IntelligenceBen
* @Description: 闭包
*   一个函数,如果访问了外部的局部变量,则这个函数和它访问的局部变量称为一个闭包
*   闭包会阻止外部局部变量的销毁,可以把局部变量的使用延伸到变量外部
*
* @Date  16:20 2020/3/5
*/

object Closure {
  def main(args: Array[String]): Unit = {
/*    val f = foo()
    val res = f(10)   //正常情况下,内部类不能访问到外部的局部变量,这里能访问到是因为有闭包
    println(res)*/
    val f = foo()
    println(f())
    println(f())
    val f1 = foo()
    println(f1())

  }

  def foo() ={
    var a:Int = 10
    () =>{
      a = a+1
      a
    }
  }

    /**
      * 闭包
      * */
//  def foo() ={
//    var a =10
//    (b:Int) => a + b
//
//  }

}
