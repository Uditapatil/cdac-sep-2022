import java.util.Scanner;
class Digit
{
public static void main(String args[])
{
int num,d;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
System.out.println("Digits of no. are");
while(num>0)
{
d=num%10;
System.out.println(d);
num=num/10;
}
}
}





