import Spark_core.InitContext
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object core_begin {
  /**
   * shell submit
   *  1、./bin/spark-shell --master local[4]
   *   to also add code.jar to its classpath
   *  2、./bin/spark-shell --master local[4] --jars code.jar
   *  To include a dependency using Maven coordinates
   *  3、./bin/spark-shell --master local[4] --packages "org.example:example:0.1"
   */
  def main(): Unit ={
    val context: SparkContext = InitContext.getInit()
    val read: RDD[String] = context.addFile("test_data/name.txt")
    val strings = read.collect()
    println(strings)
    context.stop()
  }
}
