package aug25;

import java.util.*;

 class Account{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	Account(){
		id=0;
		balance=0.0;
		annualInterestRate=0.0;
		dateCreated=new Date();
	}
	
	Account(int id, double balance){
		this.id=id;
		this.balance=balance;
	}
	void set(int id ,double balance,double annualInterestRate ) {
		this.id=id;
		this.balance=balance;
		this.annualInterestRate=annualInterestRate;
	}
	int get_id() {
		return id;
	}
	double get_balance() {
		return balance;
	}
	double get_annInterestRate() {
		return annualInterestRate;
	}
	Date get_date() {
		return dateCreated;
	}
	
	double getMonthlyInterestRate() {
		double d1= annualInterestRate/100;
		double monthlyInterestRate=d1/12;
		return monthlyInterestRate;
	}
	double getMonthlyInterest() {
		double monthlyInterestRate=getMonthlyInterestRate();
		return balance*monthlyInterestRate;
	}
	void withdraw(double w) {
		balance=balance-w; 
	}
	void deposit(double d) {
		balance=balance + d;
	}
	
	static double max_salary(Account [] s) {
		double maxsal=0;
		for(int i =0;i<4;i++) {
			for(int j=i+1;j<4;j++) {
				if(s[i].get_balance()>s[j].get_balance()) {
						maxsal=s[i].get_balance();
				}
				else {
					maxsal=s[j].get_balance();
				}
			}
		}
		return maxsal;
	}
	
}


public class Account1 {

	public static void main(String[] args) {
		
		Account ac1= new Account();
		
		Account ac2 = new Account(1, 500);
		
		
		ac1.set(2,1000 , 10);
		System.out.println("Account 1 id "+ac1.get_id());
		System.out.println("Account 1 balance is "+ac1.get_balance());
		System.out.println("Account 1  annual interest rate is "+ac1.get_annInterestRate());
		System.out.println("Account 1  monthly interest rate is "+ac1.getMonthlyInterestRate());
		System.out.println("Account 1  annual interest rate is "+ac1.getMonthlyInterest());
		ac1.withdraw(200);
		System.out.println("Account 1 after withdrawal "+ac1.get_balance());
		ac1.deposit(1000);
		System.out.println("Account 1 after the amount deposited "+ac1.get_balance());
		Date d=ac1.get_date();
		
		System.out.println("Date and time of creation :" +d);
		
		
		Account [] ac= new Account[4];
		
		
		
		ac[0]=new Account();
		ac[1]= new Account();
		ac[2]= new Account();
		ac[3] = new Account();
		ac[0].set(2, 5000, 10);
		ac[1].set(3, 500, 10);
		ac[2].set(4, 8000, 10);
		ac[3].set(5, 7000, 10);
		
		
		double maxsalary= Account.max_salary(ac);
		System.out.println("The maximum salary is "+maxsalary);
		// TODO Auto-generated method stub

	}

}
