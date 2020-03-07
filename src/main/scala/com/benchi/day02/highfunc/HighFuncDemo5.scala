package com.benchi.day02.highfunc
/**
  *1. 匿名函数使用场景:
  *   1)作为实参,直接传递给高阶函数
  *   2)直接作为高阶函数的返回值
  *2.传递
  *   foo((a:Int,b:Int) => a*b)
  *3.在传递匿名函数时,参数的类型一般可以利用上下文,由scala自行推导
  *4. foo(_ + _)使用前提
  *   1)该匿名函数只能有两个参数.
  *   2)每个参数只使用了一次
  *   3)第一个_表示第一个参数,第二个_表示第二个参数
  * */
object HighFuncDemo5 {
  def main(args: Array[String]): Unit = {
//      var a =() => println("aaaaaa")
//      foo(a)
//      foo(() => {println("匿名函数")})

//      foo((a:Int,b:Int) => a*b)  //函数体内容为单行时大括号可以省略
//      foo((a,b) => a+b)  //上述简写
      foo (_ + _)
  }


  def foo(add:(Int,Int) => Int) ={
    println(add(20,30))
    println(add(4, 5))
  }

/*  def foo(f:() => Unit)={
    f()
  }*/

}
