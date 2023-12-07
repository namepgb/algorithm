package main.java.permituation;

import java.util.Arrays;

/**
 * 정해진 테스트 셋에 따라서 {@link DFS#permutation(int[], int[], boolean[], int, int)}을 실행합니다.
 * @see <a href="https://namepgb.tistory.com/272">블로그 문서: DFS를 사용한 순열 구하기</a>
 * @author namepgb
 */
public class DFSTestcase
{
	public static void main(String[] args)
	{
		testcase(1, new int[] { 1, 2, 3 }, new int[3], new boolean[3], 0, 3);
		testcase(2, new int[] { 1, 2, 3, 4 }, new int[4], new boolean[4], 0, 3);
		testcase(3, new int[] { 1, 2, 3 }, new int[3], new boolean[3], 0, 1);
	}
	
	static void testcase(int testcase,
	                     int[] arr,
	                     int[] out,
	                     boolean[] visited,
	                     int depth,
	                     int r)
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
