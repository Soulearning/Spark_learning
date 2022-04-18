package Spark_core.parallelized

import org.apache.spark.SparkContext

object Parallelized_Collections_Learning {
  def setParallelize(sc : SparkContext): Unit ={
    var data = Array(1,2,3,4,5)
    //Spark tries to set the number of partitions automatically based on your cluster
    val distDataDefault = sc.parallelize(data)
    //set it manually by passing it as a second parameter to parallelize
    val distData = sc.parallelize(data,3)
    return distData
  }
}
