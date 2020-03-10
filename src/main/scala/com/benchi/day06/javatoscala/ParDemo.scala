package com.benchi.day06.javatoscala

/**
  * 并行集合:
  * 使用集合.par方法,将串行集合-->并行的集合
  */
object ParDemo {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //        list1.foreach( x => println(Thread.currentThread().getName))  //main

        list1.par.foreach(x => println(Thread.currentThread().getName))
    }
}
