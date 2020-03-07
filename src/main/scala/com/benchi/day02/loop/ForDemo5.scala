package com.benchi.day02.loop

object ForDemo5 {
  def main(args: Array[String]): Unit = {
    //得到一个序列:1,4,9,16,100*100
    //for推导
    var r = for(i <- 1 to 100 ) yield  i *i
    println(r)

    //"abcd" -> "AaBbCcDd"
    var res = for(p <- "abcd" ) yield p.toString.toUpperCase + p
    //mkString("", sep, "")
    println(res.mkString(""))
    //函数式写法
    println("abcd".map(p => p.toString.toUpperCase + p).mkString(""))

  }
}
