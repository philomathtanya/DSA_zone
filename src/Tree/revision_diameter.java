package Tree;



import java.util.Scanner;

public class revision_diameter {
    Scanner sc = new Scanner(System.in);
    static NodeT root;

    revision_diameter() {
        this.root = create_tree();
    }

    private NodeT create_tree() {
        int item = sc.nextInt();
        NodeT nn = new NodeT();
        nn.data = item;
        boolean hlc = sc.nextBoolean();
        if (hlc == true) {
            nn.left = create_tree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc == true) {
            nn.right = create_tree();
        }
        return nn;

    }
    public class diapair{
        int ht=-1;
        int d=0;
    }
    public diapair diameter(NodeT root)
    {
        if(root==null)
        {
            return new diapair();
        }
        diapair l=diameter(root.left);
        diapair r=diameter(root.right);
        diapair self=new diapair();
        self.ht=Math.max(l.ht,r.ht)+1;
        int di=l.ht+r.ht+2;
        self.d=Math.max(l.d,Math.max(r.d,di));
        return self;

    }


    public static void main(String[] args) {
        revision_diameter obj=new revision_diameter();
        System.out.println(obj.diameter(root).d);
    }
}