package Practico_2;

public class E7_P2 {
    public static void imprimirOperacion(Polinomio a, Polinomio b, String op, Polinomio resultado)
    {
 System.out.print("\n(");
 a.imprimir();
 System.out.print(") " + op + " (");
 b.imprimir();
 System.out.print(") = ");
 resultado.imprimir();
 System.out.println();
 }

 public static void main(String[] args) {
     System.out.println("Polinomio 1");
     Polinomio polinomio1 = new Polinomio();
     polinomio1.leer();
     polinomio1.imprimir();
     System.out.println();
     System.out.println(polinomio1.calcularpolinomio(2));
     
     System.out.println("\n\nPolinomio 2");
     Polinomio polinomio2 = new Polinomio();
     polinomio2.leer();
     polinomio2.imprimir();
             
     System.out.println();
     imprimirOperacion( polinomio1, polinomio2, "+", polinomio1.sumar(polinomio2) );
     imprimirOperacion( polinomio1, polinomio2, "*", polinomio1.multiplicar(polinomio2) );
     }
    
}
