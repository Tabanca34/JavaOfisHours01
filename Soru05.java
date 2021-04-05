package JavaOfisHours01;

public class Soru05 {

	public static void main(String[] args) {
		//Bir Array'e uzunlugundan fazla eleman eklemeye calisin ve karsilasicaginiz Exception
		
		int arr[]= {2,15,67,2,56};
		try {
		arr[5]=23;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array'ýn uzunlugundan fazla eleman ekleyemezssiniz");
		}

	}

}
