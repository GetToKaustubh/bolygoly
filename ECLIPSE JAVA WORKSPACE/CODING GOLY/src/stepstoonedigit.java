import java.util.*;
public class stepstoonedigit 
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		String s=""+n;
		int c=0;
		if(s.length()<=1)
		{
			System.out.println(c);
		}
		else
		{
			long a=n;
			while(n>=10)
			{
				a=n;
				long sum=0;
				while(a!=0)
				{
					long d=a%10;
					sum=sum+d;
					a=a/10;
				}
				c++;
				n=sum;
			}
			System.out.println(c);
		}
		sc.close();
	}
}
