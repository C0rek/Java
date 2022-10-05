package Practico_2;

public class Racional {


    //(a/b) + (c/d)= (ad+bc)/bd
    public double Sumar (int num1,int denom1,int num2,int denom2){
        int num=(num1*denom2)+(num2*denom1);
        int denom=(denom1*denom2);
        double result=(num/denom);
        return (result);
    }

    //(a/b) - (c/d)= (ad-bc)/bd
    public double Restar (int num1,int denom1,int num2,int denom2){
        int num=(num1*denom2)-(num2*denom1);
        int denom=(denom1*denom2);
        double result=(num/denom);
        return (result);       
    }

    //(a/b)*(c/d)= ac/bd
    public double Multiplicar(int num1,int denom1,int num2,int denom2){
        int num=(num1*num2);
        int denom=(denom1*denom2);
        double result=(num/denom);
        return (result);
    }
    //Dividir
    //(a/b)/(c/d)= ad/bc
    public double Dividir(int num1,int denom1,int num2,int denom2){
        int num=(num1*denom2);
        int denom=(denom1*num2);
        double result=(num/denom); 
        return (result);
    } 
            
    //Son iguales?
    public void Igualdad (int num1,int denom1,int num2,int denom2){
        if (num1==num2){
            if (denom1==denom2){
                System.out.println("Los numeros ingresados, son iguales");
            } else {
                System.out.println("Los numeros ingresados, no son iguales");
            }
            } else {
                System.out.println("Los numeros ingresados, no son iguaes");
            }
    }
    //Potencia
    public double Potencia (int num1,int denom1,int exp){
        int p=1;
        int k=1;
        for (int i=0;i<exp;i++){
            p=num1*p;
        }
        for (int i=0;i<exp;i++){
            k=denom1*k;
        }
        double result=(p/k);
        return (result);
    }
}
    
    
