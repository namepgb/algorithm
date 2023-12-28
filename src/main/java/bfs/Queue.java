package main.java.bfs;

import java.util.*;

/**
 * 이중 배열로 표현되는 격자의 각 노드를 BFS로 탐색합니다.
 * <br>격자를 표현하는 이중 배열은 boolean[][] 타입입니다.
 * <br>e.g) 다음 격자에서 xy(0,0)에서 시작하여 좌, 상, 우, 하 순서로 BFS를 실행하면
 * <ul>
 *     <li>O X X</li>
 *     <li>O O O</li>
 *     <li>O X O</li>
 * </ul>
 * 탐색 경로는 xy(0,0) -> xy(0,1) -> xy(1,1) -> xy(0,2) -> xy(2,1) -> xy(2,2)입니다.
 * @see <a href="https://namepgb.tistory.com/269">블로그 문서: 너비 우선 탐색(BFS, Breadth-First Search)</a>
 * @author namepgb
 */
public class Queue
{
	/**
	 * 노드의 좌표(x,y)를 표현합니다.
	 */
	public static class Node
	{
		public int x;
		public int y;
		
		public Node(int x,
		            int y)
		{
			this.x = x;
			this.y = y;
		}
	}
	
	/**
	 * 입력된 인자(노드 리스트)에 대해서 BFS를 실행합니다.
	 * @param grid 탐색을 하려는 격자입니다.
	 */
	protected static void bfs(boolean[][] grid)
	{
		int h = grid.length;
		int w = grid[0].length;
		int[] dx = new int[] { -1, 0, 1, 0 };
		int[] dy = new int[] { 0, -1, 0, 1 };
		boolean[][] visited = new boolean[h][w];
		
		java.util.Queue<Node> queue = new LinkedList<>();
		List<Node> result = new ArrayList<>();
		
		// 시작 노드 좌표
		int nx = 0, ny = 0;
		// 시작 노드를 방문합니다.
		visited[ny][nx] = true;
		queue.offer(new Node(nx, ny));
		
		// 큐가 빈 상태가 될때까지 반복합니다.
		while (!queue.isEmpty())
		{
			// 큐에서 가장 먼저 탐색된 노드 기준으로 주변을 탐색합니다.
			// 이때 큐에서 제거된 노드는 탐색 완료되었음을 의미합니다.
			Node node = queue.poll();
			result.add(node);
			
			// 탐색 방향은 노드 기준으로 4방향(좌,상,우,하 순서)입니다.
			for (int i = 0; i < 4; ++i)
			{
				// 탐색하려는 노드의 좌표입니다.
				nx = node.x + dx[i];
				ny = node.y + dy[i];
				
				// 격자를 벗어나는 경우는 탐색 할 수 없습니다.
				if (nx < 0 || ny < 0 || nx >= w || ny >= h)
					continue;
				// 장애물이 있는 노드는 탐색 할 수 없습니다.
				if (!grid[ny][nx])
					continue;
				// 이미 방문한 노드는 탐색 할 수 없습니다.
				if (visited[ny][nx])
					continue;
				
				// 탐색하려는 노드를 방문합니다.
				visited[ny][nx] = true;
				queue.offer(new Node(nx, ny));
			}
		}
		
		printResult(result);
	}
	
	/**
	 * 탐색 경로에 따라서 각 노드의 좌표(x, y)를 표시합니다.
	 * @param result 탐색이 완료된 노드입니다.
	 */
	static void printResult(List<Node> result)
	{
		for (Node node : result)
		{
			System.out.print("(" + node.x + "," + node.y + ") ");
		}
		
		System.out.print("\n");
	}
}
