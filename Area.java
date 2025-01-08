import java.util.*;
import java.lang.*;
public class Area{
  public static void main(String [] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius of circle");
  int r = sc.nextInt();
  System.out.println("The Area of a circle is " + (Math.PI*(r*r)));
  }
 }