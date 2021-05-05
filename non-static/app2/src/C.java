class C
{
	int i;
	C()
	{
		System.out.println("C()");
		this.i = 20;
	}
	public static void main(String[] args)
	{
		C c1 = new C();
		System.out.println("-----");
		System.out.println(c1.i);
	}
}