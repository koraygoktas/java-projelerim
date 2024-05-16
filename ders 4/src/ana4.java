import java.awt.desktop.PrintFilesEvent;
import java.nio.LongBuffer;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class ana4 {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//byte= -128 ile 127 değerleri arasını alır. 1 byte yer kaplar
		byte sayi=125;
		System.out.println(sayi);
		// short= -32768 ile 32767 arasında değerleri alır 2 bytetır
		short sayi2=-3124;
		System.out.println(sayi2);
		//int = 9 basmaağa kadar değer alabilirim. 4 byte yer kaplar
		int sayi3=83028302;
		System.out.println(sayi3);
		//long =çok büyük sayılar tanımlamak için kullanılır. 8 byte yer kaplar
		//bu veri tiplerinin baş harfini büyük yazarsan farklı olur.birçok özellik kullanabilir olursun.
		long a=Long.MAX_VALUE;//long değerinin alabileceği max değeri aldı a
		System.out.println(a);
		// long veri tipinde intin alabileceği sayıdan buyuk bir şey yazdığında sistem hata verecek
		//intin alamayacağı bir değer yazdın diyecek. o yüzden long olarak yazdığın sayının sonuna
		//L koyman lazım
		long sayi10= 840384094823949L;
		System.out.println(sayi10);
		//float= ondalıklı sayıları yazmak için kullanıılr. virgülden sonra 7 sayi yazbailirsin
		float sayi11= Float.MAX_VALUE;
		float sayi12= Float.MIN_VALUE;
		System.out.println(sayi11);
		System.out.println(sayi12);
		float sayi21=7.8928321f;
		System.out.println(sayi21);
		//double= ondalıklı sayıları yazmak için kullanılan bir veri tipidir.
		//noktadan sonra 17 basamak yazılabilir.8 byte
		//double ve intte sayıdan sonra l veya f gibi şeyler koymamıza gerek yoktur
		boolean b=5<6;
		System.out.println(b);
		//char karakaterler içindir. tek tırnaklar içerisinde yazılır.2 byte
		//stringler ise çift tırnak içerisinde yazılır
		char karakter='k';
		System.out.println(karakter);
		//stringin küçük harflisi yok
		String metin ="koray"+" 2004 doğumluyum";
		System.out.println(metin);
	}

}
