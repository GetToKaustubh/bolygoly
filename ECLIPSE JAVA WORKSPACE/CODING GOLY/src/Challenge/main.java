package Challenge;

//Java program Find concatenated string with
//uncommon characters of given strings
import java.util.*;
import java.lang.*;
import java.io.*;

class main {
	public static char[] concatenatedString(char[] str1, char[] str2)
	{
		// Result
		String s1=String.valueOf(str1);
		String s2=String.valueOf(str2);
		if(s1.isEmpty() && s2.isEmpty())
		{
			char cs[]=new char[0];
			return cs;
		}

			String res = "";
		int i;

		// creating a hashMap to add characters in string s2
		HashMap<Character, Integer> m = new HashMap<Character, Integer>();
		for (i = 0; i < s2.length(); i++)
			m.put(s2.charAt(i), 1);

		// Find characters of s1 that are not
		// present in s2 and append to result
		for (i = 0; i < s1.length(); i++)
			if (!m.containsKey(s1.charAt(i)))
				res += s1.charAt(i);
			else
				m.put(s1.charAt(i), 2);

		// Find characters of s2 that are not
		// present in s1.
		for (i = 0; i < s2.length(); i++)
			if (m.get(s2.charAt(i)) == 1)
				res += s2.charAt(i);
				
		int length1=res.length();
		char result[]=new char[length1];
		for(int it=0;it<result.length;it++)
		result[it]=res.charAt(it);

		return result;
	}

	// Driver code
	public static void main(String[] args)
	{
		char[] s1 = {'a','b','c','s'};
		char[] s2 = {'c','x','z','c','a'};
		char res[]=concatenatedString(s1, s2);
		for(int it=0;it<res.length;it++)
		System.out.print(res[it]);
	}
}

/* This code is contributed by Devarshi_Singh*/
