package arayuzkasim;



	interface A{
		double pi=3.14194837439;
		void a();
	}
	interface B{
		void b();
	}
	interface C extends A{
		void c();
	}	
	 class D implements B,C{
		//D implemente edildiği için C,A ve b deki metodları override etmeli
		//A yı da etmeli çünkü 
		@Override
		public void a() {
			System.out.println("this is a");
		}
		@Override
		public void b() {
			System.out.println("this is b");
		}
		@Override
		public void c() {
			System.out.println("this is c");
		}
	}

