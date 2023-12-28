package main.java.duppermituation;

import java.util.Arrays;

/**
 * 정해진 테스트 셋에 따라서 {@link Array#duppermutation(int[], int[], int, int)}을 실행합니다.
 * @see <a href="https://namepgb.tistory.com/288">블로그 문서: 중복 순열 구하기</a>
 * @author namepgb
 */
public class ArrayTest
{
	public static void main(String[] args)
	{
		testcase(1, new int[] { 1, 2 }, 0, 2);
		testcase(2, new int[] { 1, 2, 3 }, 0, 2);
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
		Array.duppermutation(arr, new int[r], depth, r);
		System.out.print("\n");
	}
}
