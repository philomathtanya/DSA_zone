package Tree;

import LinkedList.Linked_list;

import java.util.Scanner;

public class LCA {
Scanner s=new Scanner(System.in);
    static NodeT root;
    private LCA()
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
    public NodeT lca(NodeT root,int p, int q) {
        if (root == null) {
            return null;
        }
        if (root.data == p || root.data == q) {
            return root;
        }
       NodeT left = lca(root.left, p, q);
       NodeT right = lca(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left == null) {
            return right;
        } else {
            return left;
        }

    }




    public static void main(String[] args) {
        LCA obj=new LCA();
        System.out.println(obj.lca(root,6,5).data);



    }
}
