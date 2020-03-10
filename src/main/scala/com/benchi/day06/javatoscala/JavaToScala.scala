package com.benchi.day06.javatoscala

import java.util.{ArrayList => JUA}
import scala.collection.JavaConversions._

/**
  * java中的集合都是可变的
  * scala中集合有可变和不可变的
  */
object JavaToScala {
    def main(args: Array[String]): Unit = {
        val list = new JUA[Int]()
        list.add(10)
        list.add(80)
        list.add(30)

        list += 100

        for (elm <- list) {
            println(elm)
        }
    }
}
