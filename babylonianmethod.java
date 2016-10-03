import java.util.Scanner;


public class babylonianmethod {
  
    public static void main(String[] args)
    {
        double result = getSqrt(Double.parseDouble(args[0]));
        //asks for user input
        System.out.println("Take the square root of: ");
        //prints result
        System.out.println("Answer: " + result);
    }
    
  public static double getSqrt(double number) {
    
    double error = 0;
    double x = number;
    
    while((x - number/x) > error){
      
      x = (x + number/x)/2;
      System.out.println(x);
      //prints error
      System.out.println("Error : " + (x - number/x));
      
    }
    
    System.out.println("Error : " + (x - number/x));
    return x;
    
  }
  
}
