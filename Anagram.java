package com.datastructure.datastucture_programs;

import java.util.Arrays;

public class Anagram 
{

	static boolean checkAnagram(char[] str1, char[] str2) 
	
	{
		int n1 = str1.length;
		int n2 = str2.length;

		// If length of both strings is not same, then they cannot be anagram
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

	public static void main(String args[]) 
	{
		// array of two strings
		char str1[] = { 'm', 'a', 'd', 'a', 'm' };
		char str2[] = { 'm', 'a', 'd', 'a', 'm' };

		if (checkAnagram(str1, str2))
			System.out.println("The Two Strings are" + " Anagram of each other");
		else
			System.out.println("The Two Strings are Not" + " Anagram of each other");
	}
}
