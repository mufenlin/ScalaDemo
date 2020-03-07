package com.benchi.day05.myarray

import com.benchi.day05.MyApp

/**
  * 数组:  定长数组
  * ①定义的同时初始化
  * ②定义时指定数组长度
  * */
object ArrayDemo1 extends MyApp{
    def main(args: Array[String]): Unit = {
        //创建长度为10的int数组等价于:new Int[10]
        val arr1 = new Array[Int](10)
        println(arr1.mkString(","))

        //声明同时初始化
        val arr2 = Array[String]("a","b","c")
        println(arr2.mkString("|"))
    }
}
