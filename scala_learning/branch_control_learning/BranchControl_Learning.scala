package branch_control_learning

import scala.util.control.Breaks


object BranchControl_Learning {
  var age : Int = 0

  def apply(age: Int): Unit = {
    this.age = age
    println("调用if循环")
    ifControl()
    println("调用for循环")
    forControl()
    println("调用循环中断")
    interruptControl()
    println("BranchControl_Learning already executed!")
    println("-------------------------------")
  }

  /**
   * if 同java
   */
  def ifControl(): Any ={
    val result : Any = if(age<=60){
      if(age<=16) {
        if (age <= 10) "童年" else "少年"
      }else{
        if (age <= 35) "青年" else "中年"
      }
    }else {
      if(age<=150){
        "老年"
      }else{
        throw new Exception("非法年龄！请火化")
      }
    }
    println(result)
  }

  /**
   * for
   *
   */
  def forControl(): Unit ={
    //1、范围遍历
    for(i <- 1 to 5){
      print(i+" ")
    }
    println()
    //2：遍历步长为2，且不包含最后一个数字，不传参，则默认为0
    for(i <- Range(1,5,2)){
      print(i+" ")
    }
    println()
    //不包含最后一个数字
    for(i <- -1 until 5){
      print(i+" ")
    }
    println()

    //集合遍历
    //[Array],[List],[Set]
    for(i <- Array(12,13,14)){
      print(i+" ")
    }
    println()

    //循环守卫
    println("1 to 10 , 输出偶数")
    for(i<- 1 to 10 if(i%2==0 && i > 1)){
      print(i+" ")
    }
    println()

    //循环步长
    println("1 to 10 , 步长为 2 且 * 2")
    var result = for(i<- 1 to 10 by 2) yield i*2
    println(result)
  }

  /**
   * while ：同java
   *
   */
  def whileControl(): Unit ={
    // 没有返回值且需外部定义变量，scala不建议使用
  }

  /**
   * 循环中断
   */
  def interruptControl(): Unit ={
    println("1 to 10 , 大于 5 时结束循环")
    Breaks.breakable(
      for (i <- 1 to 10 ){
        if(i>5){
          Breaks.break()
        }
        print(i+" ")
      }
    )
    println()
  }
}
