import Spark_core.InitContext
import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object main {
  def main(): Unit ={
    val context: SparkContext = InitContext.getInit()
    val read: RDD[String] = context.addFile("test_data/name.txt")
    val strings = read.collect()
    println(strings)
    context.stop()
  }
}
