package Spark_core.external_datasets

import org.apache.spark.SparkContext
import org.apache.spark.rdd.RDD

object External_Datasets_Learning {
  def datesets(sc : SparkContext): RDD[String] ={
    /**
     * Spark can create distributed datasets from any storage source supported by Hadoop,
     * including your local file system, HDFS, Cassandra, HBase, Amazon S3, etc.
     * Text file RDDs can be created using SparkContext’s textFile method. This method
     * takes a URI for the file (either a local path on the machine,
     * or a hdfs://, s3a://, etc URI) and reads it as a collection of lines.
     */
    sc.textFile("test_data/name.txt")
  }
}
