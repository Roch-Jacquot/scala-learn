package calculator

enum CalculationType:
  case multiply, add, substract, divide

case class CalculatingFunctions() {

  //calculationType : CalculationType, firstNumber : Double, secondNumber : Double
  def calculate(calculationType : CalculationType, firstNumber : Double, secondNumber : Double) : Double = {
    calculationType match
      case CalculationType.multiply => multiplication(firstNumber, secondNumber);
      case CalculationType.add => addition(firstNumber, secondNumber);
      case CalculationType.substract => substraction(firstNumber, secondNumber);
      case CalculationType.divide => division(firstNumber, secondNumber);
  }

  def multiplication(firstNum: Double, secondNum: Double) : Double = {
    return firstNum*secondNum;
  }
  def addition(firstNum: Double, secondNum: Double) : Double = {
    return firstNum+secondNum;
  }
  def substraction(firstNum: Double, secondNum: Double) : Double = {
    return firstNum-secondNum;
  }
  def division(firstNum: Double, secondNum: Double) : Double = {
    return firstNum/secondNum;
  }

}
