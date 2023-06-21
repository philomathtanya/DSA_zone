package Tree;

import java.util.LinkedList;
import java.util.Scanner;

public class Binary_Tree {
    Scanner s=new Scanner(System.in);
     static NodeT root;
    private Binary_Tree()
    {
        this.root=create_tree();
    }
    private NodeT create_tree()
    {
        int item=s.nextInt();
        NodeT nn=new NodeT();
        nn.data=item;
        boolean hlc=s.nextBoolean();
        if(hlc==true)
        {
            nn.left=create_tree();
        }
        boolean hrc=s.nextBoolean();
        if(hrc==true)
        {
            nn.right=create_tree();
        }
        return nn;

    }
    public int max(NodeT root)
    {
        if(root==null)
        {
            return Integer.MIN_VALUE;
        }
int lmax=max(root.left);
int rmax=max(root.right);
return Math.max(lmax,Math.max(rmax,root.data));
    }
    public boolean find(NodeT root,int item)
    {
        if(root==null)
        {
            return false;
        }
           if(root.data==item)
           {
               return true;
           }
           return find(root.left,item)|| find(root.right,item);
    }
    public static int height(NodeT root)
    {
        if(root==null)
        {
            return -1;
        }
          int lh=height(root.left);
          int rh=height(root.right);
          return Math.max(lh,rh)+1;
    }
    public void display(NodeT root)
    {
        if(root==null)
        {
           return;
        }
        String str="";
        str=str+root.data;
        str="<--"+str+"-->";
          if(root.left!=null)
          {
              str=root.left.data+str;
          }
          else {
              str="."+str;
          }
        if(root.right!=null)
        {
            str=str+root.right.data;
        }
        else {
            str=str+".";
        }
        System.out.println(str);
        display(root.left);
        display(root.right);
    }
    public static void preorder(NodeT root)

    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(NodeT root)

    {
        if(root==null)
        {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void inorder(NodeT root)

    {
        if(root==null)
        {
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void levelorder()
    {
        LinkedList<NodeT>queue=new LinkedList<NodeT>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            NodeT rv=queue.remove();
            System.out.print(rv.data+" ");
            if(rv.left!=null)
            {
                queue.add(rv.left);
            }
            if(rv.right!=null)
            {
                queue.add(rv.right);
            }

        }
        System.out.println();

    }
    public static void main(String[] args) {
        Binary_Tree bt=new Binary_Tree();
//        bt.display(root);
//        System.out.println( bt.max(root));
//        System.out.println(bt.find(root,40));
//        System.out.println(height(root));
//        bt.preorder(root);
//        bt.postorder(root);
//        bt.inorder(root);
        bt.levelorder();

    }
}
