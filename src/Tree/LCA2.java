package Tree;
import java.util.Scanner;

public class LCA2 {
    Scanner s=new Scanner(System.in);
    static NodeT root;
    private LCA2()
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
        public NodeT lowestCommonAncestor(NodeT root, int p, int q) {
            if (find(root, p) == false || find(root, q) == false) {
                return null;
            }
            return LCA(root, p, q);

        }

        public NodeT LCA(NodeT root, int p, int q) {
            if (root == null) {
                return null;
            }

            if (root.data == p || root.data == q) {
                return root;
            }

            NodeT left = LCA(root.left, p, q);
            NodeT right = LCA(root.right, p, q);
            if (left != null && right != null) {
                return root;
            }
            if (left == null) {
                return right;
            } else {
                return left;
            }
        }

        public boolean find(NodeT root, int p) {

            if (root == null) {
                return false;
            }
            if (root.data == p) {
                return true;
            }

            return find(root.left, p) || find(root.right, p);

        }

    public static void main(String[] args) {
        LCA2 obj=new LCA2();
        System.out.println(obj.lowestCommonAncestor(root,6,5).data);
    }
    }
