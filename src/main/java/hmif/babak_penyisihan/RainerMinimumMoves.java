package hmif.babak_penyisihan;

import java.util.LinkedList;
import java.util.Queue;

public class RainerMinimumMoves {

  public static int solution(
    int n,
    int start_row,
    int start_col,
    int end_row,
    int end_col
  ) {
    boolean[][] visited = new boolean[n][n];
    visited[start_row - 1][start_col - 1] = true;
    Queue<int[]> queue = new LinkedList<>();
    queue.add(new int[] { start_row - 1, start_col - 1, 0 });
    int[][] moves = {
      { 2, 1 },
      { 1, 2 },
      { -2, 1 },
      { -1, 2 },
      { 2, -1 },
      { 1, -2 },
      { -2, -1 },
      { -1, -2 },
    };

    while (!queue.isEmpty()) {
      int[] curr = queue.poll();
      if (curr[0] == end_row - 1 && curr[1] == end_col - 1) {
        return curr[2];
      }
      for (int[] move : moves) {
        int next_row = curr[0] + move[0];
        int next_col = curr[1] + move[1];
        if (
          next_row >= 0 &&
          next_row < n &&
          next_col >= 0 &&
          next_col < n &&
          !visited[next_row][next_col]
        ) {
          visited[next_row][next_col] = true;
          queue.add(new int[] { next_row, next_col, curr[2] + 1 });
        }
      }
    }
    return -1;
  }
}
