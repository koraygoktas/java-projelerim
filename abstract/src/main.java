

public class main {

	public static void main(String[] args) {
	
		AbstractDatabase abda1=new mongodatabase();
		AbstractDatabase abda2=new mysqldatabase();
		abda1.add();
		abda1.get();
		abda2.delete();
		abda2.update();
	}

}
