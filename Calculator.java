import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the first number: ");
     double num1 = scanner.nextDouble();
     System.out.println("Enter the second number: ");
     double num2 = scanner.nextDouble();
     System.out.println("Enter operator: ");
     String operator = scanner.next();
     double result = 0.0;

    switch(operator){
        case "+":
          result = add(num1,num2);
          break;
        case "-":
          result = subtract(num1,num2);
          break;
        case "*":
          result = multiply(num1,num2);
          break;    
        case "/":
          result = divide(num1,num2);      
        default:
          System.out.println()                                                                            
    }
    System.out.println("Result: "+ result);

    }
    

    public static double add(double num1,double num2){
        return num1 + num2;
    }
      public static double subtract(double num1,double num2){
        return num1 - num2;
    }
      public static double divide(double num1,double num2){
        return num1 / num2;
    }
      public static double multiply(double num1,double num2){
        return num1 * num2;
    }
}