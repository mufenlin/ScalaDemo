package com.benchi.day03.pack

import scala.beans.BeanProperty

/***
  *类和对象
  * scala默认的getter和setter不满足标准的javaBean规范
  * 需要注解,scala才能拿到标准的getter和setter注解
  */
object ObjDemo1 {
  def main(args: Array[String]): Unit = {
      val user:User = new User()
      println(user.age)
  }
}


class User{
  //定义属性和变量
  private var name="李四"  //私有的可读可写
  @BeanProperty val country="China"    //私有的只读
  @BeanProperty var age=18    //共有的可读可写

  //定义方法
  def eat()={
    println(name+"eat")
  }

}
