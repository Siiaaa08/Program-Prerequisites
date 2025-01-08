import java.util.*;
public class Average{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter First number");
  int a = sc.nextInt();
  System.out.println("Enter Second number");
  int b = sc.nextInt();
  System.out.println("Enter Third number");
  int c = sc.nextInt();
  System.out.println("The average of three numbers is " + ((a+b+c)/3));
  }
 }