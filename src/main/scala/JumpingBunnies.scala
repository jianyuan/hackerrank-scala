import java.io.ByteArrayInputStream

/**
 * Created by Jian Yuan on 12/7/2015.
 *
 * Challenge URL: https://www.hackerrank.com/challenges/jumping-bunnies
 */
object JumpingBunnies extends App {

  object Solution {

    def gcd(a: Long, b: Long): Long = if (b == 0) a.abs else gcd(b, a % b)

    def lcm(a: Long, b: Long): Long = (a / gcd(a, b)).abs * b

    def main(args: Array[String]) {
      val n: Int = scala.io.StdIn.readInt()
      val js: List[Long] = scala.io.StdIn.readLine().split(' ').map(_.toLong).toList
      assert(js.length == n)
      println(js.reduceLeft(lcm))
    }

  }

  val input =
    """3
      |2 3 4""".stripMargin

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
