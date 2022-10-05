import java.util.*;

public class Compra {
    public static void main(String[] args) {
        //variables
        String nombre, email;
        int edad, DNI;

        Scanner sc = new Scanner(System.in);

        //CREAR USUARIO
        System.out.println("Crea un usuario ");

        //se pregunta por los datos personales de la persona
        System.out.println("Ingrese su nombre y apellido: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        System.out.println("Ingrese su DNI (Ej: 43136992)");
        DNI = sc.nextInt();

        System.out.println("Ingrese su email");
        email = sc.nextLine();

        System.out.println("Se creo su usuario con exito");
        Usuario nuevo = new Usuario(nombre, edad, DNI, email);
        nuevo.mostrarUsuario();

//----------------------------------------------------------------------------------------------------------
       
// PRODUCTOS Y VENTAS

        //variable
        int cantidad, total=0;
        boolean unidades=true;

        // se crean los productos con su nombre-marca-precio-cantidad
        Producto[] arreglo = new Producto[3]; 
        arreglo[0] = new Producto("Vino", "Cafayate", 285, 4);
        arreglo[1] = new Producto("Sopa", "Maruchan", 245, 10);
        arreglo[2] = new Producto("Gaseosa Cola Zero", "Coca-Cola", 130, 14);

        // por la cantidad de productos se ejecuta el ciclo para mostrar los productos y preguntar por su adquisicion
        for(int i=0; i<3; i++){
            unidades = true;
    
            System.out.println("Producto: "+arreglo[i].getProducto()+"\nMarca: " + arreglo[i].getMarca() + "\nPrecio: " +arreglo[i].getPrecio()+"$");
            
            //se crea un while para que el cliente pueda equivocarse y asi si poder llevarse el producto
            while(unidades){
                System.out.println("Cuantas unidades desea llevar? ");
                cantidad = sc.nextInt();
                
                if(cantidad!=0){ //quiere llevar producto
                    
                    if(cantidad<=arreglo[i].getCantidad()){ //pregunto por stock
                        System.out.println("Se ha agregado con exito al carrito " +cantidad+ " productos de " +arreglo[i].getProducto()+"\n");
                        arreglo[i].setCantidad(arreglo[i].getCantidad()-cantidad); //disminuyo del stock la cantidad que el cliente se lleva
                        total = total + (arreglo[i].getPrecio()*cantidad);
                        unidades = false; //se combierte en false para salir del ciclo y entrar a un nuevo producto

                    } else { //no stock
                        System.out.println("No hay suficientes articulos en stock. Solo hay disponibles: "+arreglo[i].getCantidad());
                    }
                } else { //no lleva producto
                    System.out.println("Decidio no llevar " +arreglo[i].getProducto()+ "\n");
                    unidades = false;
                }
            }   
            
        }
        System.out.println("El precio total es: " +total+"$");

//-------------------------------------------------------------------------------------------------------------------
        
        // CARGAR DOMICILIO

        //variables
        int numero, precio_envio=150, piso;
        String calle, barrio;
        char departamento, depto;

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

//--------------------------------------------------------------------------------------------------------------------

        //APLICAR DESCUENTO JUBILADO DEL 50% ENVIO
        if(edad>55){
            casa1.Aplicar_Descuento_envio();
            System.out.println("Total a pagar: " +(total+casa1.Aplicar_Descuento_envio())+"$");
        }else{
            System.out.println("No es capaz de obtener un descuento ya que no es mayor a 55 años");
            System.out.println("Total a pagar: " +(total+150)+"$");
        }

//---------------------------------------------------------------------------------------------------------------------------

        System.out.println("MUCHAS GRACIAS POR SU COMPRA, VUELVA PRONTO <3");

        sc.close();   
    }

}
