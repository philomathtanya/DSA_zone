package Tree;

import java.util.Scanner;

public class balanced_binary_tree {

    Scanner s=new Scanner(System.in);
    static NodeT root;
    private balanced_binary_tree()
    {
        this.root=create_tree();
    }
    public class balancepair{
        boolean isbal=true;
        int ht=-1;
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
    public balancepair balance (NodeT root)
    {
        if(root==null)
        {
            return new balancepair();
        }

balancepair lf= balance(root.left);
balancepair rt=balance(root.right);
balancepair sp=new balancepair();
sp.ht=Math.max(lf.ht,rt.ht)+1;
int bp=Math.abs(lf.ht-rt.ht);
sp.isbal=lf.isbal && rt.isbal && bp<=1;
return sp;


    }




    public static void main(String[] args) {
       balanced_binary_tree obj=new balanced_binary_tree();
        System.out.println(obj.balance(root).isbal);



    }
}

