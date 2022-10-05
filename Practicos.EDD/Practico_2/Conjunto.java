package Practico_2;

public class Conjunto {
	
	private final int MaxTam=100;
	private int tam;
	private int [] elementos;
	
	public Conjunto()
	{
		elementos= new int[MaxTam];
		tam=0;
	}

	public Conjunto(int[] vec)
	{
		elementos= new int[MaxTam];
		for(int i = 0; i<vec.length; i++)
		{
			this.añadir(vec[i]);
		}
	}

	// metodos
	
	public boolean esVacio()
	{
	if (tam==0)
	{
		return true;
	}	
	else
	{
		return false;
	}
	}


	public boolean pertenece(int a)
	{
		 int i; i=0;
		 boolean pert; pert=false;
		 while ((i<tam) && (!pert)){
			 if (a == elementos[i]) pert=true;
			 i++;
			 }
		 return pert;
	 }


	public void añadir(int a)
	{
		if ((tam<MaxTam) && (!pertenece(a)))
		{
			elementos[tam]=a;
			tam = tam + 1 ; 
		}
	}

	public int traerElemento(int i)
	{
		if ((i>=0) && (i<tam))
		{
			return (elementos[i]);
		}
		else 
		{
			return -1;
		}
	}

	public int tamaño()
	{
		return tam;
	}

	public void mostrar()
	{
		String cad;
		cad="";
		for (int i=0; i<tam;i++)
		{
			cad = cad + elementos[i]+ " - ";
		}
		System.out.println(cad);
	}
	
	public void retirar(int x)
	{
		int i;
		i=0;
		while ((x != elementos[i]) && (i<tam))
		{
			i++;
			
		}
		if (i<tam)
		{
			for (int j=i;j<tam;j++)
			{
				elementos[j]=elementos[j+1];
			}
			tam--;
		}
	}
	
	public Conjunto interseccion(Conjunto D)
	{
		Conjunto AUX = new Conjunto ();
		for (int i=0; i<tam; i++)
		{
			if(D.pertenece(elementos[i]))
			{
				AUX.añadir(elementos[i]);
			}
		}
		return AUX;
	}

	public Conjunto union(Conjunto D) {
		Conjunto AUX = new Conjunto ();
		for (int i=0; i<tam; i++) {
			// copia los elementos de A en AUX
			AUX.añadir(elementos[i]);
		}
		for (int i=0; i<D.tamaño();i++) {
			AUX.añadir(D.traerElemento(i));			//no pregunto por pertenece xq ya esta en la definicion de añadir
		}
		return AUX;
	}
	
	public Conjunto diferencia(Conjunto D) {
		Conjunto AUX = new Conjunto ();
		for (int i=0; i<tam; i++) {
			if (!D.pertenece(elementos[i])) {
				AUX.añadir(elementos[i]);
			}
		}
		return AUX;
	}
}
