package Practico_2;

import java.util.*;
public class E5_P2 {
    public static void main(String[] args) {
		Racional a = new Racional ();
		int x, y, z, w;
		
		Scanner sc=new Scanner (System.in);
		
        //primer numero
        System.out.print("Ingrese numerador de A:");
		x = sc.nextInt();
        System.out.print("Ingrese denominador de A:");
		y = sc.nextInt();
        System.out.println("El numero ingresado es: "+x+"/"+y);
		
        //segundo numero
		System.out.print("Ingrese numerador de B:");
		z = sc.nextInt();
        System.out.print("Ingrese denominador de B:");
		w = sc.nextInt();
        System.out.println("El numero ingresado es: "+z+"/"+w);
		
        //SUMA
		double S=a.Sumar(x,y,z,w);
		System.out.println("La suma de A mas B es: "+S);
		
        //RESTA
		double E=a.Restar(x,y,z,w);
		System.out.println("La resta de A menos B es: "+E);
		
        //PRODUCTO
		double P=a.Multiplicar(x,y,z,w);
		System.out.println("El producto de A por B es: "+P);
		
        //DIVISIÓN
		double D=a.Dividir(x,y,z,w);
		System.out.println("El cociente de A entre B es: "+D);
		
        //IGUALES?
		a.Igualdad(x,y,z,w);
		
        //POTENCIA
		System.out.print("Ingrese el exponente");
		int e = sc.nextInt();
		double t=a.Potencia(x,y,e);
		System.out.println("el numero "+(x+"/"+y)+" elevado al "+e+" es: "+t);
		sc.close();
	}

}

