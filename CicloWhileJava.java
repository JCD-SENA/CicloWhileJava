package juanca.ciclowhilejava;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ejercicio 1
Rehacer lo del menú pero con un ciclo que se repita hasta que se le de a salir, también añadiendo una nueva opción para cerrar sesión.
*/

public class CicloWhileJava {
    public static void main(String[] args) throws IOException {
        String truePass = "sgibvh";
        int userCount = 29, option = -1;
        String pass = "";
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        do {
            if (pass.equals(truePass)) {
                System.out.print("1. Cantidad de usuarios\n2. Cambiar contraseña\n3. Cerrar sesión\n4. Salir\n?: ");
                option = Integer.parseInt(input.readLine());
                switch (option) {
                    case 1:
                        System.out.println("Hay "+userCount+" usuarios");
                        break;
                    case 2:
                        System.out.print("Ingrese la nueva contraseña: ");
                        truePass = input.readLine();
                        break;
                    case 3:
                        System.out.println("Cerrando...");
                        pass = "";
                        break;
                    case 4:
                        System.out.println("Cerrando...");
                        break;
                    default:
                        System.out.println("Comando inexistente");
                }
            } else {
                System.out.println("Acceso denegado");
                System.out.print("Ingrese la contraseña: ");
                pass = input.readLine();
            }
        } while (option != 4);
    }
}
