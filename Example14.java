/*Assign values of variables 'a' and 'b' as 55 and 70 respectively and then check if:
i) both the conditions 'a < 50' and 'a < b' are true.
ii) at least one of the conditions 'a < 50' or 'a < b' is true. */

/*import java.util.*;
class A
{
int a,b;
boolean b1 = true;
boolean b2 = false;
	boolean getValues(int x, int y)
	{
	a=x;
	b=y;
	//conditional Statement
	if(a<50 && a <b)
	{
	return b2;
	}
	else if(a<50 || a<b) 
	{
	return b1;
	}
	return false;
	}
}	
//main class
class Example14
{
	public static void main(String args[])
	{
	int a,b;
	boolean result;
	Scanner sc = new Scanner(System.in);
	A obj = new A();
	System.out.println("Enter the values of a and b : ");
	a = sc.nextInt();
	b = sc.nextInt();
	result = obj.getValues(a,b);
	System.out.println("Result is " + result);
	}
}*/
//Another Method
import java.util.Scanner;

class A {
    int a, b;

    void checkConditions(int x, int y) {
        a = x;
        b = y;

        // Check if both conditions are true
        boolean condition1 = a < 50;
        boolean condition2 = a < b;

        System.out.println("Condition 1 (a < 50): " + condition1);
        System.out.println("Condition 2 (a < b): " + condition2);
        
        // Check if at least one of the conditions is true
        boolean atLeastOneCondition = condition1 || condition2;

        System.out.println("At least one condition is true: " + atLeastOneCondition);
    }
}

class Example14 {
    public static void main(String args[]) {
        int a = 55, b = 70;
        A obj = new A();
        obj.checkConditions(a, b);
    }
}
