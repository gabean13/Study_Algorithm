package Problem4;

public class Test {
    public static void main(String[] args) {
        UndiretedGraph graph = new UndiretedGraph(8);
        DFS dfs = new DFS(graph.getCount());
        dfs.setMatrix(graph.getVertexMatirx());

        BFS bfs = new BFS(graph.getCount());
        bfs.setMatrix(graph.getVertexMatirx());

        //그래프 생성
        graph.addEdge(0, 1, 1);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(1, 4, 1);
        graph.addEdge(2, 5, 1);
        graph.addEdge(2, 6, 1);
        graph.addEdge(3, 7, 1);
        graph.addEdge(4, 5, 1);

        System.out.println("DFS 결과 출력");
        dfs.DFSTraversal(0);
        System.out.println("\nBFS 결과 출력");
        bfs.BFSTraversal(0);
    }
}
