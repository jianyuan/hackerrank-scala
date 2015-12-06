import java.io.ByteArrayInputStream

/**
 * Created by jianyuan on 06/12/15.
 *
 * Challenge URL: https://www.hackerrank.com/challenges/super-digit
 */
object SuperDigit extends App {

  import scala.annotation.tailrec
  import scala.io.StdIn

  object Solution {
    @tailrec
    def superDigit(n: String, k: Long): Int = {
      if (n.length == 1) {
        n.toInt
      } else {
        superDigit((k * n.foldLeft(0)((sum, digit) => sum + digit.asDigit)).toString, 1)
      }
    }

    def main(args: Array[String]) {
      val Array(n, k) = StdIn.readLine().split(' ')
      println(superDigit(n, k.toLong))
    }
  }

  val input = """148 3"""

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
