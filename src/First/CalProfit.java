package First;

import java.util.Scanner;

public class CalProfit {
	
	static double calculateProfit(int n) {
		double total = 0;
		total = n*5 - 20 -0.5*n;
		return total;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of attendees");
		int amt = sc.nextInt();
		System.out.println("Number of attendees are " + amt + " and money earned id " + calculateProfit(amt));
		sc.close();

	}

}
