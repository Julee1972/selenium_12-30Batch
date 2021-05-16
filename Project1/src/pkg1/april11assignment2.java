package pkg1;

import java.util.Scanner;

public class april11assignment2 
                                   // (x1*x2)+x3)+x4)-x5)/x6)))

{
	public int add(int a, int b) 
	{
		return a+b;
	}
	public int sub(int a, int b) 
	{
		return a-b;
	}
	public int Multi(int a, int b)
	{
		return a*b;
	}
	
	public int div(int a, int b)
	{
		return a/b;
	}
	
	public static void main(String[] args) 
	{
		april11assignment2 k =new april11assignment2();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of x1");
		int x1 = s.nextInt();
		System.out.println("Enter the value of x2");
		int x2 = s.nextInt();
		System.out.println("Enter the value of x3");
		int x3 = s.nextInt();
		System.out.println("Enter the value of x4 ");
		int x4 = s.nextInt();
		System.out.println("Enter the value of x5");
		int x5 = s.nextInt();
		System.out.println("Enter the value of x6 ");
		int x6 = s.nextInt();
		
		int Mul_result = k.Multi(x1,x2);
		int add1 = k.add(Mul_result,x3);
		int add2 = k.add(add1,x4);
		int sub1=k.sub(add2,x5);
		int div_result  =k.div(sub1,x6);
		System.out.println(" anwser is "  + div_result);
		
		
		
		
		
	}
	
	

	
	
}
