import Q1._

object Q2 extends App {
  def printPrime(num:Int) {
    printPrimeUtil(num,1)
  }

  def printPrimeUtil(num:Int,numRef:Int) {
    if(num+1==numRef){
      return
    } else if(Q1.isPrime(numRef)) {
      println(numRef)
    }
    printPrimeUtil(num,numRef+1)

  }

  print("Enter a Number:")
  var num = scala.io.StdIn.readInt()
  printPrime(num)

}