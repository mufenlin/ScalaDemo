package com.benchi.day06.MyStream

/**
  * Stream:惰性数据结构
  * 使用时从Stream中取出,不适用数据还会在流中,避免的死循环
  *
  * #::往流中前面添加元素
  *
  */
object StreamDemo1 {
    def main(args: Array[String]): Unit = {
        val li1 = List(30, 50, 70, 60, 10, 20)
        val s1 = li1.toStream
        /*        println(s1.head)   //取出第一个元素
                println(s1.tail.head)   //取出30后面中的第一个元素

                s1.foreach(println)  //遍历出流中全部的数据(包含之前计算出来缓存的值)*/
        //        println(s1.force)   //流里数据全部求值

        //        println(gets.take(10).force)   //对流中的10个元素求值

    }


    /*    def gets:Stream[Int]={
            1#:: gets
        }*/
    println(fibSeq(10))

    //斐波那契数列 1 1 2 3 5 8 13 21 ...
    def fibSeq(n: Int): List[Int] = {
        def loop(a: Int, b: Int): Stream[Int] = {
            a #:: loop(b, a + b)
        }

        loop(1, 1).take(n).force.toList
    }
}
