package Practico_2;

import java.util.*;

public class E6_P2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result = false;
		Fecha a = new Fecha();
		Fecha b = new Fecha(8,10,1998);
		int x;

		while(!result)
		{
			System.out.println("Ingrese año: ");
			x = sc.nextInt() ;
			result = a.setAño(x);
		}

		result = false;
		while(!result)
		{
			System.out.println("Ingrese mes: ");
			x=sc.nextInt() ;
			result = a.setMes(x);
		}

		result = false;
		while(!result)
		{
			System.out.println("Ingrese dia: ");
			x = sc.nextInt() ;
			result = a.setDia(x);
		}
		
		System.out.println(a.difFechas(a,b));
		
		System.out.println("Ingrese la cantidad de dias a sumar a la fecha: ");
		int z = sc.nextInt();
		b=a.sumaDias(a,z);
		System.out.println(b.getAño());
		System.out.println(b.getMes());
		System.out.println(b.getDia());

        sc.close();
    }
}
