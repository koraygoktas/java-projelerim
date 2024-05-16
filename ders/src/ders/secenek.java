package ders;

public class secenek {
	
	private String color;
	private String name;
	private int model;
	
	public void setColor(String color) {
		this.color=color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getColor() {
		return this.color;
	}
}

/*Eğer bir sınıfı private olarak tanımlarsanız, 
 * o sınıfa sadece aynı sınıf içinden erişebilirsiniz.
 *  Ancak, aynı paket içindeki diğer sınıflar bu sınıfa 
 *  erişim sağlayamazlar. Bu, o sınıfın yalnızca kendi 
 *  içinde kullanılmasını istediğinizde kullanışlı olabilir.*/
