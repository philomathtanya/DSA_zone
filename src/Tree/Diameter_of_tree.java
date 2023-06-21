package Tree;

import java.util.LinkedList;
import java.util.Scanner;

public class Diameter_of_tree {
    Scanner s=new Scanner(System.in);
    static NodeT root;
    private Diameter_of_tree()
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
    public int diameterOfBinaryTree( NodeT root) {
        if (root == null) {
            return 0;
        }
        int ld = diameterOfBinaryTree(root.left);
        int rd = diameterOfBinaryTree(root.right);
        int sd = height(root.left) + height(root.right) + 2;
        return Math.max(ld, Math.max(rd, sd));

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


    public static void main(String[] args) {
       Diameter_of_tree bt=new Diameter_of_tree();
        System.out.println(bt.diameterOfBinaryTree(root));


    }
}

