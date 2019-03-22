import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner input = new Scanner(System.in);
        String programa = "";
        System.out.println("Ingrese el nombre del archivo de texto que contiene el programa.\n");
        File file = new File(input.nextLine());
        Scanner scanner = new Scanner(file);
        System.out.println("Sentence:");
        int n = 0;
        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            n++;
            // Se imprimen las lineas del programa ingresado por el usuario
            System.out.println("[" + Integer.toString(n) + "]: " + line);
            String[] palabra = line.split(" ");


        }
        scanner.close();

    }
    public String Translate(String[] oracion){
        BinaryTree theTree = new BinaryTree();
        theTree.addNode("house", "casa");
        theTree.addNode("dog","perro");
        theTree.addNode("homework","tarea");
        theTree.addNode("woman","mujer");
        theTree.addNode("town","puebo");
        theTree.addNode("yes","si");
        theTree.inOrderTraverseTree(theTree.root);
        int n=0;
        String palabra = oracion[n++];
        while (scanner.hasnextline){
            if()
        }




    }
}