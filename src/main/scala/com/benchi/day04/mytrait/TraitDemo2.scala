package com.benchi.day04.mytrait
/**
  * 多混入的问题:
  *  1.如果一个类混入的特质中有实现好的相同的方法,会产生成员的冲突
  *  2.可以通过菱形继承的规则解决该问题(需要给多个特质混入同一个父类特质)
  * */
object TraitDemo2 {
    def main(args: Array[String]): Unit = {
//        val abc= new ABC
//        abc.foo()

        val my:A =new MyClass with A    //动态混入,不修改别人的源码时扩充内容

    }
}

class MyClass


class ABC extends A with B with C{
    override  def foo()={
        super.foo()   //C ..
        println("ABC ...")
    }
}

trait A{
    def foo()={
        println("A ...")
    }
}

trait B extends A{
    override  def foo()={
        println("B ...")
    }
}

trait C extends A{
    override def foo()={
//        super[A].foo()  //A ...
        println("C ...")
    }
}