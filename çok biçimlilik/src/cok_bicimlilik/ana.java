package cok_bicimlilik;

class Animal {
	private String name;

	public Animal(String name) {
		
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void speak()
	{
		System.out.println("hayvan konuşuyor..");
	}
}
class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName()+" ötüyor...");
	}
	
}
class Dog extends Animal{

	public Dog(String name) {
		super(name);
	}
	@Override
	public void speak() {
		System.out.println(getName()+" havlıyor...");
	}
	
}

public class ana {
	
	public static void speaktry(Animal animal) {
		animal.speak();
	}
	
	public static void main(String[] args) {
		Animal animal =new Animal("hayvan");
		Bird bird=new Bird("limon");
		Dog dog =new Dog("meriç");
		
		animal.speak();
		bird.speak();
		dog.speak();
		Animal animal2= new Dog("karabaş");
		animal2.speak(); 
		
		
		speaktry(new Dog("kemal"));
	}

}
