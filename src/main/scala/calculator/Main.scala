package calculator
import calculator.CalculatingFunctions

object Main extends App {

  val myCalculator : CalculatingFunctions = new CalculatingFunctions()

  println(myCalculator.calculate(CalculationType.add, 40, 2))
  println(myCalculator.calculate(CalculationType.divide, 666, 3.3))
  println(myCalculator.calculate(CalculationType.substract, 36, 79))

}

