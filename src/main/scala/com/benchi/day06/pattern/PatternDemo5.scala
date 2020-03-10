package com.benchi.day06.pattern

/**
  * 泛型的类型匹配
  * 数组不是真正的泛型;
  * 除了数组,其它所有的泛型都是真正的泛型
  * 泛型擦除:
  * 泛型的存在只是为了在编译的时候更安全,只存在于源码和编译时,编译成字节码文件后便不存在了.
  */
object PatternDemo5 {
    def main(args: Array[String]): Unit = {
        val arr: Any = Array[Int](1, 2, 3)
        arr match {
            //            case a:Array[Int] => a.foreach(x => println(x))
            //匹配任意数组
            //            case a:Array[_] => a.foreach(x => println(x))

            //            case a:Array[Int]  => println("Array[Int]")
            //常用写法
            case a: Array[_] => println("Array[_]")
        }
    }
}
