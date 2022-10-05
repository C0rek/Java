package Practico_7;

import java.util.*;
import java.text.SimpleDateFormat;

public class E6_P7 {

        
    public static void main(String[] args) {
        
        //Formato de fechas
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/YYYY");

        // Lista
        clsListaOrdenada1 Lista = new clsListaOrdenada1();
        
        //Scanner
        Scanner sc = new Scanner(System.in);

        //variables
        boolean b = true;
        String opcion;
        int dia, mes, año;
        String fechaNueva;

        //cuerpo
        do{
            System.out.println("Desea agregar un axidente? (si/no)");
            opcion = sc.next().toLowerCase();
            if(opcion.equals("si")){
                System.out.println("Ingrese el dia:" );
                dia = sc.nextInt();
                System.out.println("Ingrese el mes: (1-12)");
                mes = sc.nextInt() - 1;
                System.out.println("Ingrese el año:");
                año = sc.nextInt();

                calendar.set(año, mes, dia);
                Date fecha = calendar.getTime();
                fechaNueva=sdf.format(fecha);

                Desastres desastre = new Desastres(fechaNueva, 4);
                Lista.AñadirAlFinal(desastre);

                System.out.println("\nCreado con exito\n");
                System.out.println(desastre.getFecha());
            }else{
                b=false;
                System.out.println();
                Lista.muestra();
            }

        }while(b);
        sc.close();
    }
    
}
