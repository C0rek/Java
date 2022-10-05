public class JuegoTruco extends NaipeEspañol{
    private static String palo;
	private static int numero;
    
    public JuegoTruco() {
        super(palo, numero);
        //TODO Auto-generated constructor stub
    }

    public void calcularEnvido(NaipeEspañol carta1, NaipeEspañol carta2, NaipeEspañol carta3){
        String palo1, palo2, palo3;
        int valor1, valor2, valor3, envido=0, mayor=0, mayor1=0;

        palo1 = carta1.getPalo();
        palo2 = carta2.getPalo();
        palo3 = carta3.getPalo();

        valor1 = carta1.getNumero();
        valor2 = carta2.getNumero();
        valor3 = carta3.getNumero();

        int [] valores = new int[3];
        valores[0]=valor1;
        valores[1]=valor2;
        valores[2]=valor3;

        // FLOR
        if(palo1 == palo2 || palo1 == palo3 || palo2 == palo3){
            envido=20;
            if(palo1 == palo2 && palo1 ==palo3){
                System.out.println("Flor");
                //si es flor, para el envido solo cuentan las 2 cartas mas altas
                for(int i=0; i<3; i++){
                    if(valores[i]>mayor && valores[i]<=7){
                        mayor1 = mayor;
                        mayor = valores[i];
                    }
                }
            envido= envido + mayor1 + mayor;
            // si no es FLOR, se suma las cartas mas altas
            } else {
                if(palo1 == palo2){
                    envido = envido + valor1 + valor2;
                } else if (palo1 == palo3){
                    envido = envido + valor1 + valor3;
                } else if (palo2 == palo3){
                    envido = envido + valor2 + valor3;
                }
            }
            System.out.println("El envido es de: " + envido);
            // Si no hay 2 palos iguales, no se suma 20, por lo que el envido pasa a ser la carta mas alta menor o igual a 7
        } else {
            for(int i=0; i<3; i++){
                if(valores[i]<=7 && valores[i]>mayor){
                    mayor = valores[i];
                }  
            } envido = mayor; 
            System.out.println("Tu envido es de " + envido);
        }
    }

    public void mayorValor(NaipeEspañol carta1, NaipeEspañol carta2, NaipeEspañol carta3){
        String palo1, palo2, palo3;
        int valor1, valor2, valor3;
        
        palo1 = carta1.getPalo();
        palo2 = carta2.getPalo();
        palo3 = carta3.getPalo();
        
        valor1 = carta1.getNumero();
        valor2 = carta2.getNumero();
        valor3 = carta3.getNumero();

        int [] valores = new int[3];
        valores[0]=valor1;
        valores[1]=valor2;
        valores[2]=valor3;

        String [] palos = new String[3];
        palos[0]=palo1;
        palos[1]=palo2;
        palos[2]=palo3;

        for (int i =0; i<3; i++){
            if(valores[i]==1){
                if(palos[i]=="Espada"){
                    System.out.println("Carta mas alta: 'As de espada'");
                } else if (palos[i]== "Basto"){
                    System.out.println("Carta mas alta: 'As de Basto'");
                }
            } else if(valores[i]==7) {
                if(palos[i]=="Espada"){
                    System.out.println("Carta mas alta: '7 de espada'");
                } else if (palos[i]== "Oro"){
                    System.out.println("Carta mas alta: '7 de Oro'");
            } else if (valores[i] == 3){
                System.out.println("Carta mas alta: '3'");
            } else if (valores[i] == 2){
                System.out.println("Carta mas alta: '2'");
            } else if(valores[i]==1){
                if(palos[i]=="Oro"){
                    System.out.println("Carta mas alta: '1 de Oro'");
                } else if (palos[i]== "Copa"){
                    System.out.println("Carta mas alta: '1 de Copa'");
                }
            } else if (valores[i] == 12){
                System.out.println("Carta mas alta: '12'");
            } else if(valores[i] == 11){
                System.out.println("Carta mas alta: '11'");
            } else if(valores[i] == 10){
                System.out.println("Carta mas alta: '10'");
            } else if(valores[i] == 7){
                if(palos[i]=="Copa"){
                    System.out.println("Carta mas alta: '7 de Copa'");
                } else if (palos[i]== "Basto"){
                    System.out.println("Carta mas alta: '7 de Basto'");
            }

            } else if(valores[i] == 6){
                System.out.println("Carta mas alta: '6'");                
            } else if(valores[i] == 5){
                System.out.println("Carta mas alta: '5'");
            } else if(valores[i] == 4){
                System.out.println("Carta mas alta: '4'");
            }
        }
        
    }
}
}
