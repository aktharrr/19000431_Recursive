object Q3 extends App {
  def addNumber(num:Int):Int= {
    if(num == 1)
    {
      return 1
    }
    else
    {
      return num + addNumber(num - 1)
    }
  }


  print("Enter a Number:")
  var num = scala.io.StdIn.readInt()
  var sum = addNumber(num)
  print(sum)
}