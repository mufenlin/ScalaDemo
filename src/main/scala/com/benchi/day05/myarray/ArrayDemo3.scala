package com.benchi.day05.myarray

import scala.collection.mutable.ArrayBuffer

/**
  * 将定长数组转换为变长数组
  **/
object ArrayDemo3 {
    def main(args: Array[String]): Unit = {
        val arr = Array(1, 20, 40, 90, 54)
        val buffer = arr.toBuffer
        println(buffer)

        //将变长数组转换为定长数组
        val arrayBuffer = ArrayBuffer(20, 30)
        println(arrayBuffer.toArray.mkString(","))
    }
}
