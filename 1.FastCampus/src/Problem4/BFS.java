package Problem4;

import java.util.ArrayList;
import java.util.Queue;

public class BFS {

    private int count;
    private ArrayList<Integer> queue;
    private int matrix[][];
    private boolean visted[];

    public BFS(int count) {
        this.count = count;
        queue = new ArrayList<>();
        visted = new boolean[count];
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void BFSTraversal(int vertex){

        visted[vertex] = true;
        queue.add(vertex);

        while(!queue.isEmpty()){
            int currentVertex = queue.remove(0);
            System.out.print(currentVertex + " ");

            for(int i = 0;i<count;i++){
                if(matrix[currentVertex][i] != 0 && !visted[i]){
                    visted[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
