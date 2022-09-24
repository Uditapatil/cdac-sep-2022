import java.util.Scanner;
class Swap
{
 public static void main(String args[])
 {
  int a,b;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter two numbers a=");
  a=sc.nextInt();
  System.out.print("and b=");
  b=sc.nextInt();
  a=a+b;
  b=a-b;
  a=a-b;
  System.out.println("Two numbers are a="+a+" and b="+b);
  }
}