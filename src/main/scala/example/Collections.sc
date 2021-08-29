
import scala.collection.mutable

val buffer = mutable.ArrayBuffer()

List.empty[Int]

mutable.ArrayBuffer.empty[Double]
Map.empty[String, Boolean]


val tuple1: (Int, String, Boolean) =(42, "Hello", true)

println(tuple1)

0 +: List(1,2,3)
mutable.ArrayBuffer("a", "b") :+ "c"

Map("a" -> 1, "b" -> 2)
Map("b" -> 2) + ("a" -> 1)
Map("a" -> 2, "b" -> 1)
Map.empty[String, Int] + ("a" -> 1) + ("b" -> 2)
Map("a" -> 1) + ("b" -> 2)

val result = euclideanDivision(10, 3)
