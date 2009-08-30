import scala.collection.mutable.Set

object MutableSet extends Application {
  val movieSet = Set("Hitch", "Poltergeist")
  movieSet += "Sherk"
  println(movieSet)
}

