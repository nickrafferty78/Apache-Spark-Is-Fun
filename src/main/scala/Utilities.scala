
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.types.{ArrayType, DoubleType, IntegerType, LongType, StringType, StructField, StructType}
object Utilities {
  def setupLogging() = {
    Logger.getLogger("org.apache.spark").setLevel(Level.ERROR)
  }
  val instrumentReviewsSchema = StructType(Array(
    StructField("reviewerId", StringType, nullable = true),
    StructField("reviewerName", StringType, nullable = true),
    StructField("reviewText", StringType, nullable = true),
    StructField("overall", DoubleType, nullable = true),
    StructField("summary", StringType, nullable = true),
  ))

  /*
   * Write your Yelp Schema below
   */
}
