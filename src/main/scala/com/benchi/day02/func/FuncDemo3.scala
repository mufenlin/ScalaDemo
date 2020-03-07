package com.benchi.day02.func
/**
  * 函数的默认返回值
  * 7.声明函数时,可以使用默认值复制
  * */
object FuncDemo3 {
  def main(args: Array[String]): Unit = {
     /* println(add(20,30,20))
      println(add(20,10))
      */
    println(add(10, c = 20))


  }

//  def add(a:Int,b:Int,c:Int=10)= a+b+c
    def add(a:Int,b:Int=20,c:Int) = a+b+c
}
