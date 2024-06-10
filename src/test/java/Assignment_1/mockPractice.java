package Assignment_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class mockPractice {
	
	
// Print 1 to 100 without using loop	
	/*public static void printNum(int num) {
	
	if(num<=100) {
		
		System.out.println(num);
		num++;
		printNum(num);
		
	}
	}*/

	
	//Getter setter methods	
	/*private String name;
	private int id;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
		
	}
	*/
	
	
//*************************************************************************************************************************************
//	public static int count=0;
public static void main(String[] args) {
 
 // Armstrong no	
	
		/*System.out.println("Enter the number: ");
		Scanner s= new Scanner(System.in);
		int n= s.nextInt();

		int temp;int total =0;int arms= n;
		while(n>0){

		int rem = n%10;    // 3,5,0.1
		if(rem>=0){
		temp=rem*rem*rem;  // 27,125
		}  
		else{
		temp=n*n*n;
		}
		total=total+temp;  // 27,152

		n=n/10;            // 15,1

		}
		if(arms==total){
		System.out.println(arms + " is an Armstrong no.");
		}

		else{
		System.out.println(arms + " is not an Armstrong no.");
		}*/
	
 //	
	
// to Find Factorial of given number	

/*System.out.println("Enter the number: ");
Scanner s= new Scanner(System.in);
int n= s.nextInt();

int f=1;
for(int i=1;i<=n;i++){
f=f*i;
}

System.out.println("Factorial of " + n +" is: " +f );*/

// to check whether strings are anagrams or not	
	
	/*System.out.println("Enter the 1st String: ");
	Scanner s= new Scanner(System.in);
	String firstWord= s.nextLine();
	
	System.out.println("Enter the 2nd String: ");
	String secondWord=s.nextLine();
	
	firstWord=firstWord.toLowerCase();
	secondWord=secondWord.toLowerCase();

	char[] first = firstWord.toCharArray();
	char[] second= secondWord.toCharArray();

	Arrays.sort(first);
	Arrays.sort(second);

	if(Arrays.equals(first, second) && firstWord.length()==secondWord.length()){
	System.out.println("Strings are anagrams");

	}
	else{
	System.out.println("Strings are not anagram");
	}*/

// To swap strings without using 3rd reference variable	
	
	/*String str= "Hello";
	String str1= "World";
	
	System.out.println("Before swapping: "+ str + " "+str1);

	str= str.concat(str1);
	str1=str.substring(0,(str.length()-(str1.length())));
	str=str.substring(str1.length());
	System.out.println("After swapping: "+ str + " "+str1);*/
	
// To print sum of digits of given integer
	
	/*System.out.println("Enter a multidigit number: ");
	Scanner s= new Scanner(System.in);
	int num= s.nextInt();

	int sum=0;
	while(num>0){
	int rem=num%10;
	if(rem>=0){
	sum=sum+rem;
	}
	else{
	sum=sum+num;
	}
	num=num/10;
	}
	System.out.println("The sum of digits of given number is: " + sum);*/
	
//to find number of characters in given string
	
	/*String str= "Mr";
	char[] charArray=str.toCharArray();
	System.out.println("The number of characters in given string are: "+ charArray.length);*/
	
// To find capital letters in given string
	
	/*String str="Hello";
	int count=0;
	for(int i=0;i<str.length();i++) {
		if(str.charAt(i)>='A' && str.charAt(i)<='Z') {
			count++;
			
		}
	
	}
	System.out.println("The number of capital letters in given string are: " + count);*/
	
// to find longest consecutive occurrence of integers in given array	
	
	/*int[] num= {1,2,3,4,5,6,89,5,34,8,9,10,11,89,65};
	
	int count =0;
	int max=0;
	for(int i=1;i<num.length;i++) {
		
	if(num[i]==num[i-1]+1) { 
		
		count++;
	}
	else {count=0;}
		
	max=Math.max(max, count+1);
	}
	System.out.println(max);*/
	
//To get output aabbbcccc with input as a2b3c4
	
	/*String str="a2b3c4";
	String temp="";
	for(int i=0;i<str.length();i++) {//0,1
		
		if(str.charAt(i)>='1' && str.charAt(i)<='9') {//a,2
			int count = Character.getNumericValue(str.charAt(i));
			for(int j=0;j<=count;j++) {//-,0
				temp=temp+ str.charAt(i-1); // aaa,
			}
			
		}
		
	}
	System.out.println(temp);*/
	
// Write a Java Program to print the product of an array except self
	
	/*Input: You have an array of integers. For example, consider the array [1, 2, 3, 4].

	Output: You need to generate a new array where each element at index i is the product of all the elements in the original array except the one at i. For the example [1, 2, 3, 4], the output would be [24, 12, 8, 6].

	    The first element in the output array is 2 * 3 * 4 = 24.
	    The second element is 1 * 3 * 4 = 12.
	    The third element is 1 * 2 * 4 = 8.
	    The fourth element is 1 * 2 * 3 = 6.*/
	
	
// Program to find 1st non-repeating character in string
	
	/*String str="aabbcchhddeebggarkj";
	
	for(int i=0;i<str.length();i++) {
		
	if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))){
		
		System.out.println(str.charAt(i) + " is first non-repeating character");
	break;
	}
	}*/
	
// To find second largest number in given array
	
	/*int[] num= {24,56,48,96,101,63};
	int max=num[0];
	int maxIndex=0;
	
	for(int i=0;i<num.length;i++) {
	if(num[i]>max) {
	max=num[i];
	maxIndex=i;
		}
		
	}
	int secMax=0;
	for(int i=0;i<num.length;i++) {
	if(i!=maxIndex && num[i]> secMax) {
		
		secMax=num[i];
	}
	
	}
	System.out.println(secMax + " is the second largest number in array");*/
	
// To print first and last position of number in given array
	
	/*int[] num= {1,2,3,4,5,1,2,3};
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			
			if(num[i]==num[j]) {
				
				System.out.println("First position of "+num[i]+" : " +i+" Last Position of "+num[j]+" : "+ j);
			}
			
		}
		
	}*/
	
// Print 1 to 100 without using loop
	
	
	//printNum(1);
	
//Getter setter methods	
	/*mockPractice m = new mockPractice();
	m.setName("Rohit");
	m.setId(1234);
	System.out.println("Name: "+m.getName()+","+"Emplyee id: "+m.id);*/
	
	
	

}
}
