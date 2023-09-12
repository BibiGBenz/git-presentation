interface calci
{
	int add(int a,int b);
	int sub(int a,int b);
	int multi(int a,int b);
}
public class Demo{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int sub(int a, int b)
	{
		return a-b;
	}
	public int multi(int a, int b)
	{
		return a*b;
	}
}