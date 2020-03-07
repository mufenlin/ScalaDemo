package com.benchi.day02.loop

import scala.io.StdIn
import scala.util.control.Breaks._

object ForDemo3 {

  def main(args: Array[String]): Unit = {
    //从键盘获取一个整数,判断这个整数是否是质数
    val n = StdIn.readInt()
    var isPrime = true
    //实质是抛出一个异常,自己捕捉,scala没有break关键字
    breakable{
      for(i <- 2 until n){
        if(n%i == 0) {
          isPrime = false
          break
        }
      }

    }


      if(isPrime){
        println(s"$n 是质数")
      }else{
        println(s"$n 不是质数")
      }
  }
}
