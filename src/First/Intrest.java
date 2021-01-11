package First;
import java.util.*;

public class Intrest {
	static double callIntrest(int amt) {
		double total = 0;
		if(amt<1000) {
			total = amt + amt*0.04;
		}
		else if(amt>=1000 && amt<5000) {
			total = amt + amt*0.045;
		}
		else {
			total = amt+amt*0.05;
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int amt = sc.nextInt();
		System.out.println("Intrest on your amount of Rs " + amt + " is " + callIntrest(amt));
		sc.close();
		// TODO Auto-generated method stub
		

	}

}
