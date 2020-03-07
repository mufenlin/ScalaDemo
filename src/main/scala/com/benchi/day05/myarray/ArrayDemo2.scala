package com.benchi.day05.myarray

import scala.collection.mutable.ArrayBuffer

/**
  *     +:  向前面添加
  *     :+  向后面添加
  *     ++  集合的合并
  *     +=   向尾部添加元素
  *     +=:  向头部添加元素
  *     ++=  将后面的集合合并到前面集合的,
  *     ++=:  同上
  *     -=   从集合中删除元素
  *     --=   取差集
  *
  *
  *
  * 变长数组(ArrayBuffer):
  *     1.new ArrayBuffer[Int]()
  *     2.ArrayBuffer(1,2,3)
  */
object ArrayDemo2 {
    def main(args: Array[String]): Unit = {
        //ArrayBuffer.apply(1,2,3,4)
       val  buffer: ArrayBuffer[Int] = ArrayBuffer(1,2,3,4)
       val  buffer1: ArrayBuffer[Int] = ArrayBuffer(9,6,4,5)
       val buffer2 = new ArrayBuffer[Int]()

//        println(buffer)
//        println(buffer2)
//         val b3 = 100 +: buffer :+50
//         println(b3)

//        buffer += 100   //原地修改地址,向尾部添加元素
//        200 +=: buffer    //向头部添加元素
//        println(buffer)
        val b3 = buffer1 ++ buffer
//        println(b3)

//        val b4 = buffer ++= buffer1  //将buffer1追加到buffer的后面,更新的是buffer
//        println(b4)
//        val b5 = buffer ++=: buffer1   //将buffer追加到buffer1的前面,更新的是buffer1
//        println(b5)

//        buffer -= 1    //删除集合中的元素
//        println(buffer)

        val b6 = buffer1 --= buffer   //取差集,返回前面集合(除去与后面集合公共的部分)
        println(b6)

    }
}
