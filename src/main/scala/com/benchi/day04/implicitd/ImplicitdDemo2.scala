package com.benchi.day04.implicitd
/**
  * 隐式转换函数:
  *    implicitd def double2Int(d:Double) = d.toInt
  *应用场景:可以对已有的类增加功能(不修改类原有的功能);
  *        与继承的区别是,当类发生变化时,继承需要修改当前类;
  * 定义规范:不看函数名,只看参数类型[需要转换的源参数]和返回值类型[目的参数类型]
  *
  * */
object ImplicitdDemo2 {
    implicit def double2Int(d:Double) = d.toInt

    def main(args: Array[String]): Unit = {

        val a:Int =10.2
        println(a)
    }




}
