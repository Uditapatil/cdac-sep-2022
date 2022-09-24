import java.util.Scanner;
class Pallindrome
{
public static void main(String args[])
{
int num,r,t=0,flag;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a number");
num=sc.nextInt();
flag=num;
while(num>0)
{
r=num%10;
t=(t*10)+r;
num=num/10;
} 
if(flag==t)
System.out.println("Given number is a pallindrome number");
else
System.out.println("Given number is not a pallindrome number");
}
}