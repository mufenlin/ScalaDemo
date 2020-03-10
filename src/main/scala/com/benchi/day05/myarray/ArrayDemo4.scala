package com.benchi.day05.myarray

/**
  * 多维数组(实质是一维数组模拟的多维数组)
  **/
object ArrayDemo4 {
    def main(args: Array[String]): Unit = {
        //二维数组  2*3
        val array = Array.ofDim[Int](2, 3)
        //        println(array(0)(1))
        for (elm <- array) {
            for (index <- elm) {
                println(index)
            }
        }
    }
}
