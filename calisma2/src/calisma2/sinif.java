package calisma2;

public class sinif {
	private String name;
	private String bolum;
	private int yas;
	
	public sinif() {
		this("bilgi yok","bilgi yok",0);
	}
	public sinif(String name,int yas) {
		this(name,"bilgi yok",0);
	}
	public sinif(String name,String bolum,int yas) {
		this.name=name;
		this.bolum=bolum;
		this.yas=yas;
	}
	
	
	public void showinfos() {
		System.out.println("ogrencinin adi : "+this.name);
		System.out.println("ogrencinin bolumu : "+this.bolum);
		System.out.println("ogrencinin yaşı : "+this.yas);
		System.out.println("\n");
	}
	
}
