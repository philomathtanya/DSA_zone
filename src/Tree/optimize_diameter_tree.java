package Tree;

import java.util.Scanner;

public class optimize_diameter_tree {

    public class DiaPair {
        int d = 0;
        int ht = -1;

    }
    Scanner s=new Scanner(System.in);
    static NodeT root;
    private optimize_diameter_tree()
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





    public static void main(String[] args) {
        optimize_diameter_tree bt=new optimize_diameter_tree();
        System.out.println(bt.diameterOfBinaryTree(root).d);


    }

    private DiaPair diameterOfBinaryTree(NodeT root) {
        if (root == null) {
            return new DiaPair();
        }

        DiaPair ldp = diameterOfBinaryTree(root.left);
        DiaPair rdp = diameterOfBinaryTree(root.right);
        DiaPair sdp = new DiaPair();

        sdp.ht = Math.max(ldp.ht, rdp.ht) + 1;
        int dia = ldp.ht + rdp.ht + 2;
        sdp.d = Math.max(dia, Math.max(ldp.d, rdp.d));

        return sdp;
    }
}


