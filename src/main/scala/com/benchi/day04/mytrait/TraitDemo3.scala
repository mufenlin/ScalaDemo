package com.benchi.day04.mytrait

object TraitDemo3 {
    def main(args: Array[String]): Unit = {

    }
}

//编译不通过,违背单继承
class My extends Exception

trait F extends Exception
//若要成功,My需是Exception或者是Exception的子类
class Sub extends My with F
