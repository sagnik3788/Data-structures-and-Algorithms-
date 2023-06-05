import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class binary_tree {
    Node root;
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
            this.left = null;
            this.right = null;
        }
    }
    //min
   public int min(){
        if(root==null){
            return -1;
        }
        Node temp=root;
        if(temp.left!=null){
            temp=temp.left;
        }
        return temp.val;
   }
//max
    public int max(){
        if(root==null){
            return -1;
        }
        Node temp=root;
        if(temp.right!=null){
            temp=temp.right;
        }
        return temp.val;
    }
    public static Node deleteNode(Node root, int val) {
        if (root == null) {
            return null;
        }

        if (val < root.val) {
            root.left = deleteNode(root.left, val);
        } else if (val > root.val) {
            root.right = deleteNode(root.right, val);
        } else {
            // The node to be deleted is found.

            // Check if the node has any children.
            if (root.left == null && root.right == null) {
                // The node has no children.
                return null;
            } else if (root.left != null && root.right == null) {
                // The node has only a left child.
                return root.left;
            } else if (root.left == null && root.right != null) {
                // The node has only a right child.
                return root.right;
            } else {
                // The node has two children.

                // Find the inorder successor of the node to be deleted.
                Node successor = getSuccessor(root);

                // Replace the value of the node to be deleted with the value of the successor.
                root.val = successor.val;

                // Delete the successor node.
                root.right = deleteNode(root.right, successor.val);

                return root;
            }
        }

        return root;
    }
    //BFS TRAVERSAL
 public ArrayList<Integer>Bfs(){
        Node curr =root;
     Queue<Node> queue=new LinkedList<>();
     ArrayList<Integer>results=new ArrayList<>();
     queue.add(curr);
     while (queue.size()>0){
         curr=queue.remove();
         results.add(curr.val);
         if(curr.left!=null){
             queue.add(curr.left);
         }
         if(curr.right!=null){
             queue.add(curr.right);
         }

     }

     return results;
 }
 //DFS_preTraversal
    public ArrayList<Integer>DFS_pre(){
        ArrayList<Integer>results=new ArrayList<>();
        class Traversal{
            Traversal(Node curr){
                results.add(curr.val);//main factor
                if(curr.left!=null){
                    new Traversal(curr.left);
                }
                if(curr.right!=null){
                    new Traversal(curr.right);
                }

            }
        }
        new Traversal(root);
        return results;
    }

    //DFS_postTraversal
    public ArrayList<Integer>DFS_post(){
        ArrayList<Integer>results=new ArrayList<>();
        class Traversal{
            Traversal(Node curr){
                if(curr.left!=null){
                    new Traversal(curr.left);
                }
                if(curr.right!=null){
                    new Traversal(curr.right);
                }
                results.add(curr.val);//main factor

            }
        }
        new Traversal(root);
        return results;
    }
    //DFS_InTraversal
    public ArrayList<Integer>DFS_IN(){
        ArrayList<Integer>results=new ArrayList<>();
        class Traversal{
            Traversal(Node curr){
                if(curr.left!=null){
                    new Traversal(curr.left);
                }
                results.add(curr.val);//main factor
                if(curr.right!=null){
                    new Traversal(curr.right);
                }

            }
        }
        new Traversal(root);
        return results;
    }
    public static Node getSuccessor(Node node){
        if(node.right==null){
            return  node.left;
        }
        Node successor=node.right;
        while(successor.left!=null){
            successor=successor.left;
        }
        return successor;
    }
    public boolean insert(int val){
        Node node =new Node(val);
        if(root==null){
            root=node;
            return true;
        }
        Node temp=root;
        while (true){
            if(temp.val== node.val){
                return false;
            }
            if(temp.val<node.val) {
                if (temp.right == null) {
                    temp.right = node;
                    return true;
                }
                temp = temp.right;
            }
              else {
                if (temp.left == null) {
                    temp.left = node;
                    return true;
                }
                temp = temp.left;
            }

        }

        }

}
