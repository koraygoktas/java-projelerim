
public class mongodatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("mongo güncellendi");
		
	}

	@Override
	void get() {
		System.out.println("mongo verileri aldı");
		
	}

}
