package First;

import java.util.Scanner;

public class Electricity {
	static double calBill(int unit, int flag) {
		double total = 0;
		switch (flag) {
		case 1: {
			if(unit<=100) {
				total = unit*4;
				if(total<250) {
					total=250;
				}
					
				
			}
			else if(unit>100 && unit<=300) {
				total = unit*4.5;
				
			}
			else if(unit>300 && unit<=500) {
				total = unit*4.75;
				
			}
			else if(unit>500) {
				total = unit*5;
				
			}
			break;
		}
		case 2:{
			if(unit<=100) {
				total = unit*4.25;
				if(total<350) {
					total=350;
				}
					
				
			}
			else if(unit>100 && unit<=300) {
				total = unit*4.75;
				
			}
			else if(unit>300 && unit<=500) {
				total = unit*5;
				
			}
			else if(unit>500) {
				total = unit*5.25;
				
			}
			break;
		}
		default:{
			System.out.println("No entry");
		}
			
		}
		return total;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for domestic and 2 for commercial");
		int flag = sc.nextInt();
		System.out.println("ENter the number of units consumed");
		int unit = sc.nextInt();
		System.out.println("Your Bill for unit " + unit + " is " + calBill(unit,flag));
		sc.close();
		// TODO Auto-generated method stub
		

	}
}
