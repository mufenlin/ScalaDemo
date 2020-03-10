package com.benchi.day06.pattern

object OptionDemo {
    def main(args: Array[String]): Unit = {
        /*        val op:Option[Int] = get
                if(op.isDefined){
                    println(op.get)
                }*/

        val op: Option[Double] = sqrt(-9)
        if (op.isDefined) {
            println(op.get)
        } else {
            println("没有平方根")
        }

    }

    def sqrt(n: Double) = {
        if (n >= 0) Some(math.sqrt(n))
        else None
    }

    def get: Option[Int] = Some(10)
}
