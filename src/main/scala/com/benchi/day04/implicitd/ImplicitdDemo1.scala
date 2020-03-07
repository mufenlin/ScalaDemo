package com.benchi.day04.implicitd

import java.time.LocalDate

/**
  * 隐式转换
  * */
object ImplicitdDemo1 {
    def main(args: Array[String]): Unit = {
        //隐式转换函数
        implicit def int2RichDate(day:Int) = new RichDate(day)
        val ago="ago"
        val later="later"

        //        val res= 2 days ago

        val res = 7.days(later)
        println(res)

    }
}

class RichDate(day:Int){
    def days(when:String) ={
        if("ago" == when){
            LocalDate.now().plusDays(-day).toString
        }else{
            LocalDate.now().plusDays(day).toString
        }
    }
}