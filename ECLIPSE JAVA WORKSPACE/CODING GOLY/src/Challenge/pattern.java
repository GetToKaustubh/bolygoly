package Challenge;

import java.util.*;
public class pattern {
	public static void main(String[] args) {
		Scanner S = new Scanner (System.in);
		int n = S.nextInt();
		int i=1;
		char ch='A';
		while (i<=n) 
		{
			ch='A';
			int j=1;
			while (j<=n)
			{
				
				System.out.print(ch+" ");
				ch++;
				j++;
			}

			System.out.println();
			i++;
		}
	}
}
