import java.util.Scanner;

public class grlnsyingtfmipztfmi {
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.print("lütfen bir sayý giriniz");
		double sayi = reader.nextDouble();
		if(sayi<0) {
			System.out.println(sayi+" sayýsý negatiftir");
		}
		if (sayi>0) {
			System.out.println(sayi+" sayýsý pozitiftir ");
		}
		if (sayi==0) {
		 System.out.println(sayi+" sayýsý sýfýrdýr");
		}
	}

}
