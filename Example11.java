/*Q1 - Write a program to add 8 to the number x and then divide it by 3. Now, the modulus of the quotient
 is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

import java.util.*;
class A
{
int a,add,mod,mul,quo,finalresult;
	int getValue(int x)
	{
	a=x;
	add = a + 8;
	//System.out.println("Addition is : " + add);
	quo = add/3;
	//System.out.println("Quotient is : " + quo);
	mod = quo%5;
	//System.out.println("Modules is : " + mod);
	mul = mod * 5;
	//System.out.println("Multiplication is : " + mul);
	finalresult = mul;
	return finalresult;
	}
}

//Main class
class Example11
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the Number : ");
	int a = sc.nextInt();
	int result = obj.getValue(a);
	System.out.println("The Final Answer is :" + result);
	}
}

