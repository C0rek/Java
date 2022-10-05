package Practico_7;

public class E5_P7 {
    public static void main(String[] args) {
		clsListaOrdenada1 objLista1 = new clsListaOrdenada1();
		Double obj1,obj2,obj3,obj4;
		
		obj1=30.0;
		obj2=50.0;
		obj3=-4.0;
		obj4=12.0;
		
		objLista1.inserta(obj1);
		objLista1.inserta(obj2);
		objLista1.inserta(obj3);
		objLista1.inserta(obj4);
		
		System.out.println("Lista 1:");
		objLista1.muestra();		
		System.out.println("****");
		
		System.out.println("Menor Lista 1: "+objLista1.menor());
		System.out.println("Mayor Lista 1: "+objLista1.mayor());
		
		System.out.println("****");
		
		clsListaOrdenada1 objLista2 = new clsListaOrdenada1();
		
		obj1=20.0;
		obj2=10.0;
		obj3=-1.0;
		obj4=33.0;
		
		objLista2.inserta(obj1);
		objLista2.inserta(obj2);
		objLista2.inserta(obj3);
		objLista2.inserta(obj4);
		
		System.out.println("Lista 2:");
		objLista2.muestra();
		
		System.out.println("****");
		System.out.println("Menor Lista 2: "+objLista2.menor());
		System.out.println("Mayor Lista 2: "+objLista2.mayor());
		/*
		objLista2.mezclarListas(objLista1);
		
		System.out.println("****");
		
		System.out.println("Lista 1 y 2 mezcladas con orden original:");
		objLista1.muestra();		
		System.out.println("****");
		*/
		objLista2.mezclarListas(objLista1);
		
		System.out.println("Lista 1 y 2 mezcladas mantiendo el orden:");
		objLista1.muestra();		
		System.out.println("****");
		
	}
    
}
