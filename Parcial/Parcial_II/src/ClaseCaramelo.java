public class ClaseCaramelo {
    private int codigoGolosina;
    private int golosinasProducidas;

    public ClaseCaramelo(int codigo_golosina, int golocinasProducidas){
        this.codigoGolosina=codigo_golosina;
        this.golosinasProducidas=golocinasProducidas;
    }

    public void mostrarGolocina(){
        System.out.println("El codigo de la golosina es: " +codigoGolosina+"\nHay una produccion de "+golosinasProducidas);

    }
    
}
