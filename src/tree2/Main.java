package tree2;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(8);
        bt.insert(3);
        bt.insert(10);
        bt.insert(9);
        bt.insert(15);


        // duyet cay nhi phan theo postOder tinh tu node root
        bt.postOrder(bt.getRoot());
        // duyet cay
        bt.postOrder(bt.getRoot());
        // tim kiem gai tri 10 co ton tai trong bien khong
        boolean exisKey = BinaryTree.searchTree(bt.getRoot(), 10);
        if (exisKey){
            System.out.println("has 10 in BinatryTree");

        }else {
            System.out.println("no");
        }
    }

}
