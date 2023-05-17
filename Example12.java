//- Swap two numbers without the use of third variable.

import java.util.*;
class A
{	
int a,b;
	void getValues(int x,int y)
	{
	a=x;
	b=y;
	System.out.println("Before Swapping a : " + a + " b :" + b);
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("After Swapping a : " + a + " b :" + b);
	}
}

//Main Class
class Example12
{
	public static void main(String args[])
	{
	int a,b;
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the two numbers :");
	a =sc.nextInt();
	b = sc.nextInt();
	obj.getValues(a,b);
	}
}
	