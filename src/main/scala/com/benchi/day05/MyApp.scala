package com.benchi.day05

class MyApp {
    def myPrint(any: Traversable[_]): Unit = {
        println(any.mkString(","))
    }
}
