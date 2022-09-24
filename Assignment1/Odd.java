import java.util.Scanner;
class Odd
{
public static void main(String args[])
{
int i=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a no. upto which we have to print");
int num=sc.nextInt();
System.out.println("Odd number series :");
while(i<=num)
{
System.out.print(i+" ");
i=i+2;
}
}
}