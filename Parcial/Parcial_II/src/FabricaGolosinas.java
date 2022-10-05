/*
En una fábrica de golosinas de nuestra ciudad, se desea diseñar un método que permita envasar su producción en 
“bolsas” para su comercialización y transporte.
Para esto, se cuenta con una lista BOLSAS de bolsas disponibles, la cual cuenta con la información de tipo bolsa 
(pequeñas, medianas, grandes, etc), capacidad_maxima, golosina_asignada (código de la golosina), este último, 
se encuentra vacío.
El método considera, además, una lista PRODUCCION con los siguientes datos: código del caramelo y cantidad de 
caramelos producidos, por lo que se pide:
1)    Completar la lista BOLSAS, considerando que la capacidad máxima de las bolsas, coincidan con la cantidad de 
caramelos producidos y su menor desperdicio (capacidad)
2)    Se debe mostrar la lista BOLSAS solo de las bolsas asignadas.
Nota: tenga en cuenta que cuando se asigna la producción de una golosina a una bolsa, 
el código de la golosina debe ser incorporado a la lista de BOLSAS y la golosina debe ser eliminada de la lista 
PRODUCCION.
*/
import java.util.*;

public class FabricaGolosinas {
    public static void main(String[] args) {
        
        clsListaOrdenada1 bolsas = new clsListaOrdenada1();
        clsListaOrdenada1 golosinas = new clsListaOrdenada1();
    
        Scanner sc = new Scanner(System.in);

        //variables
        String nombreGolosina;
        int codigo_golosina, golosinasProducidas;

        //cargo golosina
        
        System.out.println("Ingrese el nombre de la golosina: ");
        nombreGolosina = sc.next().toUpperCase();
        System.out.println("Se establecio el nombre de la golosina como: " +nombreGolosina+"\n"); 

        System.out.println("Ingrese el codigo del producto " +nombreGolosina+" :");
        codigo_golosina=sc.nextInt();

        System.out.println("Ingrese la cantidad de " + nombreGolosina + "/s producidas: ");
        golosinasProducidas=sc.nextInt();

        ClaseCaramelo producto = new ClaseCaramelo(codigo_golosina, golosinasProducidas);

        golosinas.inserta(producto);

        //cargar bolsa
        int tipoDeBolsa, cantidad_bolsas_g, capacidad_maxima;

        System.out.println("\nTipo de bolsa que desea: \n1-Pequeña\n2-Mediana\n3-Grande\n\nOpcion:");
        tipoDeBolsa = sc.nextInt();
        
        //selecciono tipo de bolsa
            boolean b=true;
            do{
                switch(tipoDeBolsa){

                    case 1:
                        System.out.println("Tipo de bolsa seleccionada: Pequeña");
                        ClaseBolsa bolsap = new ClaseBolsa("pequeña");
                        System.out.println("Cuantas bolsas pequeñas hay en stock? ");
                        cantidad_bolsas_g = sc.nextInt();
                        bolsap.setCantidadBolsas(cantidad_bolsas_g);

                        System.out.println("Cantidad de "+nombreGolosina+" que entran en dicha bolsa:");
                        capacidad_maxima=sc.nextInt();
                        bolsap.setCapacidadMaxima(capacidad_maxima);

                        System.out.println("Se establecio con exito que entran " +capacidad_maxima+" " +nombreGolosina+" en la bolsa pequeña\n");
                
                        bolsas.inserta(bolsap);
                        b=false;
                        break;

                    case 2:
                        System.out.println("Tipo de bolsa seleccionada: Mediana");
                        ClaseBolsa bolsam = new ClaseBolsa("mediana");
                        System.out.println("Cuantas bolsas medianas hay en stock? ");
                        cantidad_bolsas_g = sc.nextInt();
                        bolsam.setCantidadBolsas(cantidad_bolsas_g);

                        System.out.println("Cantidad de "+nombreGolosina+" que entran en dicha bolsa:");
                        capacidad_maxima=sc.nextInt();
                        bolsam.setCapacidadMaxima(capacidad_maxima);

                        System.out.println("Se establecio con exito que entran " +capacidad_maxima+" " +nombreGolosina+" en la bolsa Mediana\n");

                        bolsas.inserta(bolsam);
                        b=false;
                        break;

                    case 3:
                        System.out.println("Tipo de bolsa seleccionada: Grande");
                
                        ClaseBolsa bolsag = new ClaseBolsa("grande");
                
                        System.out.println("Cuantas bolsas grandes hay en stock? ");
                        cantidad_bolsas_g = sc.nextInt();
                        bolsag.setCantidadBolsas(cantidad_bolsas_g);

                        System.out.println("Cantidad de "+nombreGolosina+" que entran en dicha bolsa:");
                        capacidad_maxima=sc.nextInt();
                        bolsag.setCapacidadMaxima(capacidad_maxima);

                        System.out.println("Se establecio con exito que entran " +capacidad_maxima+" " +nombreGolosina+" en la bolsa Grande\n");
                
                        bolsas.inserta(bolsag);
                        b=false;
                        break;

                    default:
                        System.out.println("Ingrese un numero correcto"); 
                        break;
            } 
            b=false;
        } while(b==true);
        sc.close();
    }
}
