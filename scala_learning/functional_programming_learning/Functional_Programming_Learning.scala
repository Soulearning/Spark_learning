package functional_programming_learning

/**
 * 函数式编程：不可变性
 */

object Functional_Programming_Learning {
  def apply(): Unit = {
    funcExample(2, 4)
    example()
    println("Functional_Programming_Learning already executed!")
    println("-------------------------------")
  }

  /**
   * 方法：类中的函数称之为方法，如apply()
   */

  /**
   * 函数基本语法
   * 一段代码块以完成某一功能，没有重载和覆盖的特性
   *
   * @param x
   * @param y
   * @return Int
   */
  def funcExample(x: Int, y: Int): Int = {
    def funcTest(): Unit = {
      println("这是一个函数！")
    }

    funcTest()
    Functional_Programming_Learning.funcTest()

    /**
     * 1、可变参数函数，多参情况下，可变参数至于最后
     * 2、参数默认值，一般将有默认值的参数列表放置在参数列表的后面
     * 3、带名参数
     * 注意：1和2不可同时存在
     */
    def paramChange(f: String, s: String*): Unit = {
      println(f + " : " + s)
    }

    paramChange("name", "cxw", "zhangsan")

    def paramDefault(name: String, describe: String = "这是一个测试参数默认值和带名参数的函数！"): Unit = {
      printf(s"${describe}, name = $name\n")
    }

    paramDefault("wangmazi")

    /**
     * 函数至简原则
     * 1、可省略return
     * 2、一行逻辑代码可省略{}
     * 3、返回值类型可推断，：和返回值类型可省略，若有return，则必须指定返回值类型，但是如果函数明确
     * 声明unit，那么return无效
     * 4、如果期望无返回值，可以省略等号
     * 5、无参构造，()可省略，但调用必须加上
     * 6、不关心名称，def 也可shengl
     */
    //完整函数
    def func(): Int = {
      println("这是一个完整函数")
      0
    }

    func()

    //最简函数,即匿名函数
    val noname = (name: String) => {
      println(s"这是一个最简函数！${name}")
    }
    noname("test")

    //使用场景，以函数作为参数，数据已经确定
    def f(func: String => Unit): Unit = {
      func("函数做参")
    }
    //f((name:String) => { println(s"这是一个最简函数！${name}\n") }) == f(noname)
    f(noname)

    /**
     * 匿名函数简化
     * f((name:String) => { println(name) })
     * 1、参数类型可省略
     * f((name) => { println(name) })
     * 2、有且仅有一个参数,()可省略
     * f(name => { println(name) })
     * 3、函数体只有一行，{}可省略
     * f(name =>  println(name) )
     * 4、参数只出现一次，参数可省略，=>也可省略，后面可用_代替
     * f(println(_) )
     * 5、若推断出，当前传入的println是一个函数体，而不是调用语句，可以省略_
     * f(println() )
     */
    f(println(_))
    //eg：

    def test(f: (Int, Int) => Int): Int = {
      f(1, 2)
    }
    //test((x：Int,y：Int) => {x+y})
    println("匿名函数 x+y : " + test((x, y) => x + y))
    println("匿名函数 x*y : " + test(_ * _))

    /**
     * 高阶函数
     * 1、函数可以作为参数，值，返回值
     */
    var funcAsValue = func _
    var funcAsValue1: () => Unit = func
    println("函数作值: " + funcAsValue)
    println("函数作值: " + funcAsValue())
    println("函数作值: " + funcAsValue1)
    println("函数作值: " + funcAsValue1())

    def dualEval(op : (Int,Int) => Int,a: Int,b: Int): Int ={
      op(a,b)
    }
    println("函数作参: "+dualEval(_/_ , 10, 10))

    x + y
  }

  def funcTest(): Unit = {
    println("这是一个方法！")
  }


  def example(): Unit ={
    val fun = (a : Int,b:String,c : Char)=> if (a==0 && b=="" && c =='0') return false else true
    println(fun(0,"",'0'))

    def func(a:Int): String=>(Char=>Boolean) ={
      def f1(b: String):Char=>Boolean={
        def f2(c:Char):Boolean={
          if (a==0 && b=="" && c =='0') false else true
        }
        f2
      }
      f1
    }
    println(func(0)("")('0'))
    //func简写
    def funcSimple(a:Int): String=>(Char=>Boolean) ={
      b=>c=>if (a==0 && b=="" && c =='0') false else true
    }
    println(funcSimple(0)("")('0'))

    //柯里化
    def funcKeLi(a:Int)(b: String)(c:Char):Boolean={
      if (a==0 && b=="" && c =='0') false else true
    }
    println(funcKeLi(0)("")('0'))
  }

}