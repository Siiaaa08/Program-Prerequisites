import java.util.*;
public class SimpleInterest{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter principle amount");
  int p = sc.nextInt();
  System.out.println("Enter Rate");
  int r = sc.nextInt();
  System.out.println("Enter Time");
  int t = sc.nextInt();
  System.out.println("Simple Interest is " + ((p*r*t)/100));
  }
 }