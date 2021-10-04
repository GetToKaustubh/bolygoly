import java.util.*;
//WAP to print n natural number take n from user
//example:
//	input
//	5
//	output
//	1
//	2
//	3
//	4
//	5
public class naturalnumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i);
		}
		s.close();
		
		

	}
}
