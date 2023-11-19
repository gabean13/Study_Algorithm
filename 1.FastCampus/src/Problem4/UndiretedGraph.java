package Problem4;

public class UndiretedGraph {

    private int count;
    private int [][] vertexMatirx;

    public UndiretedGraph(int count){
        this.count = count;
        vertexMatirx = new int[count][count];
    }

    public void addEdge(int from, int to, int weight){
        vertexMatirx[from][to] = weight;
        vertexMatirx[to][from] = weight;
    }

    public int[][] getVertexMatirx(){
        return vertexMatirx;
    }

    public int getCount(){
        return count;
    }

    public void printMatrix(){
        for(int i = 0;i < count;i++){
            for(int j = 0; j <count; j++){
                if(vertexMatirx[i][j] != 0){
                    System.out.print(" From : " + i + " To : "+ j);
                }
            }
            System.out.println();
        }
    }
}
