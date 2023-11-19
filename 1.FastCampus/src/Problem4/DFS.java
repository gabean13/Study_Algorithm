package Problem4;

import java.util.Stack;

public class DFS {

    private int count;
    private boolean []visited;
    private Stack<Integer> stack;
    private int [][] matrix;

    public DFS(int count){
        this.count = count;
        visited = new boolean[count];
        stack = new Stack<>();
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public void DFSTraversal(int vertex){

        stack.push(vertex);
        visited[vertex] = true;
        System.out.print(vertex + " ");

        //vertex에 인접한 정점이 있는지 확인
        for(int i = 0;i <count;i++){
            //만약 방문처리가 되지않은 인접한 정점이 있으면 방문
            if(matrix[vertex][i] != 0 && !visited[i]) {
                DFSTraversal(i);
            }
        }

        stack.pop();

    }
}
