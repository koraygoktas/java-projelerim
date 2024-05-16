package arraylistler;
import java.util.ArrayList;
public class liste {

	public static void main(String[] args) {
		ArrayList<String> groups =new ArrayList<String>();
		groups.add("koray");
		groups.add("gülşah");
		groups.add("gülcan");
		groups.add("mehmet");
		System.out.println("arraylist uzunluk:"+ groups.size());
		System.out.println("arraylistin 2. elemanı "+ groups.get(1));
		groups.remove(0);//2 seçenek oluyor bi intle parametre alan bir de objeyle yani koray diyerek
		System.out.println("arraylistin yeni 1. elemanı "+groups.get(0));
		System.out.println("arraylistin uzuluğu "+groups.size());
		System.out.println(groups.indexOf("mehmet"));
		
		for(String s:groups)
		{
			System.out.println("eleman "+s);//foreach kullanımı
		}
		
		int arr[]= {4,2,8};
		for(int i:arr)
		{
			System.out.println("eleman : "+i);
		}
	}

}
