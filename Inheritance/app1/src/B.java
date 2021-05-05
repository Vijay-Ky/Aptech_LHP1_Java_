class A
{
	int i;
	int j;
	void test()
	{
		System.out.println("from test");
	}
}
class B extends A
{
	public static void main(String[] args)
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
		b1.test();
	}
}