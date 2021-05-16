package pkg1;

public class Assignment3 
{
 public Assignment3() 
 {
	this(78);
	System.out.println(" Default Constructor ");//3
 }
 
 public Assignment3(int a) 
 {
    this(87,6,5,4);
	System.out.println(" One parameterized Constructor ");//4
 }
 
 public Assignment3(int a, int b) 
 
 {
	this(78,67,89);
	System.out.println(" Two parameterized Constructor ");//1
 }
 
 public Assignment3(int a, int b, int c) 
 {
	 this();
	System.out.println(" Three parameterized Constructor ");//2
 }
 
 public Assignment3(int a, int b, int c, int d) 
 {

    System.out.println(" Four parameterized Constructor ");
 }
 
 public static void main(String[] args)
 
 {
	Assignment3 s1= new Assignment3(35,45);
 }
 
 
}
