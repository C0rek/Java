import java.util.*;

public class Polinomio {
    Scanner sc = new Scanner(System.in);
	private long coeficientes[];

	public Polinomio(){
  }

	public Polinomio (int grado){
		if( grado<= 0 ) grado = 0;
		coeficientes = new long[grado + 1];
	}

	public int grado()
	{
		return coeficientes.length - 1;
	}

	public long coeficiente(int i)
	{
		return i<coeficientes.length ? coeficientes[i] : 0;
 	}

	public void leer()
	{
		System.out.println("Grado (n): ");
		int n = sc.nextInt();
		coeficientes = new long[n + 1];
		for(int i=(coeficientes.length-1); i>= 0; --i )
		{
			System.out.println("Coeficiente de x^" + i + ": ");
			coeficientes[i] = sc.nextLong();
		}

	}
	public void imprimir()
	{
		for(int i = grado(); i>= 0; --i ){
			if( coeficientes[i] != 0 ){
				if( i != grado() ) System.out.print(" + ");
				if( coeficientes[i] != 1 || i == 0 ) System.out.print(coeficientes[i]);
				if( i> 0 ) System.out.print("x");
				if( i> 1 ) System.out.print("^" + i);
			}
		}
	}

	Polinomio multiplicar(Polinomio otro){
		int grado = grado() + otro.grado();
		Polinomio resultado = new Polinomio(grado);
		for(int i = 0; i<= grado(); ++i )
			for( int j = 0; j <= otro.grado(); ++j )
				resultado.coeficientes[i + j] += coeficiente(i) * otro.coeficiente(j);
		
		return resultado;
	}


	Polinomio sumar(Polinomio otro)
	{
		int grado = Math.max( grado(), otro.grado() );
		Polinomio resultado = new Polinomio(grado);
		for(int i = 0; i<= grado; ++i )
			resultado.coeficientes[i] = coeficiente(i) + otro.coeficiente(i);
		
		return resultado;
  }
             long calcularpolinomio(int x) {
		long resultado=0;
		
		for(int i = grado(); i>= 0; --i ){
			if( coeficientes[i] != 0 ){
				resultado += coeficientes[i] * x^i;				
			}
		}
		return resultado;
	}	

}

