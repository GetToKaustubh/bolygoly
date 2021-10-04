// JAVA program to check whether two strings
// are anagrams of each other
//import java.io.*;
import java.util.*;

public class anagram {

	/* function to check whether two strings are
	anagram of each other */
	static boolean areAnagram(char[] str1, char[] str2)
	{
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same,
		// then they cannot be anagram
		if (n1 != n2)
			return false;

		// Sort both strings
		Arrays.sort(str1);
		Arrays.sort(str2);

		// Compare sorted strings
		for (int i = 0; i < n1; i++)
			if (str1[i] != str2[i])
				return false;

		return true;
	}

	/* Driver Code*/
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s2=sc.next();
		s=s.toLowerCase();
		s2=s2.toLowerCase();
		char str1[]=new char[s.length()];
		char str2[]=new char[s2.length()];
		for(int i=0;i<s.length();i++)
			str1[i]=s.charAt(i);
		for(int i=0;i<s2.length();i++)
			str2[i]=s2.charAt(i);
		
		// Function Call
		if (areAnagram(str1, str2))
			System.out.println(true);
		else
			System.out.println(false);
	sc.close();
	}
}
