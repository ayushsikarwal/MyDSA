import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DijkstraAlgo graph = new DijkstraAlgo();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int nodes = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();

        System.out.println("Enter edges (format: u v w):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();

            graph.insertWithWeight(u, v, w, false);
        }

//        graph.printList();
        System.out.print("Enter Source Node : ");
        int src = sc.nextInt();
//        System.out.println(Arrays.toString(graph.shortestPathDijkstra(src)));
        System.out.println(Arrays.toString(graph.primsAlgo(src)));
    }
}
