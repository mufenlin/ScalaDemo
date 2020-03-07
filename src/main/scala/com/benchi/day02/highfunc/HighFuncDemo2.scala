package com.benchi.day02.highfunc

/**
  *函数与方法的区别:
  *    1)def关键字定义的为方法,反之则为函数
  *    2)函数可以作为参数值使用,方法则不能
  *    3)方法可以通过 _ 转为函数
  */
object HighFuncDemo2 {
  def main(args: Array[String]): Unit = {
    //f1则为函数
/*    val f1 = foo _   //把方法转为函数
    f1(10)
    foo(10)*/

    //定义函数
    //函数不能声明返回值类型,只能推导
    //格式  () => { }
    var f= (a:Int) => a * a
    val r =f(3)
    println(r)


  //将add方法转为函数,没有上下文环境,需要手动转为函数
  val add1= add _
  //将方法转换为函数,scala自动完成
  val add2 :(Int,Int) => Int = add
  println(add1(10, 20))
  println(add2(20, 20))

  }
  //方法
  def add(a:Int,b:Int)= a+b
  //方法
  def foo(a:Int)= println(a)

}
