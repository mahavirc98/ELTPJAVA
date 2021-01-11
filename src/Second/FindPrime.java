package Second;

import java.util.Scanner;

public class FindPrime {
	static void prime(int[] a, int n) {
		for(int i=0;i<n;i++) {
			if(a[i]==2) {
				System.out.println(i);
			}
			int m = a[i]/2;
			int flag=0;
			for(int j=2;j<m;j++) {
				if(a[i]%j==0) {
					flag=1;
					break;
				}
				
				
			}
			if(flag==0) {
				System.out.println(a[i]);
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		System.out.println("Enter the number of intergers");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the integers");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		prime(a,n);
		sc.close();
	}

}
