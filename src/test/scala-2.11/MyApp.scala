package com.jamiom
import org.apache.spark.sql.SparkSession

import scala.language.postfixOps


/**
  * Created by mateusz on 12.10.16.
  */
object MyApp extends App{

  val spark = SparkSession.builder().master("local").getOrCreate()
  spark.experimental.extraOptimizations = Vector(new MySuperRule())

  import spark.implicits._

  val numbersDS = 1.to(10).toDS;

  numbersDS.map(_*2).explain(true)
}
