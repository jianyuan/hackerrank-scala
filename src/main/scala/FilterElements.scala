import java.io.ByteArrayInputStream

/**
 * Created by jianyuan on 06/12/15.
 *
 * Challenge URL: https://www.hackerrank.com/challenges/filter-elements
 */
object FilterElements extends App {

  import scala.io.StdIn

  object Solution {
    def main(args: Array[String]) {
      val t = StdIn.readInt()
      for (_ <- 0 until t) {
        val Array(n, k) = StdIn.readLine().split(' ').map(_.toInt)
        val a = StdIn.readLine().split(' ').map(_.toInt)
        assert(a.length == n)

        val frequencies = collection.mutable.LinkedHashMap.empty[Int, Int] withDefaultValue 0
        a.foreach(frequencies(_) += 1)

        val answer = frequencies.filter(_._2 >= k).keys
        if (answer.nonEmpty) {
          println(answer.mkString(" "))
        } else {
          println(-1)
        }
      }
    }
  }

  val input =
    """3
      |9 2
      |4 5 2 5 4 3 1 3 4
      |9 4
      |4 5 2 5 4 3 1 3 4
      |10 2
      |5 4 3 2 1 1 2 3 4 5""".stripMargin

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
