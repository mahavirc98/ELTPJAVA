package Second;

import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Enter the sub string");
		String sub = sc.nextLine();
		System.out.println("Enter the sub string to replace");
		String rep = sc.nextLine();
		
		System.out.println("Given String is:- " + str + " after replacing string is " + str.replaceAll(sub, rep));
		sc.close();

	}

}
