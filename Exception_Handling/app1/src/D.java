class A
{
}
class B extends A
{
}
class C extends B
{
}
class D extends C
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new C();
		D d1 = (D) a1;
		System.out.println("main end");
	}
}
