package Practico_7;

import java.util.*;

public class testRankingFIFA {
    public static void main (String[] args) {
		
		RankingFIFA selecciones = new RankingFIFA();
		RankingFIFA partidos = new RankingFIFA();
		Scanner sc = new Scanner(System.in);
		
		boolean b=true;
		String seleccion, op, pais;
		float punto;
		
		do {
			System.out.print("Ingrese una seleccion: ");
			seleccion=sc.next().toUpperCase();
			selecciones.AñadirAlFinal(seleccion);
			System.out.println("Ingrese los puntajes:");
			System.out.print("M (3 - 2 - 1 - 0): ");
			punto=sc.nextFloat();
			partidos.AñadirAlFinal(punto);
			System.out.print("I (1 - 2,5 - 3 - 4): ");
			punto=sc.nextFloat();
			partidos.AñadirAlFinal(punto);
			System.out.print("T (cabeza:200, demas:50): ");
			punto=sc.nextFloat();
			partidos.AñadirAlFinal(200-punto);
			System.out.print("C (1 - 0,99 - 0,85): ");
			punto=sc.nextFloat();
			partidos.AñadirAlFinal(punto);
			System.out.print("¿Desea añadir otra seleccion a la lista?: ");
			op=sc.next().toLowerCase();
			if (!op.equals("si")){
				b=false;
			}
		}while (b);
		
		b=true;
		do {
			System.out.print("¿De que seleccion desea saber el puntaje?: ");
			pais=sc.next().toUpperCase();
			if (selecciones.esta(pais)) {
				System.out.print("Puntaje de "+pais+" : "+selecciones.puntaje(partidos, pais));
			}else {
				System.out.println("El pais no se encuentra en la tabla");
			}
			System.out.println();
			System.out.print("¿Desea buscar otra seleccion?: ");
			op=sc.next().toLowerCase();
			if (!op.equals("si")){
				b=false;
			}
		}while (b);
		
		sc.close();
	}
    
}
