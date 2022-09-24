import java.util.Scanner;
class GCD
{
public static void main(String args[])
{
int x,y,g=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
x=sc.nextInt();
y=sc.nextInt();
for(int fact=1;fact<=x&&fact<=y;fact++)
{
if(x%fact==0&&y%fact==0)
g=fact;
}
System.out.println("GCD of "+x+" and "+y+" is "+g);
}
}

