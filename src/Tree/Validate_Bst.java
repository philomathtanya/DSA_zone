package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Validate_Bst {


    Scanner sc = new Scanner(System.in);
    static NodeT root;

    Validate_Bst() {
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


    public class BstPair {
        boolean isbst = true;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

    }


        public boolean isdataidBST(NodeT root) {
            return dataidbst(root).isbst;

        }

        public BstPair dataidbst( NodeT root) {
            if (root == null) {
                return new BstPair();
            }
            BstPair lbst = dataidbst(root.left);
            BstPair rbst = dataidbst(root.right);

            BstPair sbst = new BstPair();
            if (lbst.isbst == true && rbst.isbst == true && lbst.max < root.data && rbst.min > root.data) {
                sbst.isbst = true;
                sbst.max = Math.max(rbst.max, root.data);
                sbst.min = Math.min(lbst.min, root.data);
                return sbst;

            }

            sbst.isbst = false;
            sbst.max = Math.max(rbst.max, Math.max(lbst.max, root.data));
            sbst.min = Math.min(rbst.min, Math.min(lbst.min, root.data));
            return sbst;

        }
        public static void main(String[] args) {
      Validate_Bst obj=new Validate_Bst();
      obj.isdataidBST(root);


    }
}