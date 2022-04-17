package Spark_core

import org.apache.spark.{SparkConf, SparkContext}

object InitContext {
  private var context: SparkContext =null
  def getInit(master : String = "local[*]", name : String= "learning"): SparkContext ={
    this.synchronized{
      if(context==null) {
        context = new SparkContext(new SparkConf().setMaster(master).setAppName(name))
      }
      return context
    }
  }
}
