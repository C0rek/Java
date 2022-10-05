package Practico_7;

public class E4_P7 extends clsListaLinkedList{
    
    boolean encontrado = false;
    public boolean valorEnLista(Object referencia){
        if(!estaVacia()){
            clsNode aux = tope;     //crea copia de la lista
            while(aux != null && encontrado!=true){
                if(referencia == aux.getNodeInfo()){
                    encontrado = true;
                } else {
                    aux = aux.getNextNode();
                }
            }
        }
        return encontrado;
    }
}