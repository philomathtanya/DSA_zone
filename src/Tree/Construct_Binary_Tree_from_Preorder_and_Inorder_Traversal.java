package Tree;

import LinkedList.Linked_list;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {
    static  NodeT root;
    public NodeT buildTree(int[] preorder, int[] inorder) {
        return Create(preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);

    }

    private NodeT Create(int[] preorder, int plo, int phi, int[] inorder, int ilo, int ihi) {
        // TODO Auto-generated method stub
        if (ilo > ihi || plo > phi) {
            return null;
        }

        NodeT nn = new NodeT(preorder[plo]);
        int i = Search(inorder, ilo, ihi, preorder[plo]);
        int nel = i - ilo;
        nn.left = Create(preorder, plo + 1, plo + nel, inorder, ilo, i - 1);
        nn.right = Create(preorder, plo + nel + 1, phi, inorder, i + 1, ihi);

        return nn;

    }

    public int Search(int[] inorder, int si, int ei, int item) {

        for (int i = si; i <= ei; i++) {
            if (inorder[i] == item) {
                return i;
            }
        }
        return -1;

    }
    public void display(NodeT root)
    {
        if(root==null)
        {
            return;
        }
        String str="";
        str=str+root.data;
        str="<--"+str+"-->";
        if(root.left!=null)
        {
            str=root.left.data+str;
        }
        else {
            str="."+str;
        }
        if(root.right!=null)
        {
            str=str+root.right.data;
        }
        else {
            str=str+".";
        }
        System.out.println(str);
        display(root.left);
        display(root.right);
    }

    public static void main(String[] args) {
        Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal obj=new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();
       int []preorder={10,50,80,60,70,90,17};
       int []inorder={80,50,60,10,90,17,70};
        NodeT ans=obj.buildTree(preorder,inorder);
        obj.display(ans);
    }
}
