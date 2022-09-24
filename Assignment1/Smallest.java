import java.util.Scanner;
class Smallest
{
public static void main(String args[])
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter 3 numbers");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a<b)&&(a<c))
{
System.out.println("Smallest number is "+a); 
}
else if(b<c)
{
System.out.println("Smallest number is  "+b);
}
else
System.out.println("Smallest number is  "+c);
}
}
