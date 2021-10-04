package Challenge;
import java.util.*;
public class hands {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[5];
		int b[]=new int[5];
		int d=n%10;
		int s=n/10;
		for(int i=0;i<5;i++)
		{
			if(d==0)
				break;
			if(d>=5)
				{
				d=d-5;
				a[0]=1;
				}
		
			else
			{
				if(d==4)
				{
					d=d-4;
					a[1]=1;
					a[2]=1;
					a[3]=1;
					a[4]=1;
					
				}
				else if(d==3)
				{
					d=d-3;
					a[2]=1;
					a[3]=1;
					a[4]=1;
				}
				else if(d==2)
				{
					d=d-2;
					a[3]=1;
					a[4]=1;
				}
				else
				{
					d=d-1;
					a[4]=1;
				}
					
			}
		}
			for(int i=0;i<5;i++)
			{
				if(s==0)
					break;
				if(s>=5)
					{s=s-5;
					b[4]=1;
					}
			
				else
				{
					if(s==4)
					{
						s=s-4;
						b[1]=1;
						b[2]=1;
						b[3]=1;
						b[0]=1;
						
					}
					else if(s==3)
					{
						s=s-3;
						b[2]=1;
						b[1]=1;
						b[0]=1;
					}
					else if(s==2)
					{
						s=s-2;
						b[1]=1;
						b[0]=1;
					}
					else
					{s=s-1;
					
						b[0]=1;
					}
						
				}
		}
			for(int i=0;i<5;i++)
				System.out.print(b[i]+" ");
			for(int i=0;i<5;i++)
				System.out.print(a[i]+" ");
				
		
		sc.close();
	}

}
