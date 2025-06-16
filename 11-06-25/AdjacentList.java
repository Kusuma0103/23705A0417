import java.util.HashSet;
import java.util.ArrayList;
class AdjacentList{
    public static void main(String[] args) {
        Graph graph = new Graph(4);
        graph.addEdge(0,1);
        graph.addEdge(0,3);
        graph.addEdge(1,2);
        graph.addEdge(2,0);
        graph.addEdge(3,2);
        graph.printGraph();
        System.out.println("Neighbours : " + graph.getNeighbours(0));
        System.out.println( );
        graph.removeEdge(0,1);
        graph.printGraph();
        System.out.println(graph.isHavingEdge(1,3));
        System.out.println("Neighbours : "+graph.getNeighbours(0));
    }
}
class Graph{
    ArrayList<HashSet<Integer>>graph;
    int vertices;
    Graph(int vertices){
        this.vertices=vertices;
        this.graph = new ArrayList<HashSet<Integer>>();
        for(int i=0;i<vertices;i++){
            graph.add(new HashSet<Integer>());
        }
    }
    void addEdge (int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).add(dest);
            graph.get(dest).add(src);
        }else{
            System.err.println("Invalid source or destination ");
        }
    }
    void removeEdge(int src,int dest){
        if(isValid(src,dest)){
            graph.get(src).remove(dest);
            graph.get(dest).remove(src);
        }else{
            System.err.println("Invalid source or destination");
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
    HashSet<Integer>getNeighbours(int src) throws IndexOutOfBoundsException{
        if(src>=0&&src<vertices){
            return this.graph.get(src);
        }
        throw new IndexOutOfBoundsException("Invalid source or destination");
    }
}
