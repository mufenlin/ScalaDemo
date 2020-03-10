package com.benchi.day07.homework

object sum {
    def unpply(li: List[Option[Int]]) = {
        var sum = 0
        li.foreach(op => {
            if (op.isDefined) sum + op.get
        })
        sum
    }
}

object HomeWork {
    def main(args: Array[String]): Unit = {
        val lis = List(2, 30, 10, 40, 8)
        lis match {
            case _ =>
        }


    }
}
