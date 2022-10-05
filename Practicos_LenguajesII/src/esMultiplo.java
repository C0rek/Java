public class esMultiplo {

    private int numero, contador=0;
    int multiplos [] = {2, 3, 7, 9};
    boolean [] divisores = new boolean[4];
    
    public esMultiplo(int numero){
        this.numero = numero;
    }

    public void siEsMultiplo(){
        if(this.numero%2==0){
            contador++;
            divisores[0]=true;
        } if(this.numero % 3 == 0){
            contador++;
            divisores[1]=true;
        } if(this.numero % 7 == 0){
            contador++;
            divisores[2]=true;
        }if(this.numero % 9 == 0){
            contador++;
            divisores[3]=true;
        }

        switch(contador){
            case 0:
                System.out.println("El numero ingresado no tiene ningun multiplo");
                break;
            case 1:
                System.out.println("El numero ingresado tiene un multiplo");
                break;
            case 2:
                System.out.println("El numero ingresado tiene dos multiplos");
                break;
            case 3:
                System.out.println("El numero ingresado tiene tres multiplos");
                break;
            case 4:
                System.out.println("El numero ingresado tiene cuatro multiplos");
                break;        
        }

        for(int i=0; i<4; i++){
            if(divisores[i] == true){
                System.out.println("El numero ingresado es multiplo de "+multiplos[i]);
            }
        }
    }
    
}
