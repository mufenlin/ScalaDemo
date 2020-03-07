package com.benchi.day02.func
/**
  * 1.函数的返回值类型可以忽略,scala根据最后一行代码的推导出函数的返回值类型,
  *    特殊情况不能推导:
  *    ①函数中包含return语句
  *    ②返回值类型与推导类型不一致时
  *    ③递归调用时
  *2. 如果函数签名与函数体之间的 = 号省略,函数的返回值类型永远为unit类型
  *3. 如果函数指明返回unit,则用于返回unit姓=型
  *4. 调用函数时,如果函数的参数个数为0,则圆括号可以省略
  *5. 声明函数时,如果不需要参数,则圆括号也可以省略,调用时也不能有圆括号
  *6. 函数的默认参数是val的,如果需要修改变量时,需要定义变量来修改
  * */
object FuncDemo2 {
  def main(args: Array[String]): Unit = {
    println(add(10,15))
    println(add1(20,30))
    foo()
    foo

    fooo
  }

  def foo()={
    println("foo ...")
  }

  def fooo ={
    println("fooo ...")
  }

  //返回unit类型
  def add1(a:Int, b:Int) {
    a+b
  }

    //返回值类型推导
    def add(a: Int, b: Int)={
      a+b
    }

}
