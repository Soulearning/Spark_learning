package input_or_output_learning

import java.io.{File, PrintWriter}

import org.mortbay.util.ajax.JSON.Source

import scala.io
import scala.io.StdIn

object stdInLearning {
  def apply(): Unit = {
    println("stdInLearning already executed!")
    println("-------------------------------")
  }

  /*println("输入你的名字：")
  var name =StdIn.readLine()
  println("输入你的年龄：")
  var age =StdIn.readInt()
  println(s"你的名字是：$name，年龄：$age")*/

  /**
   * read from file
   */
  //Source.fromFile("test_data/name.txt").foreach(print())
  /**
   * output to file，同java
   * 通过此种方法，若文件存在，则覆盖重写
   */
  private val writer = new PrintWriter(new File("test_data/name_out.txt"))
  writer.write("test output to name_out.txt")
  writer.close()
}
