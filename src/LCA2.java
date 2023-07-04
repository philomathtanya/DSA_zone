

public class LCA2 {
    public class NodeT {
        int val;
        NodeT left;
        NodeT right;

        NodeT() {
        }

        NodeT(int val) {
            this.val = val;
        }

        NodeT(int val, NodeT left, NodeT right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    }

    class Solution {
        public NodeT lowestCommonAncestor(NodeT root, NodeT p, NodeT q) {
            if (find(root, p) == false || find(root, q) == false) {
                return null;
            }
            return LCA(root, p, q);

        }

        public NodeT LCA(NodeT root, NodeT p, NodeT q) {
            if (root == null) {
                return null;
            }

            if (root == p || root == q) {
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

        public boolean find(NodeT root, NodeT p) {

            if (root == null) {
                return false;
            }
            if (root == p) {
                return true;
            }

            return find(root.left, p) || find(root.right, p);

        }
    }
}