package Practico_1;

// Escriba un programa que, tratando una fracción como un estructura de 2 componentes, permita realizar 
// las operaciones suma, multiplicación, división, opuesto e inverso. 
// El programa deberá preguntar la operación a realizar y después los datos para ejecutarla, 
// y repetir estos pasos hasta que se seleccione entre las operaciones la opción terminar. 
import java.util.*;

public class E8_P1 {
    public static void main(String[] args) {
        int numer, denom, x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Indique el numerador: ");
        numer = sc.nextInt();

        System.out.println("Indique el denominador: ");
        denom = sc.nextInt();
        

        System.out.println("\nLa fraccion que ingreso es: " + numer + "/" + denom);
        System.out.println("\nIndique la funcion a realizar:\n1-Suma\n2-Multiplicacion\n3-Division\n4-Opuesto\n5-Inverso\n6-Salir\n\nOpcion:");
        x = sc.nextInt();

        switch(x){
            case 1:{ //sumar
                System.out.println("Ingrese el digito con el que desea sumar: ");
                y = sc.nextInt();

                System.out.println("El resultado es: " + (y*denom+numer) + "/" + denom);
                break;
            }
            case 2:{ //multiplicar
                System.out.println("Ingrese el digito con el que desea multiplicar: ");
                y = sc.nextInt();

                System.out.println("El resultado es: " +y*numer + "/" + denom);
                break;
            }
            case 3:{ //dividir
                System.out.println("Ingrese el digito con el que desea dividir:");
                y = sc.nextInt();

                System.out.println("El resultado es: " +y*denom + "/" +numer);
                break;
            }
            case 4:{ //opuesto
                System.out.println("El opuesto es: -"+numer + "/" + denom);
                break;
            }
            case 5:{ //inverso
                System.out.println("El inverso es: " + denom + "/" + numer);
                break;
            }
            case 6:{ //salir
                System.out.println("Hasta pronto");
                break;
            }
            default:{
                System.out.println("Ingrese una de las opciones");
            }


        }
        sc.close();
    }
   
}