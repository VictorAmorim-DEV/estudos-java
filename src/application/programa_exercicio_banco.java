package application;

import java.util.Locale;
import java.util.Scanner;

import entites.BankAccount;

public class programa_exercicio_banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numAccount = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holderAccount = sc.nextLine();
		System.out.print("Is there initial deposit (y/n)? ");
		char initialDepositResponse = sc.next().charAt(0);
		double valueDeposit = 0;
		if (initialDepositResponse == 'y') {
			System.out.print("Enter initial deposit value: ");
			valueDeposit = sc.nextDouble();
		}
		BankAccount bankAccount = new BankAccount(numAccount, holderAccount, valueDeposit);	
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);
		System.out.println();
		
		System.out.print("Enter a deposit value:");
		double deposit = sc.nextDouble();
		bankAccount.depositValue(deposit);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		System.out.println();
		
		System.out.print("Enter a withdraw value:");
		double withdraw = sc.nextDouble();
		bankAccount.withdrawValue(withdraw);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);
		
		
		sc.close();

	}

}
