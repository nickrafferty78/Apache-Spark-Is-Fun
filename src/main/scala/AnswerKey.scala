import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.types.{DoubleType, IntegerType, LongType, StringType, StructField, StructType}
import Utilities._
object AnswerKey extends App{

  Utilities.setupLogging()

  /*
  Part 1 and 2
   */
  val yelpSchema = StructType(Array(
    StructField("name", StringType, nullable = true),
    StructField("city", StringType, nullable = true),
    StructField("stars", DoubleType, nullable = true),
    StructField("review_count", IntegerType, nullable = true),
    StructField("hours", StructType(
      Array(
        StructField("Monday", StringType),
        StructField("Tuesday", StringType),
        StructField("Wednesday", StringType),
        StructField("Thursday", StringType),
        StructField("Friday", StringType),
        StructField("Saturday", StringType),
        StructField("Sunday", StringType)
      )
    )),
  ))

  /*
 Part 3
  */
  val spark = SparkSession
    .builder()
    .appName("YelpReviews")
    .master("local[*]")
    .getOrCreate()

  /*
  Part 4
   */
  val yelpDF = spark.read
    .schema(yelpSchema)
    .format("json")
    .load("data/yelp.json")

  /*
  Part 5
   */
  yelpDF.show()
  yelpDF.printSchema()

}
