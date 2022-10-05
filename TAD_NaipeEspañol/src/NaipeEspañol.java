public class NaipeEspañol{
    //atributos
    private String palo;
    private int numero;
    private String nombre;


    public NaipeEspañol(String palo, int numero){
        this.palo=palo;
        this.numero=numero;
        this.nombre = "";
    }

    //mostrar carta
    public void getCarta(){
        System.out.println("La carta es: " +this.numero + " de " +this.palo);
    }
    //obtener palo
    public String getPalo(){
        return this.palo;
    }

    //obtener numero
    public int getNumero(){
        return this.numero;
    }

    public void setPalo(String nuevo_palo){
        this.palo = nuevo_palo;
    }

    public void setNumero(int nuevo_numero){
        this.numero = nuevo_numero;
    }

    //comprobar mismo palo
    public boolean mismoPalo(NaipeEspañol palo2){
        boolean iguales = true;
        if(palo2.getPalo()!= palo){
            iguales = false;
        }
        return iguales;     
    }

    // indicar si, dada otra carta, tienen el mismo valor
    public boolean mismoValor(NaipeEspañol valor){
        boolean iguales = true;
        if(valor.getNumero() != numero){
            iguales = false;
        }
        return iguales;
    }

    //dada otra carta, devolver la de mayor valor
    public void mayorValor(NaipeEspañol carta){
        if(carta.getNumero()<numero){
            System.out.println("La carta mas alta es: " +numero+" de "+palo);
        } else if (carta.getNumero() > numero){
            System.out.println("La carta mas alta es: "+carta.getNumero()+" de " + carta.getPalo());
        } else if (carta.getNumero() == numero){
            System.out.println("Tienen el mismo valor");
        }

    }
    
    //asignar el nombre según el número (por ejemplo, el 1 de espadas se llamará “as de espadas”)
    public void setNombre(String nuevo_nombre){
        this.nombre = nuevo_nombre;
        System.out.println("La carta "+this.numero+ " de "+ this.palo +" cambio el nombre exitosamente a '" + this.nombre+"'");
    }


}