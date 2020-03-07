package com.benchi.day03.recursive

import scala.annotation.tailrec

/*
* @File:   RecursiveDemo1.scala
* @Author: IntelligenceBen
* @Description:递归
*   1).找到递归的算法
*     f(n) = n*f(n-1)
*   2).递归函数内部一定要有出口条件
* 尾递归:
*       scala会对递归进行一个优化,叫做尾递归,就不会出现stackOverFlowError;
*       在递归时,只有递归运算,不包含其他计算,n*factorial(n-1)不能称作尾递归;
*       scala做了优化(迭代算法),java没有;
*       选择合适的累加器
* @Date  18:14 2020/3/5
*/

object RecursiveDemo1 {
    def main(args: Array[String]): Unit = {
//        println(factorial(30))   //递归调用
        println(factorial(5,acc=1))   //尾递归调用   5 * 4 * 3 * 2
    }
    //"累加器"用来存储中间结果
    @tailrec   //递归调用的注解,检测是不是尾递归
    def factorial(n:Long,acc:Long):Long={
        if (n==1) acc
        else factorial(n-1,n*acc)
    }





    /*
     * @Description:递归计算阶乘
     * @Param:
     * @return:
     */
/*    def factorial(n:Long):Long={
        if (n ==1 ) throw new RuntimeException
        else n * factorial(n-1)
    }*/
}
