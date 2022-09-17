import Calc.*;
import java.util.Scanner;
public class Calcmain {
public static void main(String[] args) {
sum a=new sum();
minus b=new minus();
multi c=new multi();
division d=new division();
Scanner sc=new Scanner(System.in);
System.out.println("please enter first number");
float x= sc.nextFloat();
System.out.println("please enter second number");
float y= sc.nextFloat();
System.out.println("Write sum=1 , multi=2 , division=3, minus=4");
int s= sc.nextInt();
switch (s)
{
case 1:
{
System.out.println("your sum is "+a.sum(x,y));
break;
}
case 2:
{
System.out.println("your multi is "+c.multi(x,y));
break;
}
case 3:
{
System.out.println("your division is "+d.division(x,y));
break;
}
case 4:
{
System.out.println("your minus is "+b.minus(x,y));
break;
}
}
}
}