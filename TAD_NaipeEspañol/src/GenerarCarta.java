public class GenerarCarta extends NaipeEspañol {

    private static String palo;
	private static int numero;
    private int nuevo_numero;
    private String nuevo_palo;
	
    public GenerarCarta() {
        super(palo, numero);
    }    
    
    public NaipeEspañol generaRandom() {
        String[] palo = {"Oro","Espada","Basto","Copa"};
        int[] carta = {1,2,3,4,5,6,7,10,11,12};
        int rPalo = (int)(Math.random()*4);
        int rCarta = (int)(Math.random()*10);
        nuevo_palo = palo[rPalo];
        nuevo_numero = carta[rCarta];
        this.setPalo(nuevo_palo);
        this.setNumero(nuevo_numero);
        NaipeEspañol cartas = new NaipeEspañol(palo[rPalo],carta[rCarta]);
        return cartas;
    }

}
