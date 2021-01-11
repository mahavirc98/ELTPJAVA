package Second;

import java.util.Scanner;

public class ReverseStr {
	static String  makeReverse(String str) {
		String rev = "";
		String[] a = str.split(" ");
		for(String i:a) {
			char[] temp = i.toCharArray();
			for(int j=temp.length-1;j>=0;j--) {
				rev = rev + temp[j];
			}
			rev = rev + " ";
		}
		return rev;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String sentence = sc.nextLine();
		System.out.println("Reverse of String is " + sentence + " is "+ makeReverse(sentence));
		sc.close();

	}

}
