import java.util.Scanner;
class input
{
public static void main(String args[])
{
Scanner obj= new Scanner(System.in);
int month;
System.out.println("enter month");
month=obj.nextInt();
switch(month)
{
case 1:
System.out.println("january");
break;
case 2:
System.out.println("February");
break;
case 3:
System.out.println("March");
break;
case 4:
System.out.println("April");
break;
case 5:
System.out.println("may");
break;
case 6:
System.out.println("june");
break;
case 7:
System.out.println("july");
break;
case 8:
System.out.println("august");
break;
case 9:
System.out.println("september");
break;
case 10:
System.out.println("october");
break;
case 11:
System.out.println("november");
break;
case 12:
System.out.println("december");
break;
default:
System.out.println("Invalid month");
}
}
}
