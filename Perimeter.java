import java.util.*;
public class Perimeter{
  public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the length of a rectangle");
  int l = sc.nextInt();
  System.out.println("Enter the width of a rectangle");
  int w = sc.nextInt();
  System.out.println("The perimeter of a rectangle is " + (2*(l+w)));
  }
 }