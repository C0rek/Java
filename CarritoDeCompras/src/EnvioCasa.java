public class EnvioCasa {
    private String calle;
    private int numero;
    private String barrio;
    private int precio_envio;

    
    public EnvioCasa(String calle, int numero, String barrio, int precio_envio){
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
        this.precio_envio = precio_envio;       
    }

    public void mostrarDomicilioCasa(){
        System.out.println("Calle: " +this.calle+" al " +this.numero+"\nBarrio: "+this.barrio);
    }

    public int getPrecioEnvio(){
        return this.precio_envio;
    }

    public double Aplicar_Descuento_envio(){
        return this.precio_envio - (this.precio_envio * 0.15); 
    }
    
}
