package main.java.permituation;

public class Swap
{
	protected static void permutation(int[] arr, int depth, int r)
	{
		if (depth == r)
		{
			printResult(arr, r);
			return;
		}
		
		for (int i = depth; i < arr.length; ++i)
		{
			// 현재 인덱스와 뒤의 요소를 스왑
			swap(arr, depth, i);
			// depth를 한 칸 이동
			permutation(arr, depth + 1, r);
			// 현재 인덱스와 뒤의 요소를 스왑(원위치)
			swap(arr, depth, i);
		}
	}
	
	static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void printResult(int[] arr, int r)
	{
		for (int i = 0; i < r; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n");
	}
}
