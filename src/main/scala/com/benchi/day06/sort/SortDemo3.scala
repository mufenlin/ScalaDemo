package com.benchi.day06.sort

/**
  * sortWith
  * 传递一个函数,在函数中自定义比较规则
  */
object SortDemo3 {
    def main(args: Array[String]): Unit = {
        val list1 = List(30, 50, 70, 60, 10, 20)
        //返回True,第一个排序在前,返回false,第一个排序在后
        //        val list2 = list1.sortWith((x,y) => x<y)
        val list2 = list1.sortWith(_ < _)
        println(list2)

        val li3 = List("Steve", "Tom", "John", "Bob")
        val li4 = li3.sortWith((x, y) => x.compareTo(y) > 0)
        println(li4)
    }
}
