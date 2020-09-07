import org.apache.spark.sql.SparkSession



object Tutorial extends App {

  Utilities.setupLogging()

  val spark = SparkSession
    .builder()
    .appName("InstrumentReviews")
    .master("local[*]")
    .getOrCreate()


  val firstDataFrame = spark
    .read
    .format("json")
    .option("inferSchema", "true")
    .load("data/InstrumentReviews.json")

  firstDataFrame.show()




}