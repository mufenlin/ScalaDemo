package com.benchi.day05.myset

/**
  * 不可变集合,去重无序
  * 取集合的并集并去重:
  * ++
  * |
  * union
  * 交集:
  * &
  * intersect
  * 差集(返回前边集合的):
  * &~
  * --
  */
object SetDemo1 {
    def main(args: Array[String]): Unit = {
        //不可变集合
        val s1 = Set(1, 2, 3, 4, 5, 3, 2)
        val s2 = s1 + 10
        val s3 = Set(1, 5, 8, 9, 3, 10)
        println(System.identityHashCode(s1))
        println(System.identityHashCode(s2))

        /*        val s4 = s1 ++ s3
                println(s4)*/
        //        val s5 = s1 | s3
        //        val s5 = s1 union  s3
        //        println(s"s5:$s5")


        //        val s6 = s1 & s3
        val s6 = s1 intersect s3
        println(s"s6:$s6")

        //        val s7 = s3 &~ s1
        val s7 = s1 -- s3
        println(s"s7:$s7")


    }
}
