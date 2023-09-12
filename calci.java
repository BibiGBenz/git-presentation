import java.util.Scanner;
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
public class Driver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		Demo D=new Demo();
		System.out.println(a+"+"+b+"="D.add(a,b));
		System.out.println(a+"-"+b+"="D.sub(a,b));
		System.out.println(a+"*"+b+"="D.multi(a,b));
	}
}