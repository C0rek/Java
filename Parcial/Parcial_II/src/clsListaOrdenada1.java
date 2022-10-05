public class clsListaOrdenada1 extends clsListaOrdLinkedL {
    public boolean esMenor(Object objA, Object objB){
		boolean response=false;
		
		if (((Double)objA).doubleValue()<((Double)objB).doubleValue()){
			response=true;
		}
		return response;
	}

	public boolean esMayor(Object objA, Object objB){
		boolean response=false;

		if (((Double)objA).doubleValue()>((Double)objB).doubleValue()){
			response=true;
		}	
		return response;
	}
	
	public boolean igualesDouble(Object objA, Object objB){
		boolean response=false;
	
		if (((Double)objA).doubleValue()==((Double)objB).doubleValue()){
			response=true;
		}
		return response;
	}
	
	public boolean iguales(Object objA, Object objB){
		boolean response=false;
	
		if ((objA).equals(objB)){
			response=true;
		}
		return response;
	}
	
	public void muestra(){
		clsNode temp;		
		if (!estaVacia()){
			temp = this.lista;
			while (temp!=null){
				System.out.println("Elemento " + temp.getNodeInfo().toString());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
	}
	
	//EJ05
	//Agregar las operaciones menor () y mayor ()

	public Object menor() {
		Object menor = this.lista.getNodeInfo();
		return menor;
	}
	
	public Object mayor() {
		int cc=0;
		clsNode temp=this.lista;
		while (cc < contador-1) {
			temp=temp.getNextNode();
			cc++;
		}
		Object mayor=temp.getNodeInfo();
		return mayor;
	}
	
	public void AñadirAlFinal(Object Dato){
        clsNode Nuevo=new clsNode(Dato);
        if(estaVacia()) {
            this.lista=Nuevo;
        }
        else{
            clsNode Temp=this.lista;
            while(Temp.getNextNode() != null){
                Temp=Temp.getNextNode();
            }
            Temp.setNextNode(Nuevo);
        }
        this.contador++;
    }
	
	//Escribir una operación llamada mezclarListas() manteniendo orden original
	public void mezclarListasOriginal(clsListaOrdenada1 Lista) {
		int cc=0;
		Object elemento;
		clsNode temp=this.lista;
		while (cc < contador) {
			elemento=temp.getNodeInfo();
			Lista.AñadirAlFinal(elemento);
			temp=temp.getNextNode();
			cc++;
		}
	}
	
	//Escribir una operación llamada mezclarListas() manteniendo orden
		public void mezclarListas(clsListaOrdenada1 Lista) {
			int cc=0;
			Object elemento;
			clsNode temp=this.lista;
			while (cc < contador) {
				elemento=temp.getNodeInfo();
				Lista.inserta(elemento);
				temp=temp.getNextNode();
				cc++;
			}
		}
    
}
