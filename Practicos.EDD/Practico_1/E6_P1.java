package Practico_1;

// Calcular el factorial de un número dado. Ejemplifique con el ciclo while y el ciclo for.

public class E6_P1 {
    public static void main(String[] args) {
        int x = 10, fact=1;

        for(int i = 1; i<=x; i++){
            fact=fact*i;
        }
        System.out.println(fact);

        int fact1=1, temp=x;
        while(temp!=0){
            fact1=fact*temp;
            temp=temp-1;
        }
        System.out.println(fact1);
    
        
    }
    
}
