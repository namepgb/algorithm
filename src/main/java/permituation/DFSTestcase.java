package main.java.permituation;

import java.util.Arrays;

public class DFSTestcase
{
	public static void main(String[] args)
	{
		testcase(1, new int[] { 1, 2, 3 }, new int[3], new boolean[3], 0, 3);
		testcase(2, new int[] { 1, 2, 3, 4 }, new int[4], new boolean[4], 0, 3);
		testcase(3, new int[] { 1, 2, 3 }, new int[3], new boolean[3], 0, 1);
	}
	
	static void testcase(int testcase, int[] arr, int[] out, boolean[] visited, int depth, int r)
	{
		System.out.println("***************************");
		System.out.println("* testcase : " + testcase);
		System.out.println("* inputs : " + Arrays.toString(arr));
		System.out.println("* count : " + r);
		System.out.println("* result : ");
		DFS.permutation(arr, out, visited, depth, r);
		System.out.print("\n");
	}
}
