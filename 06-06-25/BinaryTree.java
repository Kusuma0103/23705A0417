class BinaryTree {
    public static void main(String[] args) {
        Tree t=new Tree(new int[]{1,2,-1,-1,3,-1,-1});
       System.out.println("the preordre of the tree : ");
       t.Preorder();
       System.out.println("\nthe  inordre of the tree : ");
       t.inorder();
       System.out.println("\nthe  postordre of the tree : ");
       t.postorder();
       
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
   public void Preorder(){
       Node temp = this .root;
       PreorderHelper(temp);
   }
   private void PreorderHelper(Node temp){
       if(temp == null)return;
       System.out.print(temp.data + " ");
       PreorderHelper(temp.left);
       PreorderHelper(temp.right);
   }
   public void inorder(){
       Node temp = this .root;
       inorderHelper(temp);
   }
   public void inorderHelper(Node temp){
       if(temp == null)return;
       inorderHelper(temp.left);
       System.out.print(temp.data + " ");
       inorderHelper(temp.right);
   }
   public void postorder(){
       Node temp = this.root;
       postorderHelper(temp);
   }
   private void postorderHelper(Node temp){
       if(temp == null) return;
       postorderHelper(temp.left);
       postorderHelper(temp.right);
       System.out.print(temp.data + " ");
   }
        
}    
    