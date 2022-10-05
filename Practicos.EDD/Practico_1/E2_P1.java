package Practico_1;

// Ejercicio Nº 2: Dada una lista de 10 números, mostrar el cuadrado de los números pares y el 
// cubo de los impares.

import java.util.*;
public class E2_P1 {
    
    public static void main(String[] args) {
        int x;

        Scanner teclado = new Scanner(System.in);

        for(int i = 0; i<11; i++){
            System.out.println("Ingrese el numero");
            x= teclado.nextInt();

            if (x%2 == 0){
                System.out.println("El numero es par. El cuadrado es : " +x*x);
            } else {
                System.out.println("El nummero es impar. El cubo es : " +x*x*x);
            }
        }
        teclado.close();
    }
}
