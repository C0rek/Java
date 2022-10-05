package Practico_1;

import java.util.Scanner;

public class E7_P1 {
    public static void main(String[] args) {
        int tem;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la temperatura en grados: ");
        tem = sc.nextInt();

        if (tem<10){
            System.out.println("Tiempo del clima: Frio");
        } else if (tem>=10 && tem<=20){
            System.out.println("Tiempo del clima: Nublado");
        } else if (tem>20 && tem<=30){
            System.out.println("Tiempo del clima: Calor");
        } else if (tem>30){
            System.out.println("Tiempo del clima: Tropical");
        }

        sc.close();
        
    }
    
}
