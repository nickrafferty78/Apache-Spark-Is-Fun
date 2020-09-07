import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.functions._
import org.apache.log4j.{Level, Logger}
import org.apache.spark.sql.types.LongType
import Utilities._

object ExerciseOne extends App{

  Utilities.setupLogging()

  /*
  Part 1: Go to data/yelp.json and start to understand the structure of the JSON file coming in.
   */

  /*
  Part 2: In Utilities.scala, write a schema for  yelp.json. You'll have a challenge that we haven't
  gone over yet with objects inside of a JSON field. I encourage you to research what that will look like.
   */

  /*
  Part 3: Create a spark session. You are welcome to call this whatever you like. In my solution I will call it "YelpReviews"
   */

  /*
  Part 4: Read the DataFrame from the data/yelp.json file. Make sure to include the schema you wrote in #2.
   */

  /*
  Part 5: Show and print schema for the DataFrame you wrote.
   */
}
