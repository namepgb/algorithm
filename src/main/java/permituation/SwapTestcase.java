package main.java.permituation;

import java.util.Arrays;

/**
 * 정해진 테스트 셋에 따라서 {@link Swap#permutation(int[], int, int)}을 실행합니다.
 * @see <a href="https://namepgb.tistory.com/271">블로그 문서: Swap을 사용한 순열 구하기</a>
 * @author namepgb
 */
public class SwapTestcase
{
	public static void main(String[] args)
	{
		testcase(1, new int[] { 1, 2, 3 }, 0, 3);
		testcase(2, new int[] { 1, 2, 3, 4 }, 0, 3);
		testcase(3, new int[] { 1, 2, 3 }, 0, 1);
	}
	
	static void testcase(int testcase,
	                     int[] arr,
	                     int depth,
	                     int r)
	{
		System.out.println("***************************");
		System.out.println("* testcase : " + testcase);
		System.out.println("* inputs : " + Arrays.toString(arr));
		System.out.println("* count : " + r);
		System.out.println("* result : ");
		Swap.permutation(arr, depth, r);
		System.out.print("\n");
	}
}
