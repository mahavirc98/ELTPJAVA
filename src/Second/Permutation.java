package Second;

import java.util.Scanner;

public class Permutation {
	static void per(String str,String ans) {
		if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            // ith character of str 
            char ch = str.charAt(i); 
  
            // Rest of the string after excluding  
            // the ith character 
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
  
            // Recurvise call 
            per(ros, ans + ch); 
        } 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String sentence = sc.nextLine();
		per(sentence,"");
		sc.close();

	}

}
