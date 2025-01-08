import java.util.*;
import java.lang.*;
public class Volume{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the radius of the Cylinder");
  int r = sc.nextInt();
  System.out.println("Enter the height of the Cylinder");
  int h = sc.nextInt();
  System.out.println("The volume of the Cylinder is " + (Math.PI*((r*r)*h)));
  }
 }