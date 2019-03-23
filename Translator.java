public class Translator {
    public static BinaryTree Guardar(String[] palabras){
        BinaryTree theTree = new BinaryTree();
        for (int i =0; i <= palabras.length; i++){
            theTree.addNode(palabras[i++],palabras[i++]);
            theTree.inOrderTraverseTree(theTree.root);
        }
        return theTree;
    }


    /*public String Translate(String[] oracion){
        int n=1;
        int m=0;
        for (n >= oracion.length, m >= oracion.length,){
            BinaryTree theTree = new BinaryTree();
            theTree.addNode(oracion[n+2],oracion[m+2]);
            theTree.inOrderTraverseTree(theTree.root);
            String palabra = oracion[n++];
        }




    }*/
}
