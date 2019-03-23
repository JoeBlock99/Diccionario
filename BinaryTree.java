public class BinaryTree {
    Node root;
//Mucho de todoo lo que esta aqui lo obtuve de https://www.youtube.com/watch?v=M6lYob8STMI
    public void addNode(String key, String name){
        Node newNode = new Node(key, name);
        if(root == null){
            root = newNode;
        }else{
            Node focusNode = root;

            Node parent;

            while (true) {
                parent = focusNode;
                if(key.compareTo(focusNode.key) == 1){
                    focusNode = focusNode.leftChild;
                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }
                }else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }
                }
            }
        }
    }
    public void inOrderTraverseTree(Node focusNode){
        if(focusNode != null){
            inOrderTraverseTree(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }
    public void preorderTraverseTree(Node focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            inOrderTraverseTree(focusNode.leftChild);
            inOrderTraverseTree(focusNode.rightChild);
        }
    }


}
