public class ClaseBolsa {
    private int bolsas_disponibles;
    private String tipoBolsa;
    private int capacidad_maxima;
    private int codigoGolosina=0;

    public ClaseBolsa(String tipoDeBolsa){
        this.tipoBolsa = tipoDeBolsa;
        this.bolsas_disponibles=0;

    }
    public void mostrarBolsa(){
        System.out.println("El tamaño de la bolsa es: "+tipoBolsa+"\nSu capacidad maxima es de: "+capacidad_maxima
        +"\nQuedan " +bolsas_disponibles+" bolsas disponibles\nEl codigo de la golosina es: "+codigoGolosina);
    }

    public void setCantidadBolsas(int cantidad_bolsas){
        this.bolsas_disponibles=cantidad_bolsas;
    }

    
    public void setCapacidadMaxima(int capacidad_maxima_golocinas){
        this.capacidad_maxima = capacidad_maxima_golocinas;
    }




    
}
