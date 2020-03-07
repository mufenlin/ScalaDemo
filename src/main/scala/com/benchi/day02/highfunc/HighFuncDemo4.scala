package com.benchi.day02.highfunc

/**
  *函数与方法的区别
  */
object HighFuncDemo4 {
  def main(args: Array[String]): Unit = {
    val r:Int = foo(add _)
    println(r)
  }

  def foo(op:(Int,Int) => Int) ={
    op(10,20)
  }

  def add(a:Int,b:Int)=a+b

}
