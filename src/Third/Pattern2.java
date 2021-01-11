package Third;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(str.charAt(j) + " ");
				
			}
			System.out.println("\n");
		}
		sc.close();
	}

}
