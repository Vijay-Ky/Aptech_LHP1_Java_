class Manager8
{
	static void test(Object a1)
	{
		System.out.println("from test");
	}
	public static void main(String[] args)
	{
		test(new A());
		test(new B());
		test(new C());
		test(new D());
		B b1 = new B();
		test(b1);
		D d1 = new D();
		test(d1);
		System.out.println("done");
	}
}