package Tree;

import java.util.Scanner;

public class Sum_root_to_leaf {

    Scanner s=new Scanner(System.in);
    static NodeT root;
    private Sum_root_to_leaf()
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
    //same as code path sum
    public int roottoleaf(NodeT root, int n)
    {
        if(root==null)
        {
return 0 ;
        }

        if(root.left==null && root.right==null)
        {
               return n*10+root.data;
        }

        int ln=roottoleaf(root.left,n*10+root.data);
         int rn=roottoleaf(root.right,n*10+root.data);
return ln+rn;
    }



    public static void main(String[] args) {
        Sum_root_to_leaf obj=new Sum_root_to_leaf();
        System.out.println(obj.roottoleaf(root,0));



    }
}
