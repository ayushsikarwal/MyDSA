import java.util.*;

public class Graphs<T extends Comparable<T>> {
    HashMap<T, ArrayList<T>> map= new HashMap<>();
    HashMap<T, ArrayList<ArrayList<T>>> mp= new HashMap<>();

    public void insert(T u, T v, boolean directed){
        if(!map.containsKey(u)){
            map.put(u,new ArrayList<>());
        }
        if(!map.containsKey(v)){
            map.put(v, new ArrayList<>());
        }
       map.get(u).add(v);

        if(!directed){
            map.get(v).add(u);
        }
    }
    public void printGraph(){
        for(Map.Entry<T, ArrayList<T>> e : map.entrySet()){
            System.out.print(e.getKey()+"-->");
            System.out.println(e.getValue());
        }
    }
    public void adjList(T u, T v, boolean directed){
        ArrayList<T> curr = new ArrayList<>(2);
        curr.add(u);
        curr.add(v);
        if(!mp.containsKey(u)){
            ArrayList<ArrayList<T>> list = new ArrayList<>();
            mp.put(u,list);
        }

        mp.get(u).add(curr);

        if(!directed){
            ArrayList<T> curr2 = new ArrayList<>(2);
            curr2.add(v);
            curr2.add(u);
            if(!mp.containsKey(v)){
                ArrayList<ArrayList<T>> list2 = new ArrayList<>();
                mp.put(v,list2);
            }
            mp.get(v).add(curr2);
        }

    }
    public void printAdjList(){
        for(Map.Entry<T, ArrayList<ArrayList<T>>> e : mp.entrySet()){
            System.out.print(e.getKey()+"-->");
            for(ArrayList<T> arr : e.getValue()){
                System.out.print(arr+";");
            }
            System.out.println();
        }
    }
    public void printBFS(int size){
       Queue<Integer>q = new LinkedList<>();
       boolean[]visited = new boolean[size];

       q.add(0);
       while (!q.isEmpty()){
           int curr = q.poll();
           if(!visited[curr]){
               System.out.print(curr+" ");
               visited[curr]=true;
               int sizeOfN = map.get(curr).size();
               for (int j = 0; j < sizeOfN; j++) {
                   q.add((Integer) map.get(curr).get(j));
               }
           }
       }
    }

