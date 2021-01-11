package Third;

import java.util.Scanner;

public class Five {
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
		for(int i=0;i<n;i++) {
			if(a[i]%2==0 && a[i]%5==0) {
				System.out.println(a[i]);
			}
		}
		sc.close();

	}


}
