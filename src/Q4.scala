object Q4 extends App {

  def isEven(num:Int):Boolean= {
    if(num%2==0) {
      return true
    }
    else {
      return false
    }
  }

  print("Enter a Number:")
  var num = scala.io.StdIn.readInt()
  var boolvalue = isEven(num)
  if(boolvalue) {
    print("Even")
  } else {
    print("Odd")
  }
}