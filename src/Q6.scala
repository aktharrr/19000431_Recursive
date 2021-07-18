object Q6 extends App {

  def fibonacci(num:Int):Int= {
    if(num == 0) {
      return 0
    } else if(num == 1 || num == 2) {
      return 1
    } else {
      return fibonacci(num - 2)+fibonacci(num - 1)
    }

  }

  print("Enter the number:")
  var num = scala.io.StdIn.readInt()

  for(a <- 0 until num)
  {
    print(fibonacci(a)+" ");
  }

}