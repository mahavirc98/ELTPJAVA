package First;

import java.util.Scanner;

public class CreditCard {
	static double callPayback(int amt) {
		double total=0;
		int temp=0;
		temp = amt;
		amt = amt-500;
		if(amt<=0) {
			total = temp*0.0025;
			return total;
		}
		total = 500*0.0025;
		temp = amt;
		amt = amt-1000;
		if(amt<=0) {
			total = total + temp*0.005;
			return total;
		}
		total = total + 1000*0.005;
		temp = amt;
		amt = amt-1000;
		if(amt<=0) {
			total = total + temp*0.0075;
			return total;
		}
		total = total + 1000*0.0075;
		total = total + amt*001;
		
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int amt = sc.nextInt();
		System.out.println("Your charge amount is " + amt + " and pay back for it is " + callPayback(amt));
		sc.close();

	}

}
