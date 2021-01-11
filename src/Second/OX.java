package Second;

import java.util.Scanner;

public class OX {
	public static void winner(String[][] board){
		//String m="No match Found";
		if(board[0][0] == board [0][1] && board[0][0] == board [0][2]) {
			//m= board[0][0];
			System.out.println(board[0][0]);
		}
		else if (board[0][0] == board [1][1] && board[0][0] == board [2][2]) {
			//m= board[0][0];
			System.out.println(board[0][0]);
		}
		
		else if(board[0][0] == board [1][0] && board[0][0] == board [2][0]) {
			System.out.println(board[0][0]);
			//m= board[0][0];
		}
		else if  (board[2][0] == board [2][1] && board[2][0] == board [2][2]) {
			System.out.println(board[2][0]);
			//m= board[2][0];
		}
		else if(board[2][0] == board [1][1] && board[0][0] == board [0][2]) {
			//m= board[2][0];
			System.out.println(board[2][0]);
		}
		else if(board[0][2] == board [1][2] && board[0][2] == board [2][2]) {
			System.out.println(board[0][2]);
			//m= board[0][2];
		}
		else if(board[0][1] == board [1][1] && board[0][1] == board [2][1]) {
			System.out.println(board[0][1]);
			//m= board[0][1];
		}
		else if(board[1][0] == board [1][1] && board[1][0] == board [1][2]) {
			System.out.println(board[1][0]);
			// m =  board[1][0];
		}
		//System.out.println(board[0][0]);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] a = new String[3][3];
		int count= 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The O or X sequentially 9 times");
		String str = sc.nextLine();
		String[] b = str.split(" ");
		//char[] temp = .toCharArray();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j] = b[count];
				count++;
				
			}
		}
		winner(a);
		//System.out.println(winner(a));
		sc.close();
	}

}
