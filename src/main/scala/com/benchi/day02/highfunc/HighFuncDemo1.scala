package com.benchi.day02.highfunc
/**
  * 高阶函数
  * 1.函数可以作为参数定义在函数中传递
  * 2.可以把函数当做一个值返回给函数的调用者,
  *   函数的调用者就可以在函数的外部去调用这个返回的函数
  * 3.如果一个函数f可以返回一个函数作为返回值,或者可以接收一个(多个)函数作为参数
  *   此f称为高阶函数
  * */
object HighFuncDemo1 {
  def main(args: Array[String]): Unit = {
/*    val f1 = foo()
    f1()*/

    //此写法为将f()的调用结果作为参数传到foo()函数中
    //foo(f())

    foo(f _)   //将f()整个函数作为参数传到foo()函数中

  }

  def f()={
    println("aaaaaaaaa")
  }

  def foo(x:() => Unit)={
    println(x)
    x()
  }

  //未调用时不会执行函数foo
/*  def foo()={
    def f(): Unit ={
      println("aaa")
    }
    f _   //将方法转为函数  f() -> f _
  }*/

}
