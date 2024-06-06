/* Task 2 - to design a grade calculator to calculate grade of the student on the basis of their marks*/


package codsoft;
import java.util.*;

public class StudentGrade {
	  static int marks[],n;
	  double avgPercent;
	  
         // function to calculate the percentage of the student
	  void result()
	  { 
		  int totalMark=0;
	  
		  for(int i=0;i<n;i++)
		  {
			  totalMark=totalMark+marks[i];
		  }
		  System.out.println("Total marks = "+totalMark);
		  
		  avgPercent = (double)totalMark/n;
		  System.out.println("Average percentage = " +avgPercent +"%");
	  }

	  // function to calculate the grade of the student on the basis of their percentage

	  void grade()
	  {
		  char grade;
		  
		 if(avgPercent>=90 && avgPercent<=100)
			 grade = 'A';
		 else if(avgPercent>=80 && avgPercent<90)
			 grade = 'B';
		 else if(avgPercent>=70 && avgPercent<80)
			 grade = 'C';
		 else if(avgPercent>=60 && avgPercent<70)
		    grade= 'D';
		 else
			 grade = 'F';
		 
		 System.out.println("Grade = "+ grade);
	  }
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the total number of subjects");    // user input to input the number of the subjects
		 n = sc.nextInt();
		marks = new int[n];
		System.out.println("enter the marks in each subject out of 100");  // user input to enter the marks in individual subjects
		for(int i=0;i<n;i++)
			marks[i]=sc.nextInt();
		
		
		StudentGrade ob = new StudentGrade();
		ob.result();
		ob.grade();

	}

}
