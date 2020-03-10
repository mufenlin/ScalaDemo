package com.benchi.day05.myset

import scala.collection.mutable

/**
  * 可变set,List可以转为Set再转为List
  **/
object SetDemo2 {
    def main(args: Array[String]): Unit = {
        val set1 = mutable.Set(1, 3, 4)
        val set2 = set1 += 10
        println(set2)

        val lb1 = List(10, 20, 60, 40, 30, 40, 20)
        val lb2 = lb1.toSet.toList
        println(lb2)


    }
}
