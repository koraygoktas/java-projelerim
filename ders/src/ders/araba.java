package ders;

public class araba {

	public static void main(String[] args) {
		
		secenek car1 =new secenek();
		car1.setColor("beyaz");
		System.out.println("arabanın rengi:"+ car1.getColor());
		car1.setName("audi");
		System.out.println("arabanın adı:"+ car1.getName());
		car1.setModel(2013);
		System.out.println("arabanın rengi:"+ car1.getModel());
	}

}
