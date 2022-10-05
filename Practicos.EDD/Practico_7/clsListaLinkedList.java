package Practico_7;

public abstract class clsListaLinkedList {
        protected clsNode tope; //tope es inicio, lista es final
        private clsNode lista;
        
        clsListaLinkedList(){
            limpiaLista();
        }
        
        boolean estaVacia(){
            return (lista==null);
        }
        
    
        void limpiaLista(){
            this.tope=this.lista=null;;
        }
        
        
        // inserta elemento a la derecha
        void insertaFin(Object objElemento){
            if (!estaVacia()){
                this.lista.setNextNode(new clsNode(objElemento));
                this.lista=this.lista.getNextNode();
            }else{
                this.tope = this.lista=new clsNode(objElemento);			
            }
        }	
    
        // elimina elemento ubicado más a la derecha
        void eliminaFin(){
            if (!estaVacia()){
                if (this.lista==this.tope){
                    // un solo elemento
                    limpiaLista();
                }else{
                    clsNode temp;
                    for (temp=this.tope;temp.getNextNode()!=lista;temp=temp.getNextNode());
                    this.lista=temp;
                    this.lista.setNextNode(null);			
                }
            }else{
                System.out.println("Error eliminaFin. Lista vacia");			
            }
        }		
    
        
        // inserta elemento a la izq
        void insertaTope(Object objElemento){
            if (!estaVacia()){
                this.tope = new clsNode(objElemento,this.tope);		
            }else{
                this.tope = this.lista=new clsNode(objElemento);			
            }
        }	
    
        
        // elimina elemento ubicado más a la izq
        void eliminaTope(){
            if (!estaVacia()){
                if (this.lista==this.tope){
                    // un solo elemento
                    limpiaLista();
                }else{
                    this.tope=this.tope.getNextNode();			
                }
            }else{
                System.out.println("Error eliminaTope. Lista vacia");			
            }
        }	
        
        // buscar un elemento en la lista
        public abstract boolean valorEnLista(Object referencia);
        
        // mostrar lista (metodo 1)
        void muestra(){
            clsNode temp;		
            if (!estaVacia()){
                temp=this.tope;
                while (temp!=null){
                    System.out.println("Elemento " + temp.getNodeInfo().toString());
                    temp=temp.getNextNode();
                }			
            }else{
                System.out.println("Error! La lista esta vacia");
            }		
        }
        
        // mostrar lista (metodo 2)
        public void listar(){
            // Verifica si la lista contiene elementoa.
            if (!estaVacia()) {
                // Crea una copia de la lista.
                clsNode aux = tope;
                // Posicion de los elementos de la lista.
                int i = 0;
                // Recorre la lista hasta el final.
                while(aux != null){
                    // Imprime en pantalla el valor del nodo.
                    System.out.print(i + ".[ " + aux.getNodeInfo() + " ]" + " -->  ");
                    // Avanza al siguiente nodo.
                    aux = aux.getNextNode();
                    // Incrementa el contador de la posión.
                    i++;
                }
            }else {
                System.out.println("Error! La lista esta vacia");
            }
        }
        
        clsNode getTope(){
            return tope;
        }   
    
}
