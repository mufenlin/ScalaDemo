package com.benchi.day06.sort

/**
  * sortBy,默认是升序的,不需要逻辑代码,只需排序的指标
  **/
class Person(val age: Int, val name: String) {
    override def toString: String = s"[age:$age,name:$name]"
}


object SortDemo2 {
    def main(args: Array[String]): Unit = {
        val li1 = List(30, 50, 70, 60, 10, 20)
        val li2 = li1.sortBy(x => x)(Ordering.Int.reverse)
        println(li2)

        val li3 = List("zzzzz", "hello", "world", "hello", "aaa", "b")
        //        val li4 = li3.sortBy(x => x)(Ordering.String)
        //        println(li4)
        //按照字符串的长度排列
        //        val li5 = li3.sortBy(x => x.length)(Ordering.Int)
        //        val li5 = li3.sortBy(_.length)(Ordering.Int)
        //        println(s"li5:$li5")

        //先按照长度升序排,长度相等时使用字母表的升序排
        //多个指标时,就把多个指标放在元祖中
        //        val li6 = li3.sortBy(x => (x.length,x))(Ordering.Tuple2(Ordering.Int,Ordering.String))
        //先按照长度降序排,长度相等时使用字母表的升序排
        //        val li6 = li3.sortBy(x => (x.length,x))(Ordering.Tuple2(Ordering.Int.reverse,Ordering.String))
        //先按照长度升序排,长度相等时使用字母表的降序排
        //        val li6 = li3.sortBy(x => (x.length,x))(Ordering.Tuple2(Ordering.Int,Ordering.String.reverse))
        //        println(s"li6:$li6")

        val li7 = List(new Person(10, "a"), new Person(30, "d"), new Person(10, "b"), new Person(8, "c"))
        // 年龄升序, 年龄等姓名升序
        val li8 = li7.sortBy(x => (x.age, x.name))(Ordering.Tuple2(Ordering.Int, Ordering.String))
        println(li8)


    }
}
