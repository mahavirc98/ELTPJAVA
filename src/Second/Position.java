package Second;

import java.util.Scanner;

public class Position {
	static int findPosition(int n,int[] a,int num) {
		int pos = 0;
		int i=0;
		for(int j=0;j<n;j++) {
			if(num==a[j]) {
				return i;
			}
			else
			{
				i++;
			}
		}
		return pos;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[100];
		System.out.println("Enter the number of intergers");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Enter the integers");
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the number to find position");
		int num = sc.nextInt();
		int pos = findPosition(n,a,num);
		
		System.out.println("Position of int " + num + " is " + pos);
		
		sc.close();
	}

}
