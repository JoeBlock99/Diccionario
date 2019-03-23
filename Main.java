import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        Scanner input = new Scanner(System.in);
        String programa = "";
        System.out.println("Ingrese el nombre del archivo de texto que contiene el diccionario.\n");
        File file = new File(input.nextLine());
        Scanner scanner = new Scanner(file);
        System.out.println("Sentence:");
        int n = 0;


        while (scanner.hasNextLine()){
            String line = scanner.nextLine();
            n++;
            // Se imprimen las lineas del programa ingresado por el usuario
            System.out.println("[" + Integer.toString(n) + "]: " + line);
            String lineClean = line.replaceAll("\\("," ").replaceAll("\\)"," ").replaceAll(","," ");
            System.out.println(lineClean);
            String[] palabras = lineClean.split(" ");
            System.out.println(Translator.Guardar(palabras));
        }
        scanner.close();


    }



}