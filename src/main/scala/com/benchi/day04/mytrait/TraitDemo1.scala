package com.benchi.day04.mytrait
/**
  * Trait:特质 相当于java中的抽象类,最终编译为接口
  *
  * 1.抽象类中所有东西,Trait中都有;
  * 2.Trait可以多继承
  * 3.当类继承类和trait,最前面的使用extends,后面的多继承使用with关键字混入
  * 4.构造器的执行顺序,父类<-先混入的<-后混入的
  * */
object TraitDemo1 {
    def main(args: Array[String]): Unit = {
        val usb:Logger  = new HuaWeiUsb()
/*        usb.insert()
        usb.work()
        usb.pop()*/
        usb.print
    }
}

class Logger{
    println("Logger的构造器")
    def print={
        println("开始打印日志")
    }
}

trait MyException{
    println("MyException的构造器,第二个混入的")
    def throwExc: Exception
}

trait Usb{
    println("Usb的构造器,第一个混入的")
    //抽象字段
    val name:String
    def insert():Unit
    def work():Unit
    def pop():Unit

    def init()={
        println(s"$name 开始初始化...")
    }
}


class HuaWeiUsb extends Logger with MyException with  Usb {
    println("HuaWeiUsb的构造器,子类")

    override val name: String = "huawei"

    override def insert(): Unit = {
        println(s"$name usb开始插入....")
        init()
    }

    override def work(): Unit = {
        println(s"$name usb开始工作....")
    }

    override def pop(): Unit = {
        println("华为 usb退出工作....")
    }

    override def throwExc: Exception = new RuntimeException(s"$name 的usb在抛异常")
}