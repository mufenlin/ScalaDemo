package com.benchi.day01
/**
  * scala中没有静态的说法
  *
  * */
case class User(var age:Int,var name:String)
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("Hello World")

    val a = User(1,"张三")
    println(a.name)
  }
}
