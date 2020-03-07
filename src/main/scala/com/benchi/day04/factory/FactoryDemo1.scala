package com.benchi.day04.factory

import scala.collection.mutable

/**
  * 静态工厂
  *
  * 伴生类和伴生对象之间可以互相访问对方的私有成员
  * */
object  FactoryDemo1 {
    def main(args: Array[String]): Unit = {
        println(Human.getHuman("黑色"))
        println(Human.getHuman("黑色"))
        println(Human.getHuman("白色"))
        println(Human.getHuman("白色"))
        println(Human.getHuman("黄色"))
    }
}

object Human{

    val map = mutable.Map[String,Human]("黑色" -> new Human("黑色"))

    def getHuman(color:String):Human = map.getOrElse(color,new Human(color))
}

class Human(color:String){
    println(s"$color.....")
    override def toString: String = s"人种 : $color"
}
