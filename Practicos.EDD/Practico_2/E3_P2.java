package Practico_2;

public class E3_P2 {
    public static void main(String[] args) {
		Natural a = new Natural();
		Natural b = new Natural();
		//Natural c = new Natural();
		
		a.PedirNum1();
		b.PedirNum2();
		int n2 = b.traernro2();					//Lo guardo para poder usarlo
		//System.out.println(a.traernro1());
		//System.out.println(b.traernro2());
		System.out.println("La suma es de : " + a.Sumar(n2));
		System.out.println("La resta es de : " + a.Restar(n2));
		System.out.println("La multiplicacion es de :" + a.multiplicar(n2));
		System.out.println("El cociente es de :" +a.dividir(n2));
		System.out.println("El resto es de : " +a.Resto(n2));
		System.out.println("La potencia es de : " +a.Potencia(n2));
	}
    
}
