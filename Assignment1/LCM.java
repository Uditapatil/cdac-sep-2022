import java.util.Scanner;
class LCM
{
public static void main(String args[])
{
int x,y,g=1,l=1;
Scanner sc=new Scanner(System.in);
System.out.println("Enter two numbers");
x=sc.nextInt();
y=sc.nextInt();
for(int fact=1;fact<=x&&fact<=y;fact++)
{
if(x%fact==0&&y%fact==0)
g=fact;
}
l=(x*y)/g;
System.out.println("LCM of "+x+" and "+y+" is "+l);
}
}

