package FunctionalProg

object Main extends App {
  println("Beginning");

  //Tests de la partie fonctionnelle

  //Liste de nombre aléatoires
  val myList = List(2,4,7,1,9,4,978,1,74, 3,9,5,78,1)

  //filtrer sur la liste et ne garder que les nombres pairs
  val MyPairList = myList.filter(x => x % 2 == 0)

  println(MyPairList)

  // utiliser les fonctions en tant que valeur et y faire appel comme argument.
  val lambdaFunc : Int => Int = {
    value => {
      value*5
    }
  }
  val newListTimes5 = myList.map(lambdaFunc)

  println(newListTimes5)



}
