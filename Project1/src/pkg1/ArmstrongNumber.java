package pkg1;

import java.util.Scanner;

public class ArmstrongNumber // 153 = 1 + 125 + 27 (cube of each number)
{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of Armstrong Number ");
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int old_num = num;
		sc.close();
		
		while(num >0)       //153>0         15>0           1>0         0>0(False)
		{
			int r= num%10;  // 153%10 = 3   15%10 = 5      1%10 = 1 
			sum = sum + r*r*r;//0+27= 27     27+5*5*5=152   152+1*1*1=153
			num = num/10; //   153/10=15    15/10= 1       1/10 =0
		}	
			
			if(old_num == sum)
			{
				System.out.println("It is Armstrong number");
				
			}
			else {
				System.out.println("It is not Armstrong Number");
			}
			
		}
	

}
