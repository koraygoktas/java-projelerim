package arayuzkasim;


//soruda grafikle oluşturmanı isterse düz çizgililer extendi kesik çizgililer impelemnti temsil eder
public class asil {
	//arayüzlerde implements ile çoklu miras alabilme özelliği var
	//abstractlarda çoklu miras özelliği yok
	//abstract classlar bir class tarafından extend edilebiliyorken interfaceler edilemez
	//bir interface bir class tarafından ancak implemente edilebilir
	//abstractlarda yapıcı classlar(constructor) varken interfacelerde yok
	public static void main(String[] args) {
	B ilk= new D();//sağ tarafta bir interface olamaz newin yanında yani
	ilk.b();
	((D)ilk).c();//downcasting ile c ye b üzerinden erişebiliriz
	}

}
