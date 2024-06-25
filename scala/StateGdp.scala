import scala.io.Source

//states with higher gdp
// avg gdp per capita
//total gdp
import scala.io.Source
object StateGdp {
  def main(args: Array[String]): Unit ={
    val filePath = "C:\\Users\\Administrator\\Downloads\\Scala\\StatewiseGDP.csv"

    //read file from path
    val source = Source.fromFile(filePath)
    val lines = source.getLines().drop(1) //skip header

    var maxGDP = 0.0
    var stateWithMaxGDP = ""
    var totalGDP = 0.0
    var totalPerCapitaIncome = 0.0
    var count = 0

    // Process each line
    lines.foreach { line =>
      val cols = line.split(",")

      //columns are in order: State, GDP, Per Capita Income
      val state = cols(0)
      val gdp = cols(1).toFloat
      val perCapitaIncome = cols(2).toFloat

      // Find state with highest GDP contribution
      if (gdp > maxGDP) {
        maxGDP = gdp
        stateWithMaxGDP = state
      }

      // Calculate total GDP and total per capita income
      totalGDP += gdp
      totalPerCapitaIncome += perCapitaIncome

      // Increment count
      count += 1
    }

    // Calculate average GDP per capita
    val averageGDPPerCapita = totalPerCapitaIncome / count

    // Close the file
    source.close()

    println(s"State with highest GDP contribution: $stateWithMaxGDP")
    println(s"Average GDP per capita: $averageGDPPerCapita")
    println(s"Total GDP: $totalGDP")


  }
}