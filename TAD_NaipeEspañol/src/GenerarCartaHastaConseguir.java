public class GenerarCartaHastaConseguir {
    public static void main(String[] args) {
        boolean esCarta = false;
        int contador=0;
        while(esCarta != true){
            contador++;
            GenerarCarta carta = new GenerarCarta();
            carta.generaRandom();
            carta.getCarta();
            if(carta.getPalo()=="Espada"){
                if(carta.getNumero() == 1){
                    esCarta = true;
                } else {
                    esCarta = false;
                }
            } else {
                esCarta = false;
            }
    

        }
        System.out.println("Se encontro la carta\nSe crearon: " +contador+" cartas");
    }
    
}
