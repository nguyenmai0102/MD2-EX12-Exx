package tree2;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        this.root =null;
    }


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }
    public Node insertNode(Node current, int value){
        if (current == null){
            // Binary treee chua chua bay ki nut nao

           current =new Node(value);
                return current;

        }else {
            // binary tree da chua note
            if (value<current.getValue()){
                // value nam ow ben goc trai
                current.setLeft(insertNode(current.getLeft(), value));

            }else if (value>current.getValue()) {
                // valua nam o node ben phai
                current.setRight(insertNode(current.getRight(),value));
            }else {
                return current;
            }
        }
        return current;
    }
    public void insert(int value){
        this.root =insertNode(this.root, value);

    }
    public void postOrder(Node node){
        if (node !=null) {
            //duyet cac node ben cay trai de quy
            postOrder(node.getLeft());
            //dyet cac node ben phai cay de quy
            postOrder(node.getRight());
            System.out.println(node.getValue()+" ");
        }
    }
    public static boolean searchTree(Node node, int key){
        if (node== null){
            return  false;

        }
        if (key== node.getValue()){
            return true;
        } else if (key<node.getValue()) {
            return searchTree(node.getLeft(), key);

        }else {
            return searchTree(node.getRight(), key);
        }


    }
}
