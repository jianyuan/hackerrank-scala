import java.io.ByteArrayInputStream

/**
 * Created by Jian Yuan on 12/7/2015.
 *
 * Challenge URL: https://www.hackerrank.com/challenges/string-compression
 */
object StringCompression extends App {

  object Solution {

    def compress(in: String): String = {
      def actualCompress(ls: List[Char]): List[Char] = ls match {
        case Nil => Nil
        case x :: xs =>
          val (y, ys) = xs.span(_ == x)
          if (y.nonEmpty) {
            x :: (y.length + 1).toString.toList ::: actualCompress(ys)
          }
          else {
            x :: actualCompress(xs)
          }
      }
      actualCompress(in.toList).mkString
    }

    def main(args: Array[String]) {
      val input = scala.io.StdIn.readLine()
      println(compress(input))
    }

  }

  val input = """aaabaaaaccaaaaba"""

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
