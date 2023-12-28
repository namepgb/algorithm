package main.java.bfs;

/**
 * 정해진 테스트 셋에 따라서 {@link Queue#bfs(boolean[][])}을 실행합니다.
 * @see <a href="https://namepgb.tistory.com/269">블로그 문서: 너비 우선 탐색(BFS, Breadth-First Search)</a>
 * @author namepgb
 */
public class QueueTest
{
	public static void main(String[] args)
	{
		testcase(1, new boolean[][] { {true, false, false}, {true, true, true}, {true, false, true} });
	}
	
	static void testcase(int testcase,
	                     boolean[][] grid)
	{
		System.out.println("***************************");
		System.out.println("* testcase : " + testcase);
		System.out.println("* inputs : ");
		for (boolean[] row : grid)
		{
			for (boolean v : row)
				System.out.print((v == true) ? "O " : "X ");
			System.out.println(" ");
		}
		System.out.println("* result : ");
		Queue.bfs(grid);
		System.out.print("\n");
	}
}
