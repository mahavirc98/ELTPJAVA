package First;

import java.util.Scanner;

public class PrintPrime {
	static void printPrime(int num) {
		for(int i=2;i<num;i++) {
			if(i==2) {
				System.out.println(i);
			}
			int m = num/2;
			int flag=0;
			for(int j=2;j<m;j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
				
				
			}
			if(flag==0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		printPrime(num);
		sc.close();

	}

}
