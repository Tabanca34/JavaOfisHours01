package JavaOfisHours01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Soru07 {



	public static void main(String[] args) {
	String str = new String("Ilovejavatoo");
	List<Character> charlist= new ArrayList<>();
	for (int i = 0; i < str.length(); i++) {
		charlist.add(str.charAt(i));
			
		}
	//System.out.println(charlist);
	tekrarlıKarakterler((ArrayList<Character>) charlist);
	} 
	public static void tekrarlıKarakterler(ArrayList<Character> charlist) {
		String tekrarlılar = "";
		
		for (int i = 0; i < charlist.size(); i++) {
			for (int j = i+1; j <charlist.size(); j++) {
				if(charlist.get(i)== charlist.get(j)&& !tekrarlılar.contains(charlist.get(i)+ "")){
				tekrarlılar += charlist.get(i);
			}
			
		}
	}
System.out.println(tekrarlılar);
	}
	

}
