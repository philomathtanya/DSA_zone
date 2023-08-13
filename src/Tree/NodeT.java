package Tree;
class NodeT{
    int data;
    NodeT left;
    NodeT right;
   NodeT() {
    }

   NodeT(int data){
        this.data = data;
    }

   NodeT(int data,NodeT left,NodeT right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}






