package Second;

import java.util.Scanner;

public class NoOfOccurrences {
	static int check(String sentence, String word) {
		int total = 0;
		String a[] = sentence.split(" ");
		for(String i:a) {
			if(word.equals(i)) {
				total++;
			}
		}
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		String sentence = sc.nextLine();
		System.out.println("ENter the word");
		String word = sc.nextLine();
		System.out.println("Occurrence of word " + word + " in " + sentence + " is " + check(sentence,word));
		sc.close();

	}

}
