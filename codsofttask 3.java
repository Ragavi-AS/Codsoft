package codsofttask1;
import java.util.Scanner;


public class codsofttask3  {
	private double balance=0;
	
	public void withdraw(double amount) {
		if(balance >= amount) {
			balance = balance-amount; 
			System.out.println("successfully withdrawn rupees " + amount+".current balance:"+ balance);
		}
		else {
			System.out.println("Insufficient balance! please try another amount.your available balance:"+ balance);
		}
	}
	
	public void deposit( double amount) {
		if(amount>0) {
			balance = balance + amount;
			System.out.println("Successfully deposited rupees "+amount );
			System.out.println("your current balance:"+balance);
		}
		else {
			System.out.println("Invalid deposit amount!");
		}
	}

	public void checkbalance() {
		System.out.println("your account balance:"+ balance);
	}


	public static void main (String args []) {
		double amount;
		int ch=0;
		codsofttask3 a= new  codsofttask3();
		Scanner sc = new Scanner(System.in);
		while(ch != 4) {
			System.out.println("-----------ATM MACHINE-----------");
			System.out.println("1.DEPOSIT AMOUNT");
			System.out.println("2.WITHDRAW AMOUNT");
			System.out.println("3.CHECK BALANCE");
			System.out.println("4.EXIT");
			System.out.println("Enter your choice:");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.println("Enter the amount to deposit:");
				amount=sc.nextDouble();
				a.deposit(amount);
				break;
				
			case 2:
				System.out.println("Enter the amouunt to withdraw:");
				amount=sc.nextDouble();
				a.withdraw(amount);
				break;
				
			case 3:
				a.checkbalance();
				break;
				
			case 4:
				System.out.println("Thankyou for using ATM!");
				System.out.println("exiting.....");
				break;
				
				default:
					System.out.println("Invalid choice!");
					
					sc.close();
			}
		}
	}
}