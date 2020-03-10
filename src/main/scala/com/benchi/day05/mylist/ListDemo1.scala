package com.benchi.day05.mylist

/**
  * List 列表
  * 1)默认不可变,有序不去重
  *
  * :: 向列表头部添加元素(List专有)
  * :::  合并两个列表
  **/
object ListDemo1 {
    def main(args: Array[String]): Unit = {
        //声明同时初始化
        val li = List(1, 2, 3)
        val li1 = List("a", "b", "c")
        //声明空列表
        val li2 = List[Int]()
        //空列表
        val li3 = Nil

        //        val li4 =  10 +: li2 :+ 50

        val li4 = 20 :: 10 :: li3
        println(li4)
        val li5 = li ::: li1
        println(s"li5:$li5")


    }

}
