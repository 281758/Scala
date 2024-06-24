import scala.io.Source

object FileAnalysis {
  def main(args: Array[String]): Unit ={
    val filePath = "C:\\Users\\Administrator\\Documents\\new_file.txt"
    //read file from path
    val source = Source.fromFile(filePath)
    //read all lines from the file
    val lines = source.getLines().toList
    source.close()

    //count words
    val words = lines.flatMap(_.split("\\s+")).map(_.toLowerCase)
    //get most frequent word count
    val groupedWords = words.groupBy(identity)
    val wordCount = groupedWords.mapValues(_.size).toSeq.sortBy(-_._2)
    wordCount.take(10).foreach{case(word, count) => println(s"$word: $count")

    }

    //average word length
    val totalWords = words.length
    val totalChars = words.map(_.length).sum
    val avgWordLength = if (totalWords > 0) totalChars.toDouble/totalWords else 0.0
    println(avgWordLength)

    


  }

}
