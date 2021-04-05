package JavaOfisHours01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Soru06 {

	public static void main(String[] args) throws FileNotFoundException {

		//Motor isminde bir deðiþken oluþturun ve sonraki satýrda gene ayný isimde bir deðiþken oluþturmaya çalýþýn ve eger bir alýrsanýz bu hatayý handle ediniz
		
		String motor = "Ferrari motoru";
		
		try {
		String motor2="Tesla motoru";
		}catch(Exception e) {
			e.printStackTrace();
		}
		FileInputStream file = new FileInputStream("peth");
		

	}

}
