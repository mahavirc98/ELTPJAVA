package First;

import java.util.Scanner;



public class Tac {
	static double callTax(int amt) {
		double total = 0;
		if(amt<=240) {
			total = 0;
		}
		else if(amt> 240 && amt<480) {
			total = amt + amt*0.15;
		}
		else {
			total = amt+amt*0.28;
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt = sc.nextInt();
		System.out.println("Tax on your amount of Rs " + amt + " is " + callTax(amt));
		sc.close();

	}

}
