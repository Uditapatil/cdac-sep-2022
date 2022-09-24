import java.util.Scanner;
class Factor
{
public static void main(String args[])
{
int num,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
System.out.println("factors of given number are");
for(i=1;i<=num;i++)
{
 if(num%i==0)
 System.out.println(i);
}
}
}