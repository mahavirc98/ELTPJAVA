package First;
import java.util.*;


public class Vowel {
	static boolean checkAlpha(char alph) {
		if(alph=='a' || alph=='e' || alph=='i' || alph=='o' || alph=='u') {
			return true;
		}
		else {
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the character");
		char alph = sc.next().charAt(0);
		System.out.println(alph + " is volwel " + checkAlpha(alph));
		sc.close();
	}
}
