import java.util.*;


public class dfs {

    public static void main(String[] args) {

        int[][] edges = {{3, 6},{4, 3} , {3, 2} , {1, 3} , {1, 2} , {2, 4} , {5, 2}};

        ;
        bfs(solution(6, edges) ,0);
    }

    public static List<List<Integer>> solution(int n, int[][] edges) {

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(i, new ArrayList<>()); // 각 노드에 대해 빈 리스트 추가
        }

        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];

            System.out.println(a + " " + b);

            graph.get(a).add(b); // a -> b 연결
            graph.get(b).add(a); // b -> a 연결 (양방향)
        }

        for (List<Integer> list : graph) {

            System.out.println(Arrays.toString(list.toArray()));
        }

        return graph;
    }

    public static int bfs(List<List<Integer>> graph , int start){

        int[] distance = new int[graph.size()];
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(start);
        distance[start] = 0;

        while (!queue.isEmpty()){
            int cur = queue.poll();

            for(int next : graph.get(cur)){

                if(distance[next] == -1){
                    distance[next] = distance[cur] + 1;
                    queue.offer(next);
                }

            }
        }

        int count =0;
        int max = 0;
        for(int d : distance){

            max = Math.max(max,d);

        }

        for(int i : distance){

            if(i==max){
                count++;
            }

        }

        return count;
    }
}
