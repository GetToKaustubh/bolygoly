import java.util.*;
public class duplicacy 
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		String s="";
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			s=s+""+a[i];
		}
		int k=s.length();
		char ch[]=new char[k];
		for(int i=0;i<k;i++)
		{
			ch[i]=s.charAt(i);
		}
		Arrays.sort(ch);
		for(int i=0;i<k-1;i++)
		{
			if(ch[i]!=ch[i+1])
			{
				System.out.print(ch[i]+" ");
			}
		}
		if(ch[k-1]!=ch[k-2])
		{
			System.out.print(ch[k-1]+" ");
		}
		sc.close();
	}
}
