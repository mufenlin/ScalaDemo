package com.benchi.day06.pattern

/**
  * case People(name,age)
  * 找伴生对象的unapply方法拆解对象
  */
class People(val name: String, val age: Int)

object People {
    def unapply(pp: People): Option[(String, Int)] = {
        if (pp != null)
            Some(pp.name, pp.age) //Some((pp.name,pp.age))
        else None
    }
}

object ObjMatchDemo1 {
    def main(args: Array[String]): Unit = {
        val person = new People("逍遥子", 30)

        person match {
            case People(name, age) => println(name, age)
        }
    }
}
