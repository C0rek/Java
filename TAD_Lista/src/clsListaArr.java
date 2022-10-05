public class clsListaArr {
	private int[] lista;
	private int cant;
	private int tamLista;
	
	public clsListaArr(int tamLista){
		this.tamLista=tamLista;
		lista=new int[this.tamLista];
		this.cant=0;
	}

	private boolean listaVacia(){
		return(cant==0);
	}

	private boolean listaLena(){
		return(cant==tamLista);
	}

	public void insertaP(int elem){
		if (!listaLena()){
			for(int i = cant;i>0;i--)
			{
				lista[i]=lista[i-1];
			}
			lista[0] = elem;
			cant++;
		}
		else
		{
			System.out.println("Error, lista llena ...");
		}
	}

	public void insertaU(int elem){
		if (!listaLena()){
			lista[cant]=elem;
			cant++;
		}
		else
		{
			System.out.println("Error, lista llena ...");
		}
	}

	public void ordenaLista(){
		int aux;
		for (int i=0;i<cant-1;i++)
		{
			for (int j=i+1;j<cant;j++)
			{
				if (lista[i] > lista[j])
				{
					aux=lista[i];
					lista[i]=lista[j];
					lista[j]=aux;
				}
			}
		}
	}

	int traerelemento (int indice) {
		int valor=0;
		if (indice <cant) {			
			valor= lista[indice];
		}
		return valor;
		
	}

	public void mostarLista(){
		if (!listaVacia()){
			System.out.println();
			for(int i = 0;i<cant;i++)
			{
				System.out.print(lista[i] + ", ");
			}
		} else {
			System.out.println("Lista vacia ...");
		}
	}
	
	public void insertaOrden(int elem){
		int i;
		boolean b;
		if(listaVacia()){
			lista[cant] = elem;
			cant++;	
		} else {
			ordenaLista();
			i = 0;
			b=false;
			while((i<cant) && (!b)) {
				if(lista[i]< elem){
					i++;
				} else {
					for(int j = cant-1;j>=i;j--){
						lista[j+1]=lista[j];
					}
					lista[i] = elem;
					b=true;
					cant++;
				}
			}
			if (i==cant){
				lista[i] = elem;
				cant++;
			}
		}
	}

	public boolean esprefijo(clsListaArr lista2){		
		boolean band=true;
		if (cant<lista2.cant) {
			System.out.println("Error, la lista a verificar es pequeña con respecto al prefijo ...");
			band=false;
		} else {
			for(int i = 0;i<lista2.cant;i++){
				if (lista[i] != lista2.traerelemento(i)) {
					band= false;
				}
			}
		}
		return band;
	}

	public clsListaArr invertida () {
		clsListaArr listaI = new clsListaArr(tamLista);
		if (!listaVacia()){			
			for(int i = cant-1;i>=0;i--)
			{
				listaI.insertaU(lista[i]);
			}
		} else {
			System.out.println("Lista vacia ...");
		}	
		return listaI;
	}
	
	public clsListaArr sincapicuas () {
		clsListaArr listaI = new clsListaArr(tamLista);
		if (!listaVacia())
		{			
			for(int i = cant-1;i>=0;i--)
			{
				int y=0;
				int valor=lista[i];
				while (valor>0) {
					y=y*10 + (valor % 10);
					valor = valor / 10;
				}
				if (y!=lista[i]) {
					listaI.insertaU(lista[i]);
				}				
			}
		}
		else
		{
			System.out.println("Lista vacia ...");
		}
		
		return listaI;
	}


	public int letrascomunes(clsListaArr lista2)
		{
		int cantidad=0;		
		for(int i = 0;i<cant;i++)
		{			
			boolean band=false;
			for (int j=0;j<lista2.cant;j++)
				{
				if (lista[i]==lista2.traerelemento(j)) {					
					band=true;
				j=j+1;
				}
			}
			if (band==true) {
				cantidad = cantidad +1;
			}
		}	
		
		return (cantidad);
	}
	
}


