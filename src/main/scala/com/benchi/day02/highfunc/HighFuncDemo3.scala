package com.benchi.day02.highfunc

/**
  * 常用的高阶函数
  * foreach: 遍历集合中的每个元素,具体遍历到每个元素时,做什么事由调用者函数实现
  * filter:过滤,过滤条件可以通过一个返回Boolean的函数体现
  * map: 映射,一进一出
  * reducer: 聚合操作
  * 快捷键: alt + ctrl + L
  **/
object HighFuncDemo3 {
  def main(args: Array[String]): Unit = {
    val arr1 = Array(10, 20, 80, 33, 27, 18)
    //第一种写法
/*    foreach(arr1, a => {
      println(a)
    })*/
   //def println(x: Any) = Console.println(x)
//    foreach(arr1,println)

//    val array2=filter(arr1,x => x % 2 == 0)
//    val array2 = filter(arr1, _ >25)  // 等价于 filter(arr1,x => x >25)

//    val array2 = map(arr1,x => x * x *x)
    val result = reduce(arr1,(x,y) => x*y)
    println(result)
    println(arr1.sum)
//    foreach(array2,println)

  }
  /*
   * @Description: 对数组进行聚合操作
   * @Param:op(c1,c2) => r
   *        ci表示上一次聚合的结果,c2表示当前聚合操作参与的元素
   * @return:
   */
  def reduce(arr:Array[Int],op:(Int,Int) => Int)={
    var lastReduce = arr(0)
    for(i <- 1 until arr.length){
      lastReduce = op(lastReduce,arr(i))
    }
    lastReduce
  }


  /* *
    @Description: 使用map对数组里的元素进行立方操作然后输出
   * @Param:
   * @return:
   */
  def map(arr:Array[Int],op:Int => Int) ={
    for(elm <- arr) yield op(elm)
  }

  /* *
  使用给定的条件对数组进行过滤,
   *@Description:
   * @Param: arr
   * @return: condition   过滤条件,true的留下
   */
  def filter(arr:Array[Int],condition:Int => Boolean) ={
    //通过一个数组,得到一个新数组 for推导
    for(elm <- arr if condition(elm)) yield elm
  }

  /**
    * 遍历数组的高阶函数
    * */
  def foreach(arr: Array[Int], op: (Int) => Unit) = {
      for(elem <- arr){
        op(elem)
      }
  }

}
