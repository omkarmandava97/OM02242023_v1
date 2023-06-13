package org.sageit.bigdata

import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.types
import org.apache.spark.sql.catalyst.ScalaReflection.universe.show
object OMObj {

  def main(args: Array[String]) {
    println("Hello Scala")

    val spark = SparkSession.builder().master(master = "local[*]").appName(name= "Spark-Example").getOrCreate()
    val df= spark.read.csv("/Users/omkarchowdarymandava/Downloads/username.csv")
    println(spark.sparkContext.appName)
    println(spark.sparkContext.applicationId)
    df.show()
    spark.stop()

  }
}