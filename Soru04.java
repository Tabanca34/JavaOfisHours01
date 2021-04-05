package JavaOfisHours01;

import java.util.Scanner;

public class Soru04 {

	public static void main(String[] args) throws IllegalAccessException {
		
		//	Kullanicidan yasini alin ve eger kullanici yasini 0 veya daha az bir yas girerse
		// kullaniciya musade etmeyin(Exception throw edin)
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yaþýnýzý giriniz");
		int yas =scan.nextInt();
		
		if(yas<=0) {
			try {
			throw new IllegalAccessException();
		}catch(Exception e) {
			System.out.println("Yasýnýz 0 dan kücük olmaz");
		}

	}

}

}