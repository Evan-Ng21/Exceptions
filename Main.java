import java.util.Scanner;

class Main {
  static double fahrenheit;
  static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    
    System.out.println("World's Greatest Temperature Converter");
    inputFahrenheit(input);
    
    System.out.println("You entered " + fahrenheit + " degrees F");
    convertToCelsius(fahrenheit);
  }
  
  public static double inputFahrenheit(Scanner input){
    System.out.println("Enter a temperature in Fahrenheit: ");
      try{
        fahrenheit = input.nextDouble();
      } catch (Exception e) {
        System.out.print("Invalid Input. Please enter a number.");
      }
        return fahrenheit;
  }

  public static void convertToCelsius(double fahrenheit){
    double celsius = (fahrenheit - 32) * 5/9;
    System.out.println("That is " + celsius + " degrees C");
  }
}