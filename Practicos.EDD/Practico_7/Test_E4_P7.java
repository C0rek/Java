package Practico_7;

import java.util.*;

public class Test_E4_P7 {
    public static void main(String[] args) {
        E4_P7 miLista = new E4_P7();
    
        int opcion= 0;
        int elemento;

        Scanner sc = new Scanner(System.in);
        do {
	    	try {	
	        		
	    		System.out.print("1. Agregar un elemento al inicio de la lista\n"
							+ "2. Agregar un elemento al final de la lista\n"
							+ "3. Mostrar los elementos de la lista\n"
							+ "4. Eliminar elemento del inicio de la lista\n"
							+ "5. Eliminar elemento del final de la lista\n"
							+ "6. Eliminar elemento especifico\n"
							+ "7. Buscar un elemento en la lista\n"
							+ "8. Salir\n"
							+ "\n"
							+ "Ingrese una opcion: ");
	    		opcion = sc.nextInt();
					
	    		switch (opcion) {
					
	    			case 1:
	    				System.out.print("\nElemento a ingresar en la lista: ");
						elemento = sc.nextInt();
						miLista.insertaTope(elemento);
						break;

					case 2:
						System.out.print("\nElemento a ingresar en la lista: ");
						elemento = sc.nextInt();
						miLista.insertaFin(elemento);
						break;

					case 3:
						System.out.println("\nLista:");
						miLista.listar();
						System.out.println("\n");
						break;

					case 4:
                        miLista.eliminaTope();
                        System.out.println("\nElemento eliminado con exito");
						break;

					case 5:
                        miLista.eliminaFin();
                        System.out.println("\nElemento eliminado con exito");
						break;

					case 6:
						break;

					case 7:
						System.out.print("\nElemento a buscar: ");
						elemento = sc.nextInt();
						if (!miLista.estaVacia()) {
							if (miLista.valorEnLista(elemento)) {
								System.out.println("\nEl elemento se encuentra en la lista\n");
							} else {
								System.out.println("\nEl elemento NO se encuentra en la lista\n");
							}
						} else {
							System.out.println("\nLa lista esta vacia\n");
						}
						break;

					case 8:
						break;
                        
					default:
						System.out.println("\nError! Ingrese una opcion valida\n");
				}
	    		
	        }catch (Exception excp) {
	        	System.out.println("Error! "+ excp.getMessage());
	        }
	    	
	    } while(opcion!=8);
        sc.close();
    }
}
    

