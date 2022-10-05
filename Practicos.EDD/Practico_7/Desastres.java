package Practico_7;

public class Desastres {
    private String fecha;
    private int victimas;
    private String ultima_fecha;

    public Desastres(String fecha, int cantidad_victimas){
        this.fecha=fecha;
        this.victimas=cantidad_victimas;
    }

    public String getFecha(){
        return this.fecha;
    }

    public int getVictimas(){
        return this.victimas;
    }

    public String ultimaFecha(){
        return this.ultima_fecha;
    }

    public void setFecha(String nueva_fecha){
        this.fecha = nueva_fecha;
    }

    
}
