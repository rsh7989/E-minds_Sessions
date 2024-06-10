package assesmentTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program1 {

	
	public static void main(String[] args) {

System.out.println("Enter the number of students: ");
Scanner s= new Scanner(System.in);
int studentsNumber=s.nextInt();;int sum=0;

System.out.println("Enter whether want to continue after this iteration: ");
Scanner s1= new Scanner(System.in);
String YesorNo=s1.nextLine();



String performance="";
List<Integer> stuGrades= new ArrayList<Integer>();

for(int i=1;i<=studentsNumber;i++){
System.out.println("Enter the grade of student: ");
int grade = s.nextInt();
stuGrades.add(grade);
System.out.println("Grade for student "+i+" : "+ grade);
}


do{
	for(int i=0;i<stuGrades.size();i++){
		sum= sum+stuGrades.get(i);
		

	}
	
	double avg=(double)sum/studentsNumber;
	System.out.println("Average grades of class are: "+ avg);
	
		if(avg>=90 && avg <=100){
		performance="Excellent";
		}

		else if(avg>=80 && avg <90){
		performance="Very Good";
		}
		else if(avg>=70 && avg <80){
		performance="Good";
		}
		else if(avg>=60 && avg <70){
		performance="Average";
		}
		else if(avg<60){
		performance="Poor";
		}
		
switch (performance){

case "Excellent":  
     System.out.println("Class performance was excellent");
     break;

case"Very Good":  
     System.out.println("Class performance was very good");
     break;

case"Good":  
     System.out.println("Class performance was good");
     break;

case"Average":  
     System.out.println("Class performance was avg");
     break;

case"Poor":  
     System.out.println("Class performance was poor");
     break;

}

}
while(YesorNo.equalsIgnoreCase("Yes"));

	
}
	}
	

