package com.benchi.day03.homework
/**
  * 1)将函数的一个参数列表,变为多个参数列表的过程,称作柯里化(一般是两个参数)
  * 2)一般第一个参数必须传递,第二个列表内一般是隐式值
  * 3)柯里化的理论基础是闭包
  *
  * 函数式编程的标配:
  *   1.高阶函数
  *   2.闭包
  *   3.柯里化
  *   4.模式匹配
  *
  * */
object HomeWork {
    def main(args: Array[String]): Unit = {
/*        val f1 = foo(5)
        println(f1(6))
        val f2 = foo(7)
        println(f2(8))*/
        println(add(5)(6))

    }
    //函数的柯里化
    def add(a:Int)(b:Int) = a+b
    def add1(a:Int,b:Int) = a + b
//    def add(a:Int) = (b:Int) => a+b


}
