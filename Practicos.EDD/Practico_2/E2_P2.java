package Practico_2;

import java.util.Scanner;
public class E2_P2 {

	public static void main(String[] args) {
		
	    Scanner entrada = new Scanner(System.in);
	
	    System.out.println("Ingrese la cantidad de elementos que tiene A: ");
	    int n=entrada.nextInt();
	    int vec[] = new int [n];									
	    for (int i=0; i<n; i++) {										
		    System.out.println("Ingrese el valor "+(i+1)+":");
		    vec[i]=entrada.nextInt();									
	}
	Conjunto A = new Conjunto(vec);		
	System.out.println("Conjunto A: ");
	A.mostrar();
	
	System.out.println("Ingrese la cantidad de elementos que tiene B: ");		//Procedimiento para Conjunto B
	int m=entrada.nextInt();
	int vec2 []= new int [m];
	for(int i=0; i<m; i++) {
		System.out.println("Ingrese el valor "+(i+1)+":");
		vec2[i]=entrada.nextInt();
	}
	Conjunto B = new Conjunto(vec2);
	System.out.println("Conjunto B: ");
	B.mostrar();
	
	Conjunto C = new Conjunto();
	C = A.interseccion(B);										//calculo interseccion
	System.out.println("La interseccion entre A y B es : ");
	C.mostrar();
	entrada.close();
	
	Conjunto E = new Conjunto();
	E = A.diferencia(B);
	System.out.println("La diferencia es: ");
	E.mostrar();
	}

}
    
