package Tree;
import java.util.*;

public class Level_order_build_tree {
    private NodeT root;

    public Level_order_build_tree() {
        // TODO Auto-generated constructor stub
        this.root = CreateTree();
    }

    private NodeT CreateTree() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Queue<NodeT> q = new LinkedList<>();
        int item = sc.nextInt();
        NodeT nn = new NodeT();
        nn.data= item;
        root = nn;
        q.add(nn);
        while (!q.isEmpty()) {
            NodeT rv = q.poll();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                NodeT node = new NodeT();
                node.data = c1;
                rv.left = node;
                q.add(node);
            }
            if (c2 != -1) {
                NodeT node = new NodeT();
                node.data = c2;
                rv.right = node;
                q.add(node);
            }
        }

        return root;

    }

    public void Display() {
        Display(root);
    }

    private void Display(NodeT node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        Display(node.left);
        Display(node.right);

    }

    public static void main(String[] args) {
        Level_order_build_tree lv = new Level_order_build_tree();
        lv.Display();
        //	10 20 30 40 50 -1 60 -1 -1 -1 70 80 90 -1 -1 -1 -1 -1 -1
    }
}