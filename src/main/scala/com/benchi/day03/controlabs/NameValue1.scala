package com.benchi.day03.controlabs

/**
  * 1.名调用
  * */
object NameValue1 {
  def main(args: Array[String]): Unit = {
      foo({
        println("aaaaa....")
        println("100")
        10
      })
  }

  //名调用:a接收到的不是一个值,而是一段代码
  //使用时才会执行
  def foo(a: => Int)={
    println(a)
    println(a)
  }

}
