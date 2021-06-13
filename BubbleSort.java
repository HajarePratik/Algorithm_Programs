package com.datastructure.datastucture_programs;

public class BubbleSort 
{

	public void bubblesort(int arr[]) 
	{
		
		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) 
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}
	public void printsortedarray(int arr[]) 
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
	}
	
	public static void main(String args[]) 
	{

		int arr[] = {22,85,43,54,11,32};
		BubbleSort bs = new BubbleSort();
		bs.bubblesort(arr);
		System.out.println("Sorted array");
		bs.printsortedarray(arr);
	}

}
