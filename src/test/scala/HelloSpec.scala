import org.specs._
import org.specs.runner.JUnit4

object HelloSpec extends Specification {
  "message must be 'hello, world'" in {
    Hello.message must be("hello, world")
  }
}

class HelloTest extends JUnit4(HelloSpec)
