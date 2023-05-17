//Write a program to calculate the sum of the digits of a 3-digit number.

import java.util.*;
class A
{
	int a,sum=0;
	int getValues(int x)
	{
	a=x;
		while(a>0)
		{
		sum = sum + a%10;
		a =a/10;
		}
	return sum;
	}
}

//Main Class
class Example13
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the number");
	int a=sc.nextInt();
	int result = obj.getValues(a);
	System.out.println("Sum is : " + result);
	}	
}



	