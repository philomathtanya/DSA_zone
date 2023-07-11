package Tree;


import java.util.*;

public class Right_view {
    Scanner sc = new Scanner(System.in);
    static NodeT root;
  static   int   max_depth = -1;
    Right_view() {
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


        public void View(NodeT root, List<Integer> ll, int curr_lev) {

            if (root == null) {
                return;
            }
            if (curr_lev > max_depth) {
                ll.add(root.data);
                max_depth = curr_lev;
            }

            View(root.right, ll, curr_lev + 1);
            View(root.left, ll, curr_lev + 1);

        }


    public static void main(String[] args) {
        Right_view r=new Right_view();

        List<Integer> ll = new ArrayList<>();
        r.View(root, ll, 0);

    }
}