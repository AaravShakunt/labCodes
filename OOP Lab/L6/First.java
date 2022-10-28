import java.util.Scanner;

class Account{
	String name;
	int accno, dep;
	double bal;
	static int k=200;
	Scanner sc = new Scanner(System.in);
	Account(){
		System.out.println("Enter name: ");
		name = sc.next();
		accno=k;
		k++;
		bal=0;
	}
	void deposit(){
		int b;
		System.out.println("Enter money: ");
		b=sc.nextInt();
		bal=bal+b;
		System.out.println("BALANCE: "+ bal);
	}
	void withdraw(){ 
		System.out.println("BALANCE: "+ bal+"\nEnter money to be withdrawn:\n");
		dep = sc.nextInt();
		if (dep>bal){
			System.out.println("BALANCE INADEQUATE\n");
			return;
		}
		bal=bal-dep;
		System.out.println("BALANCE: "+ bal);
		return;
	}
	void display(){
		System.out.println("NAME"+name+"BALANCE: "+ bal+"\nEnter money to be withdrawn:\n");
	}
}

class SavAccount extends Account{
	SavAccount(){
		super();
		System.out.println("SAVINGS ACCOUNT\n");
	}
	void interest(){
		bal = bal+0.06*bal;
		System.out.println("BALANCE AFTER INTEREST: "+ bal);
	}
}

class CurrAccount extends Account{
	Scanner sc = new Scanner(System.in);
	CurrAccount(){
		super();
		System.out.println("Enter deposit: ");
		bal = sc.nextInt();
		if (bal<1000){
			System.out.println("PENALTY");
			bal=bal*0.9;
		}
	}
	
}
class First{
	public static void main(String args[]){
		SavAccount Sacc = new SavAccount();
		Sacc.deposit();
		Sacc.withdraw();
		Sacc.interest();
		
	}
}
