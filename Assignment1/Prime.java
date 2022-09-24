import java.util.Scanner;
class Prime
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int num=sc.nextInt();
  int flag=0;
  int t;
  for(t=1;t<=num;t++)
 {
  if(num%t==0) 
  {
   flag++;
  }
  }
  if(flag==2)
  {
  System.out.println("Number is prime number");
  }
  else
  {
  System.out.println("Number is not prime number");
  }
 }  
 }