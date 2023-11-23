package Problem5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Dijkstra {

    static ArrayList<Node>[] graph;

    public Dijkstra(ArrayList<Node>[] graph){
        this.graph = graph;
    }
    public static void DijkstraAlgorithm(int vertexNum, int start){
        boolean[] visited = new boolean[vertexNum + 1]; //해당 정점 방문했는지
        int[] dist = new int[vertexNum + 1]; //출발정점으로부터 해당 정점까지의 최소거리 기록

        int INF = Integer.MAX_VALUE;    //무한(해당 정점까지 가는 루트가 발견되지 않았을 때)
        Arrays.fill(dist, INF);

        dist[start] = 0;
        PriorityQueue<Node> pQueue = new PriorityQueue<>();
        pQueue.offer(new Node(start, 0));   //우선순위큐에 출발지 정점을 넣어줌(우선순위 : 가중치가 작은 것)

        //큐가 비기 전까지 수행
        while(!pQueue.isEmpty()){
            int nowVertex = pQueue.poll().index;    //우선순위가 높은 큐(삭제)의 인덱스를 가져옴

            if(visited[nowVertex]){     //만약 방문했으면 다시 while문 처음으로 돌아감
                continue;
            }else{
                visited[nowVertex] = true;
            }

            for(Node next : graph[nowVertex]){      //그래프에 인접한 노드들 검사
                if(dist[next.index] > dist[nowVertex] + next.cost){     //만약 현재 next의 최단거리값이 현재 nowvertex + next노드까지의 거리보다 크면
                    dist[next.index] = dist[nowVertex] + next.cost;     //해당 next노드의 dist값을 갱신(더 작은 값으로)
                    pQueue.offer(new Node(next.index, dist[next.index]));   //그러고 우선순위큐에 갱신한 값을 넣어준다
                }
            }
        }

        for(int i : dist){
            if(i == INF){
                System.out.print(0 + " ");
            }else{
                System.out.println(i + " ");
            }
        }
    }

    public static void main(String[] args) throws IOException {
        //그래프 입력받기
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int vertexNum = Integer.parseInt(bf.readLine());
        int EdgeNum = Integer.parseInt(bf.readLine());

        graph = new ArrayList[vertexNum + 1];
        for(int i = 0;i <= vertexNum;i++){
            graph[i] = new ArrayList<>();
        }

        StringTokenizer st;
        for(int i = 0;i < EdgeNum;i++){
            st = new StringTokenizer(bf.readLine());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());

            graph[v].add(new Node(w, cost));
        }

        int start = Integer.parseInt(bf.readLine());

        DijkstraAlgorithm(vertexNum, start);

    }
}
