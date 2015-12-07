import java.io.ByteArrayInputStream

/**
 * Created by Jian Yuan on 12/7/2015.
 *
 * Challenge URL: https://www.hackerrank.com/challenges/prefix-compression
 */
object PrefixCompression extends App {

  object Solution {
    def main(args: Array[String]) {
      val x = scala.io.StdIn.readLine()
      val y = scala.io.StdIn.readLine()
      val longestPrefix: String = x.zip(y).takeWhile { case (a, b) => a == b }.map(_._1).mkString
      println(s"${longestPrefix.length} $longestPrefix")
      val xAfter = x.substring(longestPrefix.length)
      println(s"${xAfter.length} $xAfter")
      val yAfter = y.substring(longestPrefix.length)
      println(s"${yAfter.length} $yAfter")
    }
  }

  val input =
    """abcdefpr
      |abcpqr""".stripMargin

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
