package com.benchi.day02.loop

object ForDemo4 {
  def main(args: Array[String]): Unit = {
    //9*9乘法表
    /*
    for(i <- 1 to 9){
      for(j <- 1 to i ){
        print(s"$j * $i = ${i * j}\t")
      }
      println()
    }
    */
    //所有的代码都在内循环时,可以使用循环的嵌套
    for(i <- 1 to 9; j <- 1 to i){
      print(s"$j * $i = ${i * j}\t")
      if(i == j) println()
    }
  }
}
