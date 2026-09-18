public class Calculator {
  private double num1;
  private double num2;

  //Default Constructor
  public Calculator(){
  num1 = 0;
  num2 = 0;
  }

  //Constructor with parameters
  public Calculator(double x, double y){
    num1 = x;
    num2 = y;
  }

  //Addition Constructor
  public double add(){
    return num1 + num2;
  }

  //Subtraction Constructor
  public double Subtract(){
    return num1 - num2;
  }

  //multiplication Constructor
  public double multiply(){
    return num1 * num2;
  }

  //division constructor
  public double division(){
    return num1 / num2;
  }
  //Power constructor
  public double power(){
    return Math.pow(num1, num2);
  }
  //absolute difference constructor
  public double absoluteDifference(){
    return Math.abs(num1) - Math.abs(num2);
  }
  //Square root of the sum constructor
  public double squareRootOfSum(){
    return Math.sqrt(num1 + num2);
  }
  //Random number between num1 and num2 constructor
  public int randomBetweenNums(){
    return (int)(Math.random()*(Math.max(num2, num1) - Math.min(num1, num2)));
  }
}
