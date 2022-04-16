package Spark_core

import org.apache.spark.{SparkConf, SparkContext}

class InitContext {

  //private  val context = null
  def getInit(master : String, name : String): SparkContext ={
    this.synchronized{
        val context = new SparkContext(new SparkConf().setMaster(master).setAppName(name))
      return context
    }
  }
}
