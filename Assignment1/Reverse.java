import java.util.Scanner;
class Reverse
{
public static void main(String args[])
{
int num,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
System.out.println("Reverse of given no. is");
while(num>0)
{
i=num%10;
System.out.print(i);
num=num/10;
}
}
}