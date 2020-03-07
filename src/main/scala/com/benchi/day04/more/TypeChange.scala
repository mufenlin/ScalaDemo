package com.benchi.day04.more
/**
  * 类型转换
  * 判断类型:obj isInstanceOf Object
  * 类型转换: obj asInstanceOf Object
  * */
object TypeChange {
    def main(args: Array[String]): Unit = {
        val bb = new BB
        println(bb.isInstanceOf[BB])
        println(bb.isInstanceOf[AA])

        val aa = bb.asInstanceOf[AA]
        println(aa.isInstanceOf[BB])
        println(aa.isInstanceOf[AnyRef])
    }
}


class AA

class BB extends AA