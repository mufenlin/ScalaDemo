package com.benchi.day02.loop

object ForDemo2 {
  def main(args: Array[String]): Unit = {
    //输出1-100所有的奇数
    //循环守卫
    /*
    for(i <- 1 to 100 if i%2==1){
      println(i)
    }
    */

    //[1,100)
    /*
    for(elm <- 1 until 100){
      println(elm)
    }
    */

    //引入其他变量
    /*
    for(i <- 1 to 100;j=i*i){
      println(s"i=$i,j=$j")
    }
    */

    //加入if守卫
    for(i <- 1 to 100 if i%2 ==1 ;j=i*i if j<10000){
      println(s"i=$i,j=$j")
    }


  }
}
