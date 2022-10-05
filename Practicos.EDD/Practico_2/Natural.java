package Practico_2;

import java.util.*;

public class Natural {
	int numero1;
	int numero2;	
		
	//Pide un numero y verifica si es entero
	public void PedirNum1(){
		int x=0;
		boolean z=false;
		System.out.print("Ingrese un numero natural: ");
		while (z==false){
			Scanner sc = new Scanner (System.in);
			int n = sc.nextInt();
			if ((n>0)&&(n<32676)){
				z=true;
				x=n;
			} else {
				System.out.println("El numero ingresado no es natural, ingrese otro");
			}
		  numero1=x;
          sc.close();
		}
	}
	
	
	public void PedirNum2(){
		int x=0;
		boolean z=false;
		System.out.print("Ingrese un numero natural: ");
		while (z==false){
			Scanner entrada=new Scanner (System.in);
			int n = entrada.nextInt();
			entrada.close();
			if ((n>0)&&(n<32676)){
				z=true;
				x=n;
			}
			else{
				System.out.println("El numero ingresado no es natural, ingrese otro");
			}
		  numero2=x;
		}
	}
	
	//pedir numero1
	public int traernro1()
	{
		return numero1;
	}
	
	//pedir numero2
	public int traernro2()
	{
		return numero2;
	}
		
	
	//Sumar
	public int Sumar(int num2) {
		int suma=numero1 + num2;
		return suma;
	}
	
	//Restar
	public int Restar(int num2) {
		int resta=0;
		if(numero1<num2) {
			resta=0;
			System.out.println("N1 es menor a N2. No se puede realizar la resta");
		}else {
			resta = numero1-num2;
		}
		return resta;
	}
	
	//Multiplicar
	
	public int multiplicar(int num2) {
		int mult=0;
		mult = numero1 * num2;
		return mult;
	}
	
	//Dividir
	public int dividir(int num2) {
		int div=0;
		div = numero1 / num2;
		return div;
	}
	
	//Resto
	public int Resto(int num2) {
		int resto=0;
		resto = numero1 % num2;
		return resto;
	}
	
	//Potencia
	public int Potencia(int num2) {
		int potencia=1;
		for (int i=0; i<num2; i++) {
			potencia=numero1*numero1;	
		}
		return potencia;
	}
	
	//Iguales?
	public void Iguales(int num1, int num2) {
		boolean igual=false;
		if(num1==num2) {
			igual= true;
            System.out.println("La igualdad es: " +igual);
		} else {
            System.out.println("La igualdad es: " + igual);
        }

	}
	
}

