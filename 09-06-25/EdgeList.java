import java.util.HashSet;
import java.util.ArrayList;
class Main{
    public static void main(String[] args) {
      
       Graph graph =new Graph(4,true);
       graph.addEdge(0,1);
       graph.addEdge(0,2);
       graph.addEdge(0,3);
       graph.addEdge(1,0);
       graph.addEdge(1,2);
       graph.addEdge(2,0);
       graph.printGraph();
       
      
    }
}
class Edge{
    int src;
    int dest;
    int weight;
    Edge(int src,int dest,int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
    Edge(int src,int dest){
        this.src = src;
        this.dest = dest;
        this.weight = 1;
    }
    @Override
    public String toString(){
        return this.src+ " --> "+ this.dest+ "--> "+"[weight = " + this.weight + "]";
    }
}    
 class Graph{
        HashSet<Edge>graph;
        int vertices;
        boolean isDirected;
        Graph(int vertices,boolean isDirected){
            this.vertices = vertices;
            this.isDirected = isDirected;
            graph = new HashSet<Edge>();
            
        }
        public void addEdge(int src,int dest){
            if(isValid(src,dest)){
                Edge e = new Edge(src,dest);
                graph.add(e);
                if(!isDirected){
                    Edge e2 = new Edge(dest,src);
                    graph.add(e2);
                }
            }
            else{
                System.out.println("invalid source or destination ");
            }
        }
        public void addEdge(int src,int dest,int weight){
            if(isValid(src,dest)){
                Edge e = new Edge (src,dest,weight);
                graph.add(e);
                if(!isDirected){
                    Edge e2 = new Edge(dest,src,weight);
                    graph.add(e2);
                }
            }
            else{
                System.out.println("invalid source or destination ");
            }
            
        }
        
        public boolean isValid(int src,int dest){
            return src>=0&&dest>=0&&src<vertices&&dest<vertices&&src!=dest;
        }
        public void printGraph() {
           
               System.out.println(graph);
            
        }
     
    }
   