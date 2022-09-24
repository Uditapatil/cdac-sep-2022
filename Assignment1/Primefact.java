import java.util.Scanner;
class Primefact
{
public static void main(String args[])
{
int x;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
x=sc.nextInt();
System.out.println("Prime factors of "+x+" are ");
for(int i=2;i<=x;i++)
{
while(x%i==0)
{
System.out.print(i+" ");
x=x/i;
}
}
}
}
