package main.java.permituation_duplicated;

/**
 * 중복 순열을 구하는 방법으로 배열과 재귀 호출을 사용합니다.
 * <br>
 * <br>e.g) 배열 [1, 2, 3]에서 2개의 값을 뽑는 중복 순열은 다음과 같습니다.
 * <ul>
 *     <li>[1, 1]</li>
 *     <li>[1, 2]</li>
 *     <li>[1, 3]</li>
 *     <li>[2, 1]</li>
 *     <li>[2, 2]</li>
 *     <li>[2, 3]</li>
 *     <li>[3, 1]</li>
 *     <li>[3, 2]</li>
 *     <li>[3, 3]</li>
 * </ul>
 * @see <a href="https://namepgb.tistory.com/272">블로그 문서: DFS를 사용한 순열 구하기</a>
 * @author namepgb
 */
public class Array
{
	/**
	 * 함수를 호출하여 순열을 계산합니다.
	 * @param arr 순열을 계산하려는 소스 배열입니다.
	 * @param out 계산되고 있는 순열입니다.
	 * @param depth 이 함수를 호출할 때 <b>0</b>을 입력합니다. 재귀적으로 호출되면서 1씩 증가합니다.
	 * @param r 순열을 계산하려는 소스 배열에서 <b>r</b>개의 수를 뽑습니다.
	 */
	protected static void duppermutation(int[] arr,
	                                     int[] out,
	                                     int depth,
	                                     int r)
	{
		if (depth == r)
		{
			printResult(out, r);
			return;
		}
		
		for (int i = 0; i < arr.length; ++i)
		{
			out[depth] = arr[i];
			// depth를 한 칸 이동합니다.
			duppermutation(arr, out, depth + 1, r);
			// 현재 인덱스를 방문 취소하고 순열의 원소를 롤백합니다(원위치).
			out[depth] = 0;
		}
	}
	
	/**
	 * 현재 배열의 상태를 출력합니다.
	 * <br>이 함수에서 출력되는 배열은 완성된 하나의 순열입니다.
	 * @param arr 순열을 계산 중인 배열입니다.
	 * @param r 순열을 계산 중인 배열에서 <b>r</b>개의 수를 뽑습니다.
	 */
	static void printResult(int[] arr,
	                        int r)
	{
		for (int i = 0; i < r; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		
		System.out.print("\n");
	}
}
