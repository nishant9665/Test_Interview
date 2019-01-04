package abstractInterfaceQuestion;

	interface it2
	{
	void m1();
	void m2();
	void m3();
	}
	abstract class Test2 implements it2
	{
	public void m1()
			{
			System.out.println("m1- method");
			}
	}
	abstract class Test3 extends Test2{
		public void m2()
		{
			System.out.println("m2- method");
		}
	}
	 class Test4 extends Test3{
		public void m3()
		{
			System.out.println("m3- method");
		}
		public static void main(String[] args)
		{
		Test4 t=new Test4();
		t.m1();
		t.m2();
		t.m3();
		
		// also we can declare as
		
		it2 i =new Test4();
		i.m1();
		i.m2();
		i.m3();
	}
	
	
	
	}
	

