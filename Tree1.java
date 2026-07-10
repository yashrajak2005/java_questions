import java.util.*;
public class Tree1{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr = q.remove();
            System.out.print(curr.data + " ");
            if(curr.left != null){
                q.offer(curr.left);
            }
            if(curr.right != null){
                q.offer(curr.right);
            }
        }
        
    }

    static Node buildTree(int[] arr){
        if(arr.length == 0){
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.offer(root);
        int j =1;
        while(j!= arr.length && !q.isEmpty()){
            Node curr = q.poll();
            if(curr != null){
                if(j < arr.length && arr[j] != -1){
                    curr.left = new Node(arr[j]);
                    q.offer(curr.left);
                }
                j++;
                if(j < arr.length && arr[j] != -1){
                    curr.right = new Node(arr[j]);
                    q.offer(curr.right);
                }
                j++;
            }
        }
        return root;
    }
    static boolean isSymmetric(Node root1, Node root2){
        if(root1 == null && root2 == null){
            return true;
        }
        if(root1 == null || root2 == null){
            return false;
        }
        if(root1.data != root2.data){
            return false;
        }
        return root1.data == root2.data && isSymmetric(root1.left, root2.right) && isSymmetric(root1.right, root2.left);
    }
    static boolean isMirror(){
        
    }
    public static void main(String[] args){
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        /*preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println();
        */
        int[] arr = {1,2,3,4,5,6};
        Node root1 = buildTree(arr);
        preOrder(root1);
        System.out.println();
        inOrder(root1);
        System.out.println();
        postOrder(root1);
        System.out.println();
        levelOrder(root1);
        System.out.println();
        System.out.println(isSymmetric(root1.left, root1.right));
    }
}
/* Preorder - Node left right
 * Inorder - left Node right
* Postorder - left right Node
*/