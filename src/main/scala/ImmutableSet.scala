object ImmutableSet extends Application {
  var jetSet = Set("Boeing", "Airbus")
    jetSet += "Lear"
  println(jetSet.contains("Cessna"))
}
