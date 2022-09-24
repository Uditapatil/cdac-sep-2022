import java.util.Scanner;
class Sum
{
public static void main(String args[])
{
int num,sum=0,x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
while(num>0)
{
x=num%10;
sum=sum+x;
num=num/10;
}
System.out.println("Sum of the digits of given no. is "+sum);
}
}