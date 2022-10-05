package Practico_1;

// Aplicando la relación que hay entre char e int, visualice los caracteres del código ASCII.
// Utilice el operador de concatenación +.
import java.util.*;
public class E5_P1 {
    public static void main(String[] args){
        int ASCII;
        char x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese una tecla: ");
        x = sc.next().charAt(0);        //combierte el char en un ASCII
        
        ASCII = (int) x;
        System.out.println("El caracter introducido '" +x+ "' tiene como ASCII " + ASCII);

        sc.close();

    }
    
}
