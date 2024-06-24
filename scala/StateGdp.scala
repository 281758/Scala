import scala.io.Source

//states with higher gdp
// avg gdp per capita
//total gdp

object StateGdp {
  def main(args: Array[String]): Unit ={
    val filePath = "C:\\Users\\Administrator\\Downloads\\gdp.csv"
    //read file from path
    val source = Source.fromFile(filePath)

    for (line <- source.getLines()) {
      val columns = line.split(",")
      columns.foreach(println)
    }
    source.close()
  }

}
