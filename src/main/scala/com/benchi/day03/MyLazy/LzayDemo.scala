package com.benchi.day03.MyLazy
/**
  * 惰性求值:
  *   1)只能用val
  *   2)计算好放在缓存中,获取方便,
  *  主动求值:
  *    系统一启动,所有的值都加载出来
  * */
object LzayDemo {
  val a1:Int = {println("a1");10}

  lazy val a2:Int = {println("a2");10}
  def a3={println("a3");10}

  def main(args: Array[String]): Unit = {
    println(a1)   //每次先判断a是否有值,如果没有则去计算,会缓存.如果有则从缓存中获取
    println(a1)
    println(a1)
    println("---------------------------------")
    println(a2)
    println(a2)
    println(a2)
    println("----------------------------------")
    println(a3)
    println(a3)
    println(a3)

  }
}
