import java.util.Scanner;
class Factorial1
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a whole number");
  int num=sc.nextInt();
  Factorial1 n=new Factorial1();
  int fact=n.calculate(num);
  System.out.println("Factorial of a no is "+fact);
 } 
  int calculate(int num)
 {
   if(num>=1)
   return num*calculate(num-1);
   else
   return(1);
 }
}