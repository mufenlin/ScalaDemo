package com.benchi.day06.pattern

/**
  * List集合内容匹配
  */
object PatternDemo8 {
    def main(args: Array[String]): Unit = {
        val li = List(10, 40, 25, 34)
        li match {
            //            case List(10,40,c,d) => println(s"List(a,b,$c,$d)")
            //            case List(10,abc@_*) => println(abc.sortWith((x, y) => x.compareTo(y) > 0))

            //            case a :: b :: c :: d :: Nil => println(a)
            case a :: li2 => //最后一个一定是list集合
                println(li2)
        }
    }
}
