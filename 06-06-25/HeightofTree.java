class HightOfTree {
    public static void main(String[] args) {
        Tree t=new Tree(new int[]{1,2,-1,-1,3,-1,-1});
        Node root = t.getRoot();
        int heightofroot = Tree.heightoftree(root);
        System.out.println("Height of the tree is : " + heightofroot);
       
    }
}
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class Tree {
    Node root;
    int index = -1;
    Tree(int[]nodes){
    this.root = buildTreeUsingArray(nodes);
    System.out.println(index);
   }
   public Node buildTreeUsingArray(int[] nodes){
       index++;
       if(index>= nodes.length)
           return null;
       
       if(nodes[index]==-1)
           return null;
        
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTreeUsingArray(nodes);
        newNode.right = buildTreeUsingArray(nodes);
        return newNode;
   }
   Node getRoot(){
       return root;
   }
   public static int heightoftree(Node root){
       if(root == null)
       return 0;
       int lh = heightoftree(root.left);
       int rh = heightoftree(root.right);
       return Math.max(lh,rh)+1;
   }
        
}    
    