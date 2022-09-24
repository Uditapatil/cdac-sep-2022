import java.util.Scanner;
class Pos
{
 public static void main(String args[])
 {
  int num;
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  num=sc.nextInt();
  if(num==0)
  {
   System.out.println("Number is neither positive nor negative");
  }
  else if(num>0)
  {
   System.out.println("Number is positive");
  }
  else
  {
   System.out.println("Number is negative");
  }
 }
 }