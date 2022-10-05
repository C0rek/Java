package Practico_1;
// Suponga un array que contiene notas de N alumnos generadas aleatoriamente en el rango de 0-10, y deben ser 
// mostradas en pantalla. De acuerdo a la nota contenida, indique cuántos estudiantes son:
// Insuficientes 0-3
// Regulares 4-6
// Buenos 7-9
// Excelentes 10

import java.util.*;
public class E12_P1 {
    public static void main(String[] args) {
        int notas;        
        //contadores
        int contador_ins = 0, contador_reg = 0, contador_buenos = 0, contador_exc = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Rango: 0-10\nPara terminar el recuento salga del rango (Por ejemplo: nota = 11)");

        do{
            System.out.println("Agrega una nota: ");
            notas= sc.nextInt();

            if (notas>=0 && notas<=3){
                contador_ins++;
            } else if(notas>3 && notas<7){
                contador_reg++;
            } else if(notas>=7 && notas <=9){
                contador_buenos++;
            } else if (notas == 10){
                contador_exc++;
            }

        }while(notas>=0 && notas<=10);

        System.out.println("\nInsuficientes: " +contador_ins+ "\nRegulares: " +contador_reg+ "\nBuenos: " +contador_buenos+"\nExcelentes: " +contador_exc);
        sc.close();
    }   
}
