package com.benchi.day05.mytupple

/**
  *
  * 元祖(最多22个):
  *
  *
  */
object TupleDemo1 {
    def main(args: Array[String]): Unit = {
        val t1 = Tuple2(10, "abc")
        println(t1._1)
        println(t1._2)

        //简化写法
        val t2 = (20, "def")
        println(t2._2)


        val t3 = (1, 2, true, false)
        for (elm <- t3.productIterator) {
            println(elm)
        }

        val t4 = (1, true)
        val t5 = 1 -> true

    }
}
