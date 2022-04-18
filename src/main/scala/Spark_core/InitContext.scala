package Spark_core

import org.apache.spark.{SparkConf, SparkContext}

object InitContext {
  private var context: SparkContext =null

  /**
   * master is a Spark, Mesos or YARN cluster URL, or a special “local” string to run in local mode.
   * launch the application with spark-submit and receive it there.
   * @param master
   * @param name
   * @return
   */
  def getInit(master : String = "local[*]", name : String= "learning"): SparkContext ={
    this.synchronized{
      if(context==null) {
        context = new SparkContext(new SparkConf().setMaster(master).setAppName(name))
      }
      return context
    }
  }
}
