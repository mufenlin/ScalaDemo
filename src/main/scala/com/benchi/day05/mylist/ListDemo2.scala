package com.benchi.day05.mylist

import scala.collection.mutable.ListBuffer

/*
 *  +=
 *  ++=
 *  一般用于可变集合
 *
 *  不可变集合一般要加:
 *
 */
object ListDemo2 {
    def main(args: Array[String]): Unit = {
        val li = ListBuffer(20, 40, 80, 26, 22)
        println(System.identityHashCode(li))
        li += 100
        println(System.identityHashCode(li))
        println(li.mkString(","))
    }
}

