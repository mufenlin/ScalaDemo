package com.benchi.day06.pattern

/**
  * 匹配数组内容
  */
object PatternDemo6 {
    def main(args: Array[String]): Unit = {
        val arr = Array(4, 7, 9, 10)
        arr match {
            //集合中元素逐一匹配
            //            case  Array(4,7,9,10)  => println("Array(4,7,9,10)")
            //选择匹配
            //            case Array(4,_,9,_) => println("Array(4,_,9,_)")
            //只匹配前两个元素
            //            case Array(4,7,_*)  => println("4,7,_*")
            //取出匹配到的结果,将后面匹配到的结果复制给abc
            case Array(4, 7, abc@_*) => println(abc.toList.mkString(","))
            case _ => println(-1)
        }
    }
}
