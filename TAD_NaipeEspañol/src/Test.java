public class Test {
    public static void main(String[] args){
        
        NaipeEspañol carta = new NaipeEspañol("Basto", 7);
        NaipeEspañol carta1 = new NaipeEspañol("Oro", 4);
        NaipeEspañol carta3 = new NaipeEspañol("Espada", 3);
        
        GenerarCarta carta2 = new GenerarCarta();
        carta2.generaRandom();
        
        //carta2.getCarta();
        JuegoTruco juego1 = new JuegoTruco();
        juego1.mayorValor(carta, carta1, carta3);



        
        //System.out.println(carta.mismoValor(carta1));

        
        //carta.mayorValor(carta1); //que valor de carta es mas alto
        
        //carta.setNombre("Caballo de Copas"); //cambiar nombre;


    }
}
