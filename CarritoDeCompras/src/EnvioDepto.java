public class EnvioDepto extends EnvioCasa {
    private char departamento;
    private int piso;

    public EnvioDepto(String calle, int numero, String barrio, int piso,  char departamento,  int precio_envio) {
        super(calle, numero, barrio, precio_envio);
        this.piso = piso;
        this.departamento = departamento;
            
    }
    public void mostrarDomicilioCasa(){
        System.out.println("Departamento: " +this.piso+" "+this.departamento);
    }

    public int getPiso(){
        return this.piso;
    }

    public char getDepartamento(){
        return this.departamento;
    }
    
    
}
