package Practico_1;

// Ejercicio Nº 3: Dado un número mostrar el número, la cantidad de dígitos y 
// los dígitos por separado. Por ejemplo: 265 – 3 – 2 6 5

import java.util.*;
public class E3_P1 {
    public static void main(String[] args){
        int x, temp, longitud;
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        x = teclado.nextInt();
        temp = x;
        
        // convierto el int en String para preguntar su longitud
        String cad_valor = String.valueOf(temp);
        longitud = cad_valor.length();
        System.out.println(longitud);

        for(int i = 1; i<=longitud; i++){
            System.out.println(x%10);
            x= x/10;
        }

        teclado.close();

    }
    
}
