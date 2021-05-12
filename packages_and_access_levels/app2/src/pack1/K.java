package pack1;
class J
{
	private int x;
	int y;//default/package/friendly 
}
class K extends J 
{
	public static void main(String[] args) 
	{
		K k1 = new K();
		System.out.println(k1.x);
		System.out.println(k1.y);
	}
}
