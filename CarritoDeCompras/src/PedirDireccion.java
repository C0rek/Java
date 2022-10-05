import java.util.*;
public class PedirDireccion {
    public static void main(String[] args) {
        //variables
        int numero, precio_envio=150, piso;
        String calle, barrio;
        char departamento, depto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el barrio en el que vive: ");
        barrio = sc.nextLine();

        System.out.println("Ingrese la calle de su domicilio: ");
        calle = sc.nextLine();
        
        System.out.println("Ingrese el numero de su domicilio: ");
        numero = sc.nextInt();
        
        EnvioCasa casa1 = new EnvioCasa(calle, numero, barrio, precio_envio);

        System.out.println("Vive en departamento?");
        departamento = sc.next().charAt(0);
        if (departamento == 'S' || departamento == 's'){
            
            System.out.println("Ingrese el piso: ");
            piso = sc.nextInt();
            
            System.out.println("Ingrese el departamento: ");
            depto = sc.next().charAt(0);
            EnvioDepto depto1 = new EnvioDepto(calle, numero, barrio, piso, depto, precio_envio);
            System.out.println("Enviar a :");
            casa1.mostrarDomicilioCasa();
            depto1.mostrarDomicilioCasa();

        } else {
            System.out.println("Enviar a: ");
            casa1.mostrarDomicilioCasa();    
        }  
        sc.close();
    }
}
