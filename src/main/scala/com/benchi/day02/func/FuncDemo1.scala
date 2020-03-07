package com.benchi.day02.func
/**
  * 函数式编程:
  *     面向过程编程
  *
  *    函数也可以看做一种对象
  *    scala是面向对象和面向过程的所有优点于一体
  *  1)纯函数:
  *     ①没有引用外部变量
  *     ②没有任何副作用,不输出/不返回结果
  *  ②闭包
  *  ③柯里化
  *  ④高阶函数
  *
  * scala定义函数
  *   def 函数名(参数列表):函数的返回值 ={
  *     逻辑处理
  *     //尽量不用return,最后一行代码的值会自动返回
  *   }
  *
  * 函数和方法的区别:
  * */
object FuncDemo1 {
  def main(args: Array[String]): Unit = {
      println(add(10,20))
  }
  //定义函数
  def add(a: Int, b: Int): Int = a+b


}
