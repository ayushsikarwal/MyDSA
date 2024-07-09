import java.util.*;

public class DijkstraAlgo {
    HashMap<Integer, ArrayList<ArrayList<Integer>>> map = new HashMap<>();

    public void insertWithWeight(int u, int v, int w, boolean directed){
        if(!map.containsKey(u)){
            ArrayList<ArrayList<Integer>> list= new ArrayList<>();
            map.put(u,list);
        }
        if(!map.containsKey(v)){
            ArrayList<ArrayList<Integer>> list= new ArrayList<>();
            map.put(v,list);
        }

        ArrayList<Integer> listU = new ArrayList<>();
        listU.add(v);
        listU.add(w);
        map.get(u).add(listU);

        if(!directed){
            ArrayList<Integer> listV = new ArrayList<>();
            listV.add(u);
            listV.add(w);
            map.get(v).add(listV);
        }
    }

    public void printList(){
        for(Map.Entry<Integer, ArrayList<ArrayList<Integer>>> e : map.entrySet()){
            System.out.print(e.getKey() + " --> ");
            System.out.println(e.getValue());
        }
    }

    public int getWeight(int u, int v){
        for(ArrayList<Integer> list : map.get(u)){
            if(list.get(0)==v){
                return list.get(1);
            }
        }
        return -1;
    }

    public int[] shortestPathDijkstra(int src){
        int[] distance = new int[map.size()];
        Arrays.fill(distance, Integer.MAX_VALUE); // Initialize distances to a large number
        distance[src] = 0; // Distance to the source is 0

        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        pq.add(new int[]{src, 0});

        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int u = current[0];
            int distU = current[1];

            if (distU > distance[u]) continue; // Skip if a shorter path was already found

            for (ArrayList<Integer> neighbor : map.get(u)) {
                int v = neighbor.get(0);
                int weightUV = neighbor.get(1);

                if (distance[u] + weightUV < distance[v]) {
                    distance[v] = distance[u] + weightUV;
                    pq.add(new int[]{v, distance[v]});
                }
            }
        }
        return distance;
    }

    public int[] primsAlgo(int src){
        int[] key = new int[map.size()];
        boolean[]mst = new boolean[map.size()];
        int[]parent = new int[map.size()];

        Arrays.fill(key, Integer.MAX_VALUE);
        key[src]=0;
        parent[src]=-1;

        for (int i = 0; i < key.length; i++) {
            int min = minimum(mst, key);
            for (int j = 0; j < map.get(min).size(); j++) {
                if(key[map.get(min).get(j).get(0)]>map.get(min).get(j).get(1)) {
                    key[map.get(min).get(j).get(0)] = map.get(min).get(j).get(1);
                    parent[map.get(min).get(j).get(0)]=min;
                }
            }
        }

        return parent;
    }
    private static int minimum(boolean[]mst, int[]key){
        int res = Integer.MAX_VALUE;
        int toReturn =0;
        for (int i = 0; i < key.length; i++) {
            if(!mst[i] && key[i]<res){
                res = key[i];
                toReturn=i;
            }
        }
        mst[toReturn]=true;
        return toReturn;
    }

    public int minimumSpanningTree(){
        int[]parent = new int[map.size()+1];
        int[]rank = new int[map.size()+1];

        makeSet(parent, rank);
        return 0;
    }

    private static void makeSet(int[]parent, int[]rank){
        for (int i = 1; i < parent.length; i++) {
            parent[i]=i;
            rank[i]=0;
        }
    }

    private int findParent(int[]parent, int node){
        if(parent[node]==node){
            return node;
        }

        return parent[node]= findParent(parent, parent[node]);
    }
    private void findUnion(int u, int v, int[]parent, int[]rank){
        int parentU = findParent(parent, u);
        int parentV = findParent(parent, v);

        if(rank[parentU]<rank[parentV]){
            parent[u]=v;
        } else if (rank[parentV]<rank[parentU]) {
            parent[v]=u;
        }else{
            parent[v]=u;
            rank[u]++;
        }
    }
    public int bellmanFordShortestPath(int src, int destination){
        int[]distance = new int[map.size()];
        Arrays.fill(distance, Integer.MAX_VALUE );
        distance[src]=0;
        return bellmanFordShortestPath(src, destination, distance);
    }
    private int bellmanFordShortestPath(int src, int destination, int[]distance){


        for (int i = 0; i < map.size()-1; i++) {
            for (int j = 0; j < map.get(src).size(); j++) {
                int nbr = map.get(src).get(j).get(0);
                int wt = map.get(src).get(j).get(1);
                if(distance[src]+wt<distance[nbr]){
                    distance[nbr]=distance[src]+wt;
                    bellmanFordShortestPath(nbr, destination,distance);
                }
            }
        }

        return distance[destination];
    }

}

