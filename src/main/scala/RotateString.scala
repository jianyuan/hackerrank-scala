import java.io.ByteArrayInputStream

/**
 * Created by Jian Yuan on 12/7/2015.
 *
 * Challenge URL: https://www.hackerrank.com/challenges/rotate-string
 */
object RotateString extends App {

  object Solution {

    def rotations(s: String): List[String] = {
      val ls = s.toList
      (1 to ls.length).map(n => ((ls drop n) ::: (ls take n)).mkString).toList
    }

    def main(args: Array[String]): Unit = {
      val t = scala.io.StdIn.readInt()
      for (_ <- 0 until t) println(rotations(scala.io.StdIn.readLine()).mkString(" "))
    }

  }

  val input =
    """5
      |abc
      |abcde
      |abab
      |aaa
      |z""".stripMargin

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
