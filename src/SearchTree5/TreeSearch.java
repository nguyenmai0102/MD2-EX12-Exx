package SearchTree5;

import tree2.Node;

public class TreeSearch {
    private tree2.Node root;

    public void BinaryTree() {
        this.root =null;
    }


    public tree2.Node getRoot() {
        return root;
    }

    public void setRoot(tree2.Node root) {
        this.root = root;
    }
    public tree2.Node insertNode(tree2.Node current, int value){
        if (current == null){
            // Binary treee chua chua bay ki nut nao

            current =new tree2.Node(value);
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
