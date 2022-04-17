package var_learning

object Vars_Learning {
  def apply(): Unit = {
    println("Vars_Learning already executed!")
    println("-------------------------------")
  }

  /**
   * var:变量，必须初始化
   * val:常量，必须初始化，值不可变
   */
  var a: Int = 10
  val b: Int = 10
  var c = 20
  val d = 30
  println(a)
  println(d)

  var name: String = "zhangsan"
  println("名字：" + name)
  printf("名字：%s\n", name)
  printf("名字*2：%s\n", name * 2)
  println(s"名字：$name")

  /**
   * 一切数据都是对象，都是Any的子类：
   * 1、AnyVal
   * -->表示向上转型对象，且全部类型统一继承于AnyVal
   * 1、Byte-->Short-->Int-->Long-->Float-->Double
   * 2、Char-->Int
   * 3、Boolean
   * 4、StringOp：对与Java String的一种增强
   * 5、Unit：是一个数据类型，只有一个对象()，对应Java void
   * 2、AnyRef
   * Null：是一个类型，只有一个对象null,所有AnyRef的子类
   * 1、Scala collections
   * 2、all java classes
   * 3、Other Scala classes
   * 注：Nothing表示所有数据类型的子类，主要用于一个函数没有明确的返回值时使用。
   *
   * 隐式类型转换：
   * 1、自动提升，多类型数据计算，首先将所有数据转换为精度最大的那一种
   * 2、高转低会报错
   * 强制类型转换：
   * 直接取整
   *    value.to[Type]
   * eg:
   * var b: float =2.5
   * var i: Int = b.toInt
   */
  val s: String = "34"
  println("s : String = \\\"34\\\" 转 Int = ", s.toInt)

}
