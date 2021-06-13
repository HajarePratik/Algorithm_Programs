package com.datastructure.datastucture_programs;

public class BinarySearchWord 
{

	public static int binarySearch(String[] arr, String Name) 
	{
		int a = 0, b = arr.length - 1;
		while (a <= b) 
		{
			int m = a + (b - a) / 2;

			int res = Name.compareTo(arr[m]);

			// Check if x is present at mid
			if (res == 0)
				return m;

			// If x greater, ignore left side
			if (res > 0)
				a = m + 1;

			// If x is smaller, ignore right side
			else
				b = m - 1;
		}

		return -1;
	}

	public static void main(String[] args) 
	{

		// Passing a value to the array
		String[] arr = { "Pratik", "Murtaza", "Sandesh", "Parth" };
		String Name = "Murtaza";
		int result = binarySearch(arr, Name);

		// Checking the value is present or not
		if (result == -1)
			System.out.println("Name is not Present");
		else
			System.out.println("Name is Present at " + "Position " + result);
	}

}
