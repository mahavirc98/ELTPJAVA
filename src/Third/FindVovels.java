package Third;

import java.util.Scanner;

public class FindVovels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++) {    
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')    
                count++;    
        } 
        System.out.println("Total number of vovelss in a string: " + count);
		sc.close();

	}

}
