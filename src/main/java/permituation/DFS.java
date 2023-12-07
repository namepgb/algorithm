package main.java.permituation;

/**
 * DFS는 그래프(또는 배열의 형태로 표현되는)를 깊이 우선 탐색합니다.
 * <br>순열을 구하는 방법으로 DFS를 사용합니다.
 * <br>Swap을 사용한 구현과 달리 DFS로 구한 순열 목록은 사전적 순서를 보장합니다.
 * <br>
 * <br>e.g) 배열 [1, 2, 3]에서 3개의 값을 뽑는 순열은 다음과 같습니다.
 * <ul>
 *     <li>[1, 2, 3]</li>
 *     <li>[1, 3, 2]</li>
 *     <li>[2, 1, 3]</li>
 *     <li>[2, 3, 1]</li>
 *     <li>[3, 1, 2]</li>
 *     <li>[3, 2, 1]</li>
 * </ul>
 * @see <a href="https://namepgb.tistory.com/272">블로그 문서: DFS를 사용한 순열 구하기</a>
 * @author namepgb
 */
public class DFS
{
	/**
	 * 함수를 호출하여 순열을 계산합니다.
	 * @param arr 순열을 계산하려는 소스 배열입니다.
	 * @param out DFS로 계산되고 있는 순열입니다.
	 * @param visited DFS로 방문된 원소에 대한 마킹입니다.
	 * @param depth 이 함수를 호출할 때 <b>0</b>을 입력합니다. 재귀적으로 호출되면서 1씩 증가합니다.
	 * @param r 순열을 계산하려는 소스 배열에서 <b>r</b>개의 수를 뽑습니다.
	 */
	protected static void permutation(int[] arr,
	                                  int[] out,
	                                  boolean[] visited,
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
			if (visited[i])
				continue;
			// 현재 인덱스를 방문 마킹하고 순열의 원소를 구성합니다.
			visited[i] = true;
			out[depth] = arr[i];
			// depth를 한 칸 이동합니다.
			permutation(arr, out, visited, depth + 1, r);
			// 현재 인덱스를 방문 취소하고 순열의 원소를 롤백합니다(원위치).
			out[depth] = 0;
			visited[i] = false;
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
