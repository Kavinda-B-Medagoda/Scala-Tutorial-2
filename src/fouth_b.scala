

object fouth_b {
  
  
  def attendance(price:Int):Int = {
    120+ (15-price)/5*20;
  }
  
  def revenue(price:Int):Int ={
    attendance(price) * price;
  }
  
  def cost(price:Int):Int ={
     500 + attendance(price) * 3;
  }
  
  def profit(price:Int):Int = {
    revenue(price) - cost(price);
  }
  
  
  def main(args:Array[String]):Unit = {
    
    println(profit(10));
  }
}
