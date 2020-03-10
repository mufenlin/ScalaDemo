package com.benchi.day06.sort

object SortDemo1 {
    def main(args: Array[String]): Unit = {
        val user1 = new User(10, "a")
        val user2 = new User(20, "b")

        println(user1 < user2)
        println(user1 > user2)

        /*        val li1 = List(50,40,70,90,10,25)
                //Ordering.Int.reverse  反转Int类型的比较器,(继承的IntOrdering特质实现了比较的方法)
                val li2 = li1.sorted(Ordering.Int.reverse)
                println(li2)*/
        val li1 = List(new User(10, "a"), new User(20, "b"), new User(20, "a"), new User(15, "c"))
        implicit val o: Ordering[User] = new Ordering[User] {
            override def compare(x: User, y: User): Int = {
                var a = x.age - y.age
                if (a == 0) a = -x.name.compare(y.name)
                a
            }
        }
        val li3 = li1.sorted
        println(li3)


    }
}

//不能比较两个值相等时
class User(val age: Int, val name: String) extends Ordered[User] {
    override def compare(that: User): Int = this.age - that.age

    override def toString: String = s"age:$age,name:$name"
}
