import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Graphs<Integer> g = new Graphs<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Node : ");
        int n = sc.nextInt();
        System.out.print("Enter number of Edges : ");
        int m = sc.nextInt();


//        for (int i = 0; i < m; i++) {
//            int u = sc.nextInt();
//            int v = sc.nextInt();
//
//            g.adjList(u,v,false);
//
//        }
//
//        g.printAdjList();

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            g.insert(u,v,false);

        }

//        boolean cycle = g.cycleInDirected();

//        System.out.println("Cycle present in graph is "+cycle);

//        g.topologicalSort();
//        g.KahnsAlgo();
//        g.printGraph();

//        System.out.print("BFS of graph is --> ");
//        g.printBFS(n);
//4
//        System.out.println();
//        boolean[]visited = new boolean[n];

//        System.out.print("DFS of graph is --> ");
//        g.printDFS(visited, 0);

//        g.printAllPaths(0,5);
        System.out.println(g.shortestPathInUndirectedBFS(1,8));
    }
}