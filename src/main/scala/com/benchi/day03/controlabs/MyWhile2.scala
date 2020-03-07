package com.benchi.day03.controlabs

/**
  * 自定义while循环
  */
object MyWhile2 {
    def main(args: Array[String]): Unit = {
        var a =0
        loop(a<100){
            println(a)
            a +=1
        }
    }

    def loop(condition: => Boolean)(op: => Unit):Unit={
        if(condition){
            op
            loop(condition)(op)
        }
    }
}
