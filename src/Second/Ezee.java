package Second;

import java.util.Scanner;

public class Ezee {
	
	static boolean isPresent(String[] productNames, String keyword) {
		boolean flag = false;
		char[] temp = keyword.toCharArray();
		int count = 0;
		
		for (int i=0;i<productNames.length;i++) {
			char[] tempproduct = productNames[i].toCharArray();
			count = 0;
			for(int j=0;i<temp.length;j++) {
				for (int k=0;k<tempproduct.length;k++) {
					if(temp[j]==tempproduct[k]) {
						count++;
					}
					
					if(count>temp.length)
						return true;
				}
			}
		}
		return flag;
	}
	static String[] initProductNames() {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of products");
		int count = sc.nextInt();
		sc.nextLine();
		String[] a  =new String[count];
		for(int i = 0;i<count;i++) {
			System.out.println("Enter the product name");
			a[i] = sc.nextLine();}
		
		//sc.close();
		//System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] productNames = initProductNames();
		System.out.println("Enter the keyword");
		Scanner sc=new Scanner(System.in);
		String key = sc.nextLine();
		if(isPresent(productNames, key)) {
			System.out.println("Yes the given keyword is present");
		}
		else {
			System.out.println("The given keyword is not present");
		}
		sc.close();

	}

}
