package First;

import java.util.Scanner;

public class PrimeOrNot {
	static boolean isPrime(int num) {
		int m,flag = 0;
		m = num/2;
		if(num==0||num==1){  
			   return false;     
		}else if(num == 2) {
			return true;
		}
		
		else{  
			   for(int i=2;i<=m;i++){      
			    if(num%i==0){      
			          
			     flag=1;      
			     break;      
		}      
	}      
	}
		if(flag==0) {
			return true;
			
		}
		else return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("The Given number " + num + " is prime is " + isPrime(num));
		sc.close();

	}

}
