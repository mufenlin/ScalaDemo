package com.benchi.day03.controlabs
/**
  *控制抽象
  * 使用名传递,柯里化,递归
  * */
object MyWhile {
  def main(args: Array[String]): Unit = {
    var a = 0
    loop(a<=100){
      println(a)
      a += 1
    }
  }
  //def loop(condition:Boolean)(op: => Unit):Unit={}     错误写法,值传递,Boolean永远为True
  //名传递,柯里化[也可以不使用],伪递归
  def loop(condition: => Boolean)(op: => Unit):Unit={
    if(condition){
      op
      loop(condition)(op)
    }
  }

}
