package com.benchi.day02.func
/**
  * scala的可变参数
  * */
object FuncDemo4 {
  def main(args: Array[String]): Unit = {
/*    println(add(1, 2, 4, 5))
    println(add(1,2,3))*/
    var arr = 1 to 100
    println(add(arr:_*))   //使用"_*"将数组展开
  }


  //java:int ....args
  def add(xs:Int*)={
    //xs在函数的内部,可以当做一个数组来处理
//    println(xs.getClass.getName)
    var sum=0
    for(a <- xs) sum += a
    sum
  }
}
