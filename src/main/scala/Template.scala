import java.io.ByteArrayInputStream

object Template extends App {

  object Solution {
    def main(args: Array[String]) {

    }
  }

  val input = """""".stripMargin

  System.setIn(new ByteArrayInputStream(input.getBytes))
  Solution.main(Array.empty)

}
