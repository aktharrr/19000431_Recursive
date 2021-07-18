object Q1 extends App {

  def primeCheck(num:Int,numref:Int):Boolean= {
    if(num==numref||num==2) {
      true
    } else {
      if(num%numref==0) {
        false
      } else {
        primeCheck(num,numref+1)
      }
    }
  }


  def isPrime(number:Int):Boolean= {
    var isprimenum = primeCheck(number,2)
    isprimenum

  }

  print("Enter a Number:")
  var num = scala.io.StdIn.readInt()
  var booltype = isPrime(num)
  print(booltype)
}