    public void printDFS(boolean[] visited, int curr){
        if(!visited[curr]){
            System.out.print(curr+" ");
            visited[curr]=true;
            for (int i = 0; i < map.get(curr).size(); i++) {
                printDFS(visited, (Integer) map.get(curr).get(i));
            }
        }
    }
    public void printAllPaths(int source, int destination) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> path = new ArrayList<>();
        boolean[] visited = new boolean[map.size()];
        helper(source, destination, res, visited, path);
        System.out.println(res);
    }

    private void helper(int source, int destination, ArrayList<ArrayList<Integer>> res, boolean[] visited, ArrayList<Integer> currList) {
        // Add the current node to the path and mark it as visited
        currList.add(source);
        visited[source] = true;

        // If the current node is the destination, add the path to the result
        if (source == destination) {
            res.add(new ArrayList<>(currList));
        } else {
            // Recur for all the vertices adjacent to the current vertex
            for (int i = 0; i < map.get(source).size(); i++) {
                int neighbor = (Integer) map.get(source).get(i);
                if (!visited[neighbor]) {
                    helper(neighbor, destination, res, visited, currList);
                }
            }
        }

        // Backtrack: remove the current node from the path and mark it as unvisited
        currList.remove(currList.size() - 1);
        visited[source] = false;
    }

    public boolean cycleInDirected(){
        boolean[]visited= new boolean[map.size()+1];
        boolean[]dfsvisited= new boolean[map.size()+1];
        return helper(visited, dfsvisited, 1);

    }
    private boolean helper(boolean[]visited, boolean[]dfsvisited, int curr){
        if(visited[curr] && dfsvisited[curr]){
            return true;
        }

        if(!visited[curr]){
            visited[curr]=true;
            dfsvisited[curr]=true;
            for (int i =0 ; i <map.get(curr).size(); i++) {
               if( helper(visited, dfsvisited, (Integer) map.get(curr).get(i))){
                   return true;
               }
            }
            dfsvisited[curr]=false;
        }
        return false;
    }

    public boolean cycleInUndirected() {
        int n = map.size();
        boolean[] visited = new boolean[n + 1];
        HashMap<Integer, Integer> parent = new HashMap<>();
        Queue<Integer> q = new LinkedList<>();

        // Handle all disconnected components of the graph
        for (int start = 1; start <= n; start++) {
            if (!visited[start]) {
                q.add(start);
                parent.put(start, -1);

                while (!q.isEmpty()) {
                    int curr = q.poll();
                    visited[curr] = true;

                    for (T neighbor : map.get(curr)) {
                        if (!visited[(Integer) neighbor]) {
                            q.add((Integer) neighbor);
                            parent.put((Integer) neighbor, curr);
                        } else if (neighbor != parent.get(curr)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public void topologicalSort(){
        boolean[]visited = new boolean[map.size()+1];
        Stack<Integer> stack = new Stack<>();
        topologicalSort(visited, stack, 1);
        while(!stack.empty()){
            System.out.print(stack.pop()+" ");
        }
    }
    private void topologicalSort(boolean[]visited, Stack<Integer>stack, int curr){
        if(!visited[curr]){
            visited[curr]=true;
            for (int i = 0; i < map.get(curr).size(); i++) {
                topologicalSort(visited, stack, (Integer)map.get(curr).get(i));
            }
            stack.push(curr);
        }
    }

    public void KahnsAlgo(){
        //1 3 2 4 5 6
        boolean[]visited = new boolean[map.size()+1];
        int[] indegree = new int[map.size()+1];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        KahnsAlgo(indegree, q, ans, visited);
        System.out.println(ans);

    }
    private void KahnsAlgo(int[]indegree, Queue<Integer>q, ArrayList<Integer>ans, boolean[]visited){
        for (int i = 1; i < indegree.length; i++) {
            for (int j = 0; j < map.get(i).size(); j++) {
                indegree[(Integer) map.get(i).get(j)]++;
            }
        }
        for (int i = 1; i <indegree.length; i++) {
            if(indegree[i]==0){
                q.add(i);
            }
        }
        while(!q.isEmpty()){
            int curr = q.poll();
            if(!visited[curr]){
                visited[curr]=true;
                ans.add(curr);
                for (int i = 0; i < map.get(curr).size(); i++) {
                    indegree[(Integer) map.get(curr).get(i)]--;
                    if(indegree[(Integer) map.get(curr).get(i)]==0){
                        q.add((Integer) map.get(curr).get(i));
                    }
                }
            }
        }
    }

    public ArrayList<Integer> shortestPath(int u, int v){
//        int GMin =Integer.MAX_VALUE;
        ArrayList<Integer> GMin = new ArrayList<>();
//        int CMin =0;
        ArrayList<Integer> CMin = new ArrayList<>();
        boolean[]visited = new boolean[map.size()+1];
        shortestPath(GMin, CMin, visited, u, v);
        return GMin;
    }
    private void shortestPath(ArrayList<Integer> GMin, ArrayList<Integer> CMin, boolean[]visited, int u, int v){
        if(u==v){
            CMin.add(v);
            if(GMin.isEmpty() || CMin.size()<GMin.size()){
                GMin.clear();
                GMin.addAll(CMin);
            }
            CMin.remove(CMin.size()-1);
            return;
        }

        if(!visited[u]){
            visited[u]= true;
            CMin.add(u);
            for (int i = 0; i < map.get(u).size(); i++) {
                shortestPath(GMin, CMin, visited, (Integer) map.get(u).get(i), v);
            }
            CMin.remove(CMin.size()-1);
            visited[u]=false;
        }
    }

    public ArrayList<Integer> shortestPathInUndirectedBFS(int u , int v){
        ArrayList<Integer>res = new ArrayList<>();
        boolean[]visited= new boolean[map.size()+1];
        int[]parent = new int[map.size()+1];
        Queue<Integer> q = new LinkedList<>();
        q.add(u);
        parent[u]=-1;
        visited[u]=true;
        shortestPathInUndirectedBFS(visited, parent, q);
        while (v != u) {
            res.add(0, v);
            v = parent[v];
        }
        res.add(0, u);
        return res;
    }
    private void shortestPathInUndirectedBFS(boolean[]visited, int[]parent, Queue<Integer>q){
        while(!q.isEmpty()){
            int curr = q.poll();
            for (int i = 0; i < map.get(curr).size(); i++) {
                if(!visited[(Integer)map.get(curr).get(i)]){
                    visited[(Integer) map.get(curr).get(i)]= true;
                    q.add((Integer) map.get(curr).get(i));
                    parent[(Integer)map.get(curr).get(i)]=curr;
                }
            }
        }
    }

    public boolean bridgePresent() {
        int[] low = new int[map.size()];
        int[] disc = new int[map.size()];
        boolean[] vis = new boolean[map.size()];
        int[] parent = new int[map.size()];

        Arrays.fill(low, -1);
        Arrays.fill(disc, -1);
        Arrays.fill(parent, -1);
        vis[0] = true;
        disc[0] = 0;
        low[0] = 0;

        for (int i = 0; i < map.size(); i++) {
            if (!vis[i]) {
                if (isBridge(i, low, disc, vis, parent)) {
                    return true;
                }
            }
        }
        return false;
    }
    int time = 0;
    private boolean isBridge(int u, int[] low, int[] disc, boolean[] vis, int[] parent) {
        vis[u] = true;
        disc[u] = low[u] = ++time;
        for (T v : map.get(u)) {
            if (!vis[(Integer) v]) {
                parent[(Integer) v] = u;
                if (isBridge((Integer) v, low, disc, vis, parent)) {
                    return true;
                }
                low[u] = Math.min(low[u], low[(Integer) v]);
                if (low[(Integer) v] > disc[u]) {
                    return true;
                }
            } else if ((Integer) v != parent[u]) {
                low[u] = Math.min(low[u], disc[(Integer) v]);
            }
        }
        return false;
    }

    public boolean articulationPoint(){
        int[]parent = new int[map.size()];
        int[]low = new int[map.size()];
        int[]disc = new int[map.size()];
        boolean[]vis = new boolean[map.size()];

        Arrays.fill(parent, -1);
        Arrays.fill(low, -1);
        Arrays.fill(disc, -1);

        for (int i = 0; i < vis.length; i++) {
            if(!vis[i]){
                if(articulationPoint(parent, low, disc, vis, i)){
                    return true;
                }
            }
        }
        return false;
    }
    int timer =0;
    private boolean articulationPoint(int[]parent, int[]low, int[]disc, boolean[]vis, int node){
        if(!vis[node]){
            low[node]=disc[node]=timer;
            timer++;
            vis[node]=true;
            for (int i = 0; i<map.get(node).size(); i++) {
                if(!vis[(Integer) map.get(node).get(i)]){
                    parent[(Integer) map.get(node).get(i)]=node;
                    if(articulationPoint(parent, low, disc, vis, (Integer)map.get(node).get(i))){
                        return true;
                    }
                    low[node]= Math.min(low[node], low[(Integer)map.get(node).get(i)]);
                    if(low[node]>=disc[node] && parent[node]!=-1){
                        return true;
                    }
                    if(parent[node]==-1 && map.get(node).size()>1){
                        return true;
                    }
                } else if (parent[(Integer) map.get(node).get(i)]!=node) {
                    low[node]= Math.min(low[node], disc[(Integer)map.get(node).get(i)]);
                }
            }
        }
        return false;
    }

    public int strongConnectingComponents() {
        // Initialize stack for topological sorting
        Stack<Integer> st = new Stack<>();
        boolean[] vis = new boolean[map.size()];

        // Perform DFS for topological sorting
        for (int i = 0; i < map.size(); i++) {
            if (!vis[i]) {
                topo(i, vis, st);
            }
        }

        // Create transpose of the graph
        HashMap<Integer, ArrayList<Integer>> transpose = new HashMap<>();
        for (int i = 0; i < map.size(); i++) {
            for (int j =0; j<map.get(i).size(); j++) {
                transpose.computeIfAbsent((Integer)map.get(i).get(j), k -> new ArrayList<>()).add(i);
            }
        }

        // Perform DFS on the transpose graph in the order of stack
        boolean[] dfsTransposeVisited = new boolean[map.size()];
        int countSCCs = 0;
        while (!st.isEmpty()) {
            int top = st.pop();
            if (!dfsTransposeVisited[top]) {
                countSCCs++;
                dfsTranspose(dfsTransposeVisited, top, transpose);
            }
        }

        return countSCCs;
    }

    private void topo(int u, boolean[] vis, Stack<Integer> st) {
        vis[u] = true;
        for (int i =0; i<map.get(u).size(); i++) {
            if (!vis[(Integer)map.get(u).get(i)]) {
                topo((Integer)map.get(u).get(i), vis, st);
            }
        }
        st.push(u);
    }

    private void dfsTranspose(boolean[] vis, int u, HashMap<Integer, ArrayList<Integer>> transpose) {
        vis[u] = true;
        for (Integer neighbor : transpose.getOrDefault(u, new ArrayList<>())) {
            if (!vis[neighbor]) {
                dfsTranspose(vis, neighbor, transpose);
            }
        }
    }

}
