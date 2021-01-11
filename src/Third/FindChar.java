package Third;

import java.util.Scanner;

public class FindChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String str = sc.nextLine();
		 int count = 0;    
         
	        //Counts each character except space    
	        for(int i = 0; i < str.length(); i++) {    
	            if(str.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);
	        sc.close();
	}

}
