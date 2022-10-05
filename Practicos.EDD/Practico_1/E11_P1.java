package Practico_1;
//En España cada persona está identificada con un Documento Nacional de Identidad (DNI) en el que figura un número y una letra, por ejemplo 56999545W
//
// La letra que sigue al número se calcula a partir de la siguiente metodología:
//
// Para calcular la letra, se debe tomar el resto de dividir nuestro número de DNI entre 23. El resultado debe estar por tanto entre 0 y 22.
//
// Posición     0   1   2   3  4   5   6  7  8  9  10  11  12  13  14  15  16  17  18  19  20  21  22
//
// Letra            T   R  W A  G  M  Y  F  P  D  X    B   N    J    Z    S   Q    V   H    L   C   K   E
//
// Por ej, si introducimos el  DNI 20267079, el resto de dividirlo por 23 sería 8, luego la letra sería la P, que es la que ocupa esa posición  en la matriz de caracteres.
//
// Crea un programa que calcule la letra de cada DNI a partir de una cantidad determinada de números de DNI que introduzca el usuario. Es decir, se debe pedir el DNI sin la letra por teclado y el programa nos devolverá el DNI completo (con la letra).

import java.util.*;
public class E11_P1 {
    public static void main(String[] args) {
        int DNI, posicion;
		
		//cargo vecotr
		char letras[]= {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el numero del DNI");
		DNI=sc.nextInt();
		
		posicion= DNI % 23;
		sc.close();
		System.out.println("DNI completo: " + DNI+ " - " +letras[posicion]);

    }
    
}
