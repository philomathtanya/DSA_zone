package Tree;

import java.util.Scanner;

public class path_sum_root_to_leaf {
    Scanner s=new Scanner(System.in);
    static NodeT root;
    private path_sum_root_to_leaf()
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
public boolean haspathsum(NodeT root, int target)
{
    if(root==null)
        return false;
    if(root.left==null && root.right==null)
    {
        return target-root.data==0;
    }

    boolean lf=haspathsum(root.left,target-root.left.data);
    boolean rf=haspathsum(root.right,target-root.right.data);
return lf||rf;
}



    public static void main(String[] args) {
        path_sum_root_to_leaf obj=new path_sum_root_to_leaf();
        System.out.println(obj.haspathsum(root,24));



    }
}
