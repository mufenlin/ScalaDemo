package com.benchi.day05.mylist

import scala.collection.mutable.ListBuffer

/**
  * 可变ListBuffer
  **/
object ListBufferDemo {
    def main(args: Array[String]): Unit = {
        val lb = ListBuffer(1, 2, 4)
        lb += 20
        60 +=: lb
        println(lb)
    }
}
