package main.java.permituation;

public class DFS
{
	protected static void permutation(int[] arr, int[] out, boolean[] visited, int depth, int r)
	{
		if (depth == r)
		{
			printResult(out, r);
			return;
		}

		for (int i = 0; i < arr.length; ++i)
		{
			if (visited[i])
				continue;
			visited[i] = true;
			out[depth] = arr[i];
			permutation(arr, out, visited, depth + 1, r);
			// 원위치
			out[depth] = 0;
			visited[i] = false;
		}
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
