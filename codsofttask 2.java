package codsofttask1;
import java.util.Scanner;
public class codsofttask2 {
	
		 String gradecalculate(double avg) {
			 if(avg>= 90) {
				 return "O";
				 }
			 else if (avg >=80) {
				 return "A+";
			 }
			 else if (avg >=70) {
				 return "A";
			 }
			 else if (avg >=60) {
				 return "B+";
			 }
			 else if (avg >=50) {
				 return "B";
			 }
			 else if (avg >=40) {
				 return "C";
			 }
			 else {
				 return "F";
			 }
		 }
	 	 
		 
		public static void main(String args []) {
		System.out.println("WELCOME TO STUDENT GRADE CALCULATOR:");
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of subjects:");
	    int n = sc.nextInt();
	    codsofttask2 obj = new codsofttask2();
	    double sub[] = new double[10];
	    double sum = 0;
	    System.out.println("Enter " + n + " subject marks:");
	    	    for (int i=1;i<=n;i++) {
	    	    	sub[i]= sc.nextInt();
	    	    	sum =sum + sub[i];
	    	    }
	    double avg = sum/n;
	    System.out.println("SUM:"+ sum);
	    System.out.println("AVERAGE PERCENTAGE:"+ avg + "%");
	    System.out.println("GRADE:"+ obj.gradecalculate(avg));
		 }
	

}
