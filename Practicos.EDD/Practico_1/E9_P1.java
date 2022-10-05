package Practico_1;

//Calcular el promedio de notas de alumnos, ingresadas por teclado. El rango número es de 0-10, validar su ingreso.

import java.util.*;
public class E9_P1 {
    public static void main(String[] args) {
        int cant, notas=0, x;
        boolean eof = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de notas a analizar: ");
        cant = sc.nextInt();

        for(int i = 1; i<=cant; i++){
            System.out.println("Ingrese la nota " +i+" :");
            x = sc.nextInt();

            if (x>-1 && x<11){
                notas = notas + x;
            } else {
                System.out.println("Error. Rango de notas 0-10");
                eof = false;
                break;
            }
        }
        while(eof!=false){
            System.out.println("El promedio del alumno es: " + notas/cant);
            eof = false;
        }
        
        sc.close();

    }
    
}
