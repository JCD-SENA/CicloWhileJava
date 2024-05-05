package juanca.ciclowhilejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Ejercicio 2
Un programa que pregunte por el numero correspondiente de la tabla del 2 y se detenga cuando se cometa un error
*/

public class Ejercicio2 {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int c=0, i=0;
        boolean error = false;
        do {
            i++;
            System.out.print(i+" x 2 = ");
            c = Integer.parseInt(input.readLine());
            error = c != i * 2;
        } while (!error);
    }
}
