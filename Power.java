import java.util.*;
import java.lang.*;
public class Power{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First Number");
  int a = sc.nextInt();
  System.out.println("Enter Second Number");
  int b = sc.nextInt();
  System.out.println("Power calculation is " + (int)Math.pow(a,b));
  }
 }