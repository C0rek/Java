import java.util.*;

public class Entero {
    float numero1;
    float numero2;	
        
    //Pide un numero y verifica si es entero
    public void PedirNum1(){
        float x=0;
        boolean z=false;
        System.out.print("Ingrese un numero entero: ");
        while (z==false){
            Scanner sc = new Scanner (System.in);
            float n = sc.nextInt();
            if ((n>-32676)&&(n<32676)){
                z=true;
                x=n;
            }
            else{
                System.out.println("El numero es invalido");
            }
            sc.close();
          numero1 = x;
        }
    }
    
    
    public void PedirNum2(){				//pido numero 2 para la potencia
        float x=0;
        boolean z=false;
        System.out.print("Ingrese un numero entero: ");
        while (z==false){
            Scanner entrada=new Scanner (System.in);
            float n = entrada.nextInt();
            entrada.close();
            if ((n>-32676)&&(n<32676)){
                z=true;
                x=n;
            }
            else{
                System.out.println("El numero es invalido");
            }
          numero2=x;
        }
    }
    
    //pedir numero1
    public float traernro1()
    {
        return numero1;
    }
    
    //pedir numero2
    public float traernro2()
    {
        return numero2;
    }
        
    public float Sumar(float num2) {
        float suma=numero1 + num2;
        return suma;
    }
    
    public float Restar(float num2) {
        float resta= numero1-num2;
        return resta;
    }
    
    public float multiplicar(float num2) {
        float mult=0;
        mult = numero1 * num2;
        return mult;
    }

    public float dividir(float num2) {
        float div=0;
        div = numero1 / num2;
        return div;
    }

    public float Resto(float num2) {
        float resto=0;
        resto = numero1 % num2;
        return resto;
    }

    public float Potencia(float num2) {
        float potencia=1;
        if (num2<0) {
            System.out.println("");
        }
        for (int i=0; i<num2; i++) {
            potencia=numero1*numero1;	
        }
        return potencia;
    }

    public void Iguales(float num1, float num2) {
        boolean igual=false;
        if(num1==num2) {
            igual= true;
            System.out.println("La igualdad es: " +igual);
        } else {
            System.out.println("La igualdad es: " +igual);
        }
    }
    
    
}
