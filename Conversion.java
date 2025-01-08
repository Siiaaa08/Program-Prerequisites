import java.util.*;
public class Conversion{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Temperature in Celsius");
  double c = sc.nextInt();
  System.out.println("The temperature in Farenheit is " + ((c * 9/5) + 32));
  }
 } 