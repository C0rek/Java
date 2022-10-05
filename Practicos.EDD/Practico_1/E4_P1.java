package Practico_1;

// Ingresar una cantidad de años e indicar cuantos días tiene el año ingresado, considérese los años 
// que puedan ser bisiestos.

import java.util.*;
public class E4_P1 {
    public static void main(String[] args){
        int cant, year;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de años que desea ingresar: ");
        cant=teclado.nextInt();

        for(int i=0; i<cant; i++){
            System.out.println("Ingrese un año:");
            year=teclado.nextInt();

            if (year % 4 == 0){
                System.out.println("El año es bisiesto. Tiene 366 dias");
            } else {
                System.out.println("El año tiene 365 dias");
            }

        }

        teclado.close();

    }    
}
