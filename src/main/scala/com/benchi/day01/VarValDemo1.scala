package com.benchi.day01
/**
  * 变量和常量(声明的同时必须初始化)
  * var 变量
  * val 常量(建议使用,安全)
  *
  */
object VarValDemo1 {
  def main(args: Array[String]): Unit = {
      //变量
      var a : Int = 10
      a = 20
      println(a)

      //常量
      val b:Int = 100
      println(b)

      var c: Int = 10  //类型推导
  }
}
