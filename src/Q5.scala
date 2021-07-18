import Q4._

object Q5 extends App {

  def sumEven(num:Int):Int= {
    if(num==1) {
      return 05
    } else if(Q4.isEven(num)) {
      return num+sumEven(num - 1)
    } else {
      sumEven(num - 1)
    }
  }

  print("Enter a Number:")
  var num = scala.io.StdIn.readInt()
  var evenSum = sumEven(num)
  print(evenSum)
}