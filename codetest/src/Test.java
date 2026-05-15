import java.util.*;

public class Test {

    // 오른쪽, 아래, 왼쪽, 위
    static int[] dr = {0, 1, 0, -1};
    static int[] dc = {1, 0, -1, 0};
    static String[] dirName = {"오른쪽", "아래", "왼쪽", "위"};

    static class State {
        int row;
        int col;
        boolean usedJump;
        int time;

        State(int row, int col, boolean usedJump, int time) {
            this.row = row;
            this.col = col;
            this.usedJump = usedJump;
            this.time = time;
        }

        @Override
        public String toString() {
            return "(" + row + ", " + col + ", " + usedJump + ", " + time + ")";
        }
    }

    public static void main(String[] args) {

        int n = 3;
        int m = 3;
        int[][] hole = {
                {2, 2},
                        };

        int result = solution(n, m, hole);
        System.out.println("최종 결과 = " + result);
    }

    public static int solution(int n, int m, int[][] hole) {

        // trap[row][col] = true 이면 함정
        boolean[][] trap = new boolean[n + 1][m + 1];
        for (int[] h : hole) {
            trap[h[0]][h[1]] = true;
        }

        // 방문 배열
        boolean[][] visitedWithoutJump = new boolean[n + 1][m + 1];
        boolean[][] visitedWithJump = new boolean[n + 1][m + 1];

        Queue<State> queue = new LinkedList<>();

        // 시작점
        queue.offer(new State(1, 1, false, 0));
        visitedWithoutJump[1][1] = true;

        System.out.println("초기 Queue = " + queue);
        System.out.println();

        while (!queue.isEmpty()) {

            State current = queue.poll();

            System.out.println("=================================================");
            System.out.println("poll -> " + current);
            System.out.println("현재 Queue = " + queue);
            System.out.println();

            // 보물 도착
            if (current.row == n && current.col == m) {
                System.out.println("보물 도착! 정답 = " + current.time);
                return current.time;
            }

            // 4방향 탐색
            for (int direction = 0; direction < 4; direction++) {

                System.out.println("[" + dirName[direction] + "] 탐색");

                // 1. 한 칸 걷기
                int nextRow = current.row + dr[direction];
                int nextCol = current.col + dc[direction];

                System.out.println("  걷기 후보 -> (" + nextRow + ", " + nextCol + ")");

                if (isInside(nextRow, nextCol, n, m)
                        && !trap[nextRow][nextCol]) {

                    if (!current.usedJump) {

                        if (!visitedWithoutJump[nextRow][nextCol]) {

                            System.out.println(
                                    "    큐 추가 -> (" +
                                            nextRow + ", " +
                                            nextCol + ", false, " +
                                            (current.time + 1) + ")"
                            );

                            visitedWithoutJump[nextRow][nextCol] = true;
                            queue.offer(
                                    new State(
                                            nextRow,
                                            nextCol,
                                            false,
                                            current.time + 1
                                    )
                            );

                        } else {
                            System.out.println("    이미 방문함 (visitedWithoutJump)");
                        }

                    } else {

                        if (!visitedWithJump[nextRow][nextCol]) {

                            System.out.println(
                                    "    큐 추가 -> (" +
                                            nextRow + ", " +
                                            nextCol + ", true, " +
                                            (current.time + 1) + ")"
                            );

                            visitedWithJump[nextRow][nextCol] = true;
                            queue.offer(
                                    new State(
                                            nextRow,
                                            nextCol,
                                            true,
                                            current.time + 1
                                    )
                            );

                        } else {
                            System.out.println("    이미 방문함 (visitedWithJump)");
                        }
                    }

                } else {
                    System.out.println("    이동 불가 (범위 밖 또는 함정)");
                }

                // 2. 점프 (아직 사용하지 않은 경우만)
                if (!current.usedJump) {

                    int jumpRow = current.row + dr[direction] * 2;
                    int jumpCol = current.col + dc[direction] * 2;

                    System.out.println(
                            "  점프 후보 -> (" + jumpRow + ", " + jumpCol + ")"
                    );

                    if (isInside(jumpRow, jumpCol, n, m)
                            && !trap[jumpRow][jumpCol]) {

                        if (!visitedWithJump[jumpRow][jumpCol]) {

                            System.out.println(
                                    "    큐 추가 -> (" +
                                            jumpRow + ", " +
                                            jumpCol + ", true, " +
                                            (current.time + 1) + ")"
                            );

                            visitedWithJump[jumpRow][jumpCol] = true;
                            queue.offer(
                                    new State(
                                            jumpRow,
                                            jumpCol,
                                            true,
                                            current.time + 1
                                    )
                            );

                        } else {
                            System.out.println("    이미 방문함 (visitedWithJump)");
                        }

                    } else {
                        System.out.println("    점프 불가 (범위 밖 또는 함정)");
                    }
                }

                System.out.println();
            }

            System.out.println("탐색 후 Queue = " + queue);
            System.out.println();
        }

        System.out.println("보물에 도달할 수 없음");
        return -1;
    }

    public static boolean isInside(int row, int col, int n, int m) {
        return row >= 1 && row <= n && col >= 1 && col <= m;
    }
}