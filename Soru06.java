package JavaOfisHours01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Soru06 {

	public static void main(String[] args) throws FileNotFoundException {

		//Motor isminde bir de�i�ken olu�turun ve sonraki sat�rda gene ayn� isimde bir de�i�ken olu�turmaya �al���n ve eger bir al�rsan�z bu hatay� handle ediniz
		
		String motor = "Ferrari motoru";
		
		try {
		String motor2="Tesla motoru";
		}catch(Exception e) {
			e.printStackTrace();
		}
		FileInputStream file = new FileInputStream("peth");
		

	}

}
