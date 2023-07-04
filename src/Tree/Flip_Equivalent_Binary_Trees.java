package Tree;

import java.util.Scanner;

public class Flip_Equivalent_Binary_Trees {
    Scanner s = new Scanner(System.in);
    static NodeT root;
    static NodeT root2;


    private Flip_Equivalent_Binary_Trees() {
        this.root = create_tree();
    }

    private NodeT create_tree() {
        int item = s.nextInt();
        NodeT nn = new NodeT();
        nn.data = item;
        boolean hlc = s.nextBoolean();
        if (hlc == true) {
            nn.left = create_tree();
        }
        boolean hrc = s.nextBoolean();
        if (hrc == true) {
            nn.right = create_tree();
        }
        return nn;

    }


        public boolean flipEquiv(NodeT root1, NodeT root2) {
            if (root1 == null && root2 == null) {
                return true;
            }
            if (root1 == null || root2 == null) {
                return false;
            }
            if (root1.data != root2.data) {
                return false;
            }

            boolean flip = flipEquiv(root1.left, root2.right) && flipEquiv(root1.right, root2.left);

            boolean noflip = flipEquiv(root1.left, root2.left) && flipEquiv(root1.right, root2.right);
            return flip || noflip;

        }

    public static void main(String[] args) {
        Flip_Equivalent_Binary_Trees obj=new Flip_Equivalent_Binary_Trees();
        obj.flipEquiv(root,root);//yha mene root root pass kia h but yaha 2 tree k 2 alg roots pass honge
    }
    }
