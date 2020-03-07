package com.benchi.day02.loop
/**
  *1.while结构的值是Unit
  *2.赋值语句的值是Unit
  * */
object WhileDemo1 {
  def main(args: Array[String]): Unit = {
      var i =10
      val r = while(i<10){
        println(i)
        i += 1
      }
      println(r)
  }
}
