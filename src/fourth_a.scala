

object fourth_a {
    
  def wage(hours:Int):Int = {
      hours * 250;
  }
  
  def ot(hours:Int):Int = {
      hours * 85;
  }
  
  def income(h1:Int, h2:Int):Int = {
      wage(h1) + ot(h2);
  }
  
  def tax(income:Int):Double = {
      income * .12;
  }
  
  def takeHome(h1:Int,h2:Int):Double = {
      income(h1,h2) - tax(income(h1,h2));
  }
  
  
  def main(args:Array[String]):Unit={
      println(takeHome(50,30));
  }
}


