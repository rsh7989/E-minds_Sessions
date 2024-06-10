package Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Practice_programs {

	public static void main(String[] args) {

		// ****************************************************************************************************************************
		// // To print fibonacci series
		
		 //Take input from user for the count upto which the series is to be printed
		/*System.out.println("Enter the count for fibonacci series: ");
		 Scanner s = new Scanner(System.in);
		 int count = s.nextInt();
		
		 // Initializing the variables
		 int a;int b=0;int c=1;
		
		 //Using for loop for printing numbers in the fibonacci series uptill the
		 //scount provided by the user
		 for(int i =0;i<=count;i++) {
		 a=b;
		 b=c;
		 c=a+b;
		 if(i<n) {
			System.out.print(a+",");}
			else {System.out.print(a);}
		
		 }*/
		 
		 
		 /*int count = 5;
		 int a=0;int b=1;int c=1;
		 for(int i =0;i<=count;i++) {
		 a=b; //a=1,1,2,3,5
		 b=c; //b=1,2,3,5,8
		 c=a+b; //c=2,3,5,8,13
		 System.out.print(a+",");
		 }*/
		// *******************************************************************************************************************************

		// *******************************************************************************************************************************
		 // To check number is prime number or not
		
		// Take input of number from user
		/*System.out.println("Enter the number: ");
		 Scanner s= new Scanner(System.in);
		int num = s.nextInt();
		
		 // Initializing the variable count to check prime number condition
		 int count =0;
		
		//Using for loop to check the divisiblity of given number
		for(int i=1;i<=num;i++) {
		
		if(num%i==0) {
		 count++;
		 }
		 }
		
		//using if-else loop to check the condition of a number to be a prime number
		if(count==2) {
		System.out.println(num +" is a prime number");
		 }
		 else {
		 System.out.println(num +" is not a prime number");
		}*/

		// ***********************************************************************************************************************************
		 // To check Whether given string is pallindrome or not
		
		// Take input as a string from the user
		 /*System.out.println("Enter the word: ");
		 Scanner s = new Scanner(System.in);
		 String str = s.nextLine();
		
		//Initializing an empty string
		String r="";
		
		//Using for loop to reverse the given string
		for(int i=str.length()-1;i>=0;i--){
		r=r+str.charAt(i);
		}
		
		//Using if-else loop to check whether given string is pallindrome or not
		 if(str.equalsIgnoreCase(r)){
		System.out.println(str + " is a pallindrome");
		}
		else{System.out.println(str +" is not a pallindrome");
		}*/
		// *************************************************************************************************************************************
		// To check whether given number is armstrong number or not

		// Take input as a number for user
		/*System.out.println("Enter the number: ");
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		
		//Initializing the int variables
		int temp;int total =0;int arms=n;
		
		//Using while loop
		while(n>0) {
		int b= n%10;//3,5,0.1
		if(b>=0) {
		temp=b*b*b;//27,125,
		 }
		else {
		temp=n*n*n;//1
		}
		total =total +temp;//27,152,153
		n=n/10;//15,1
		
		}
		
		//using if-else to check condition for armstrong number
		if(arms==total) {
		 System.out.println(arms + " is an armstrong no.");
		
		 }
		 else {System.out.println(arms+ " is not an armstrong no.");
		 }*/
		// ********************************************************************************************************************************

		// To print square of first 10 even numbers using while and do while loop

		 //Using while loop
		 //initializing variables
		/*int num = 2;
		 int count = 1;
		 int sq;*/
		
		 // using while loop for
		/*while (count <= 10) {
		
		 if (num % 2 == 0) {
		 sq = num * num;
		
		 System.out.println("Square of " + num +" is: " + sq);
		 count++;
		 }
		
		 num++;
		
		 }*/
		
		//Using do while loop
		/*do { if (num % 2 == 0) 
		{
			 sq = num * num;
				
			 System.out.println("Square of " + num +" is: " + sq);
			 count++;
			 }
			
			 num++;
		} while
		(count <= 10);*/
		// **********************************************************************************************************************************
		

	}
}

