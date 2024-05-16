package calisma1;
import java.awt.print.Printable;
import java.util.Scanner;

public class calisma {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		sinif ogr1=new sinif();
		System.out.println("ogrenci adını giriniz : ");
		String name= scanner.next();
		ogr1.setname(name);
		System.out.println("ogrenci yaşını giriniz : ");
		int yas=scanner.nextInt();
		ogr1.setyas(yas);
		scanner.nextLine();//satır sonu karakterini tüketmek için
		System.out.println("ogrencinin bölümünü giriniz : ");
		String bolum= scanner.nextLine();
		ogr1.setbolum(bolum);
		System.out.println("ogrencinin adi : "+ogr1.getname());
		System.out.println("ogrencinin yasi : "+ogr1.getyas());
		System.out.println("ogrencinin bolumu : "+ogr1.getbolum());
	}
}
