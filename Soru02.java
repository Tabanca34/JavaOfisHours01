package JavaOfisHours01;

import java.util.Scanner;

public class Soru02 {

	

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		String input =scan.nextLine();
		
		System.out.println(isPalindrome(input));
		

	}

	public static boolean isPalindrome(String word) {
		boolean flag= false;
		StringBuilder wordsb=new StringBuilder(word);
		wordsb.reverse();
		if(wordsb.toString().equals(wordsb)) {
		
		 flag =true;
	}
		System.out.println(flag);
		return flag;

}
}