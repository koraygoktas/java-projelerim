package constructor;

public class ozelliikler {

	public static void main(String[] args) {
		yapici car1 = new yapici("gümüş","audi",4,2013);
		yapici car2 = new yapici("gümüş","audi");
		yapici car3 = new yapici();
		
		car1.showInfos();
		car2.showInfos();
		car3.showInfos();
	}
	

}
