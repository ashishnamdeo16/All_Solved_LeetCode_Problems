import java.util.*;

class Solution {
    int[][] possibleMoves = {
        {1,2},{2,1},{2,-1},{1,-2},
        {-1,-2},{-2,-1},{-2,1},{-1,2}
    };

    public int minKnightMoves(int x, int y) {

        Queue<Cordinates> que = new ArrayDeque<>();

        int offset = 303;
        int N = 607;
        boolean[][] visited = new boolean[N][N];

        que.add(new Cordinates(0, 0));
        visited[offset][offset] = true;

        int level = 0;

        while (!que.isEmpty()) {
            int size = que.size();

            for (int i = 0; i < size; i++) {
                Cordinates p = que.poll();

                if (p.x == x && p.y == y) return level;

                for (int j = 0; j < possibleMoves.length; j++) {
                    int newX = p.x + possibleMoves[j][0];
                    int newY = p.y + possibleMoves[j][1];

                    int vx = newX + offset;
                    int vy = newY + offset;

                    if (vx < 0 || vy < 0 || vx >= N || vy >= N) continue;

                    if (!visited[vx][vy]) {
                        visited[vx][vy] = true;
                        que.add(new Cordinates(newX, newY));
                    }
                }
            }
            level++;
        }
        return -1;
    }

    public class Cordinates {
        int x, y;
        public Cordinates(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
