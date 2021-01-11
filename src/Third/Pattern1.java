package Third;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number");
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
				
			}
			System.out.println("\n");
		}

	
	for(int i=n-1;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print(j + " ");
			
		}
		System.out.println("\n");
	}
sc.close();
}

}
