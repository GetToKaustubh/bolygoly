package Challenge;
import java.util.*;
public class eatthechocolates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> a=new ArrayList<Integer>();		
		for(int i=1;i<=n;i++)
		{
			int c=1;
			long k=sc.nextLong();
			if(k==1)
				a.add(1);
			else if(k==2)
				a.add(2);
			else if(k==3)
				a.add(3);
			else
			{
				c=1;
				int count=0;
				long b=k;
				while(k!=0)
				{
					k=k-c;
					count++;
		//			System.out.print(c+"\t");
					if(k>b/2)
						c++;
					else
					{
						c--;
						if(k>0 && c<=0)
						{
							c=1;
						}
						
						
						
					}
					
				}
				a.add(count);
			}
		}
		System.out.println();
		for(Integer k:a)
		{
			System.out.println(k);
		}
		sc.close();
	}

}
