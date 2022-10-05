package Practico_1;

// Una fábrica de tornillos nos ha solicitado desarrollar un programa en Java que permita obtener e imprimir las 
// estadísticas de una determinada muestra de tornillos. Para ello nos indican que cada tornillo viene caracterizado 
// por su longitud y su diámetro y que ambas medidas deben almacenarse en dos Arrays  “paralelos”. 

// Desarrollar un programa en Java que:
// a) Solicite al usuario los datos de una muestra de tornillos (longitud y diámetro) y los almacene en vectores

// b) A partir de los datos introducidos, calcule y muestre por pantalla la media de las longitudes y la media de 
// los diámetros.
// Nota: El tamaño de la muestra se definirá como una constante denominada TAM_MUESTRA.

import java.util.*;
public class E10_P1 {
    public static void main(String[] args) {
        int TAM_MUESTRA; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos de la muestra: ");
        TAM_MUESTRA = sc.nextInt();

        //creo los vectores
        int [] longitud = new int [TAM_MUESTRA];
        int [] diametro = new int [TAM_MUESTRA];

        for(int i=0; i<TAM_MUESTRA; i++){
            System.out.println("Ingrese la longitud de la muestra "+(i+1)+" :");
            longitud[i] = sc.nextInt();
            System.out.println("Ingrese el diametreo de la muestra " +(i+1)+" :");
            diametro[i] = sc.nextInt();
        }
        
        int acum_longitud = 0, acum_diametro = 0;
        for (int i=0; i<TAM_MUESTRA; i++) 
		{
			acum_longitud = acum_longitud + longitud[i];
			acum_diametro = acum_diametro + diametro[i];
		}
		
		float media_longitud, media_diametro;
		media_longitud = (float) acum_longitud / TAM_MUESTRA;
		media_diametro = (float) acum_diametro / TAM_MUESTRA;
		
		System.out.println("La media de las longitudes es " + media_longitud);
		System.out.println("La media de los diametros es " + media_diametro );

        sc.close();

    }
    
}
