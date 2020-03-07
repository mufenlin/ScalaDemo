package com.benchi.day04.implicitd

import java.io.File

import scala.io.Source

/**
  * 使用new File()读取文件内容
  *
  * */
object ImplicitdDemo3 {
    def main(args: Array[String]): Unit = {
        implicit def file2RichFile(file:File) = new RichFile(file)

        val content:String = new File("D:\\Idea\\IntelliJ IDEA 2018.3.2\\workspace\\src\\main\\scala\\com\\benchi\\day04\\implicitd\\ImplicitdDemo3.scala").readContent
        println(content)
    }
}

class RichFile(file:File){
    def readContent:String={
        Source.fromFile(file,"utf-8").mkString
    }
}