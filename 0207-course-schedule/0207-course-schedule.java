class Solution {
    public void fun(int[] arr, int[][] graph) {
        for (int i = 0; i < graph.length; i++) {
            arr[graph[i][0]]++;
        }
    }

    public boolean canFinish(int V, int[][] graph) {
        int[] arr = new int[V];
        fun(arr,graph);
        Queue<Integer> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                q.add(i);
            }
        }
        while (!q.isEmpty()) {
            int curr = q.poll();
            list.add(curr);
            for (int i = 0; i < graph.length; i++) {
                if (graph[i][1] == curr) {
                    arr[graph[i][0]]--;
                    if (arr[graph[i][0]] == 0) {
                        q.add(graph[i][0]);
                    }
                }
            }
        }
        if (list.size() != V) {
            return false;
        } else {
            return true;
        }
    }
}