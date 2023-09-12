import java.util.Scanner;
interface calci
{
	int add(int a,int b);
	int sub(int a,int b);
	int multi(int a,int b);
}
class Demo{
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
class Driver
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd number:");
		int b=sc.nextInt();
		Demo D=new Demo();
		System.out.println(a+"+"+b+"="+D.add(a,b));
		System.out.println(a+"-"+b+"="+D.sub(a,b));
		System.out.println(a+"*"+b+"="+D.multi(a,b));
	}
}