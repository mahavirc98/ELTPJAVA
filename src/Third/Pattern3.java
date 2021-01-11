package Third;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		String[] s = str.split(" ");
		for(String i:s) {
			System.out.println(i);
		}
		sc.close();

	}

}
