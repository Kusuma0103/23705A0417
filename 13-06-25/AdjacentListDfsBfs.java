import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class AdjacentList{
    public static void main(String[] args) {
        Graph graph = new Graph(4,true);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(3,2);
        graph.printGraph();
        System.out.println("Neighbours : " + graph.getNeibhours(0));
        System.out.println( );
       graph.bfs();
       System.out.println( );
       graph.dfs(0,new boolean[4]);
    }
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    boolean isDirected;
    Graph(int vertices,boolean isDirected){
        this.vertices=vertices;
        this.isDirected = isDirected;
        this.graph = new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<Integer>());
        }
    }
    void addEdge (int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            if(!this.isDirected)
              graph.get(dest).add(src);
        }else{
            System.err.println("Invalid source or destination ");
            for(int i=0;i<this.vertices;i++){
                System.out.print(i+" ");
            }
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).remove(dest);
            if(!this.isDirected)
               graph.get(dest).remove(src);
        }else{
            System.err.println("Invalid source or destination");
            for(int i=0;i<this.vertices;i++){
                System.out.print(i+" ");
            }
        }
    }
    void dfs(int start,boolean[] visited){
        visited[start]=true;
        System.out.print(start+" ");
        var neibhours = getNeibhours(start);
        for(int neibhour:neibhours){
            if(!visited[neibhour])
              dfs(neibhour,visited);
        }
    }
    void bfs(){
        Queue<Integer>q=new LinkedList<>();
        q.add(0);
        boolean[] visited = new boolean[vertices];
        while(!q.isEmpty()){
            int current = q.remove();
            if(!visited[current]){
                visited[current]=true;
                System.out.print(current+" ");
                var neibhours = getNeibhours(current);
                for(Integer neibhour:neibhours){
                    q.add(neibhour);
                }
            }
        }
    }
    boolean isValid(int src,int dest){
        return src>=0&&dest>=0&&src<=vertices&&dest<=vertices&&src!=dest;
    }
    boolean isHavingEdge(int src, int dest) {
        if (isValid(src, dest)) {
            return graph.get(src).contains(dest);
             
        }
        System.err.println("Invalid source or destination ");
        return false;
    }
    void printGraph(){
        for(int i=0;i<vertices;i++){
            System.out.println(i +" : " + graph.get(i));
        }
    }
    HashSet<Integer>getNeibhours(int src) throws IndexOutOfBoundsException{
        if(src>=0&&src<vertices){
            return this.graph.get(src);
        }
        throw new IndexOutOfBoundsException("Invalid source or destination");
    }
}
