
public class mysqldatabase extends AbstractDatabase{

	@Override
	void update() {
		System.out.println("mysql güncellendi");
		
	}

	@Override
	void get() {
		System.out.println("mysql verileri aldı");
		
	}
	
}
