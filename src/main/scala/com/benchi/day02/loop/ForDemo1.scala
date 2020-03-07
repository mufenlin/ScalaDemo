package com.benchi.day02.loop
/**
  * for循环
  *
  * */
object ForDemo1 {
  def main(args: Array[String]): Unit = {
    val a = "abc"

    //遍历容器,只能读,不能改
//    for(m <- a){
//      println(m+0)
//    }

    //使用for输出1-100
    /*
    for(i <- 1 to 100){
      println(i)
    }
    */

    //使用for输出1-100所有的奇数
    //def to(end: Int, step: Int)
    //①中写法
    /*
    for(m <- 1 to (100,2)){
      println(m)
    }
    */
    //def by(step: Int): Range = copy(start, end, step)
    //②中写法
    /*
    for(n <- 1 to 100 by 2){
      println(n)
    }
    */


    //输出100-1
    //①写法
    /*
    for(o <- 1 to 100 reverse){
      println(o)
    }
    */
    //②写法
    for(p <- 100 to 1 by -1){
      println(p)
    }

  }
}
