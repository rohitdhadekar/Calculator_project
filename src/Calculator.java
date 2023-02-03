import java.util.Scanner;

public class Calculator {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		avg(10,20,30,40,50,60);
		div(10,20);

	}
	
	//Var-arg method
	public static void sum(int... x)
	{
		int total = 0;
		for(int x1:x)
		{
			total = total + x1;
		}
		System.out.println("The sum of all the number is "+total);
	}
	
	public static void sub(int x,int y)
	{
		int result = 0;
		System.out.println("Please enter two numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		result = (x>y)?  x-y : y-x;
		System.out.println("The substraction of the entered number is "+ result);
		
	}
	
	//Var-arg method
	public static void mul(int... x)
	{
		int result = 1;
		
		for(int x1:x)
		{
			result = result * x1;
		}
		System.out.println("The multiplication of entered number is "+ result);
		
	}
	
	public static void div(int divident,int diviser)
	{
		System.out.println("Please enter divident");
		divident = sc.nextInt();
		System.out.println("Please enter diviser");
		diviser = sc.nextInt();
		
		double result = divident / diviser;
		System.out.println("Division of the number is "+ result);
	}
	
	public static void avg(int...divident)
	{
		double result =0;
		int itr = 0;
		//For-each loop
		for(int d1:divident)
		{
			result = result + d1;
			itr ++;
			
		}
		result = result/itr;
		System.out.println("The avg of the entered number is "+ result);
		
	}

	

}
