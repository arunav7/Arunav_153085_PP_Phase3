package com.cg.mypaymentapp.pl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.Scanner;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.service.WalletService;
import com.cg.mypaymentapp.service.WalletServiceImpl;

public class Client {

	static WalletService walletService = new WalletServiceImpl();

	void menu() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println();
		System.out.println("1.Create an account");
		System.out.println("2.View Balance");
		System.out.println("3.Send Money");
		System.out.println("4.Deposit Amount"); 	
		System.out.println("5.Withdraw Amount"); 	
		System.out.println("6.Exit Application");
		System.out.println("=========================");
		System.out.println();
		
		System.out.println("Enter Your Choice");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {

		case 1:
			System.out.println("please enter ur name");
			String name = br.readLine();
			
			System.out.println("please enter ur mobile no");
			String mobile = br.readLine();
			
			System.out.println("please enter amount ");
			BigDecimal bigdecimal = new BigDecimal(br.readLine());
			
			Customer cust = walletService.createAccount(name, mobile, bigdecimal);

			if(cust == null)
				System.out.println("Mobile number already registered");

			else
				System.out.println("Mobile number SuccessFully registered");

			break;
		
		case 2:
			System.out.println("please enter your mobile no");
			String mob1 = br.readLine();
			
			Customer cust1 = walletService.showBalance(mob1);
			System.out.println("ur balance in account is:"+cust1.getWallet().getBalance());
			
			break;
	
		case 3:
			System.out.println("please enter your source mobile no");
			String sourceMobile = br.readLine();
	
			System.out.println("please enter your target mobile no");
			String targetMobile = br.readLine();
	
			System.out.println("please enter amount to be transferred");
			BigDecimal amount = new BigDecimal(br.readLine()) ;
	
			walletService.fundTransfer(sourceMobile, targetMobile, amount);
			
			break;
			
		case 4:
			System.out.println("please enter your mobile no");
			String dmob = br.readLine();
	
		    System.out.println("please enter amount to be deposited");
		    BigDecimal depositAmount = new BigDecimal(br.readLine());
	
		    walletService.depositAmount(dmob, depositAmount);
		    
		    break;
	
		case 5:
			System.out.println("please enter your mobile no");
			String wmob = br.readLine();
			
			System.out.println("please enter amount to be withdrawm");
			BigDecimal withdrawAmount = new BigDecimal(br.readLine());
	
			walletService.withdrawAmount(wmob, withdrawAmount);
			
			break;
			
		case 6:
			System.out.println("GoodBye!!!!");
			System.exit(0);
			break;
			
		default:System.out.println("wrong choice");	
	
		}
	}
	
	public static void main(String[] args) throws IOException {

		Client cli = new Client();

		while(true)
			cli.menu();
		
	}	
}
