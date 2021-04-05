package JavaOfisHours01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Soru03 {

	public static void main(String[] args) {
	
		// Q #1) replace() methodu kullanmadan bir String'deki bosluklari kaldiran Java kodunu yaziniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen boþluklarý arýndýrmak için  bir String oluþturunuz");
		wihtOutSpace(scan.nextLine());
		

	}

	public  static String  wihtOutSpace(String word) {
		String wordwihtOutSpace= "";
		for (int i = 0; i < word.length(); i++) {
			if(word.charAt(i)!= ' '){
				wordwihtOutSpace +=word.charAt(i);
			
		}
		}
		System.out.println(wordwihtOutSpace);
		return word;
		
		
	}

}
