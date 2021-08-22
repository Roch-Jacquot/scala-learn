//Copied Online

//increment
val increment : Int => Int = {
  x => {
    val result = x + 1
    result
  }
}

increment(5)

val multiply = {
  (x: Int, y: Int) => {x * y}
}

multiply(21,increment(1))