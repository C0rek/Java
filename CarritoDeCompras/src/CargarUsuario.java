import java.util.*;

public class CargarUsuario {
    public static void main(String[] args) {
        String nombre, email;
        int edad, DNI;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese su nombre y apellido: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        System.out.println("Ingrese su DNI (Ej: 43136992)");
        DNI = sc.nextInt();

        System.out.println("Ingrese su email");
        email = sc.nextLine();



        Usuario nuevo = new Usuario(nombre, edad, DNI, email);
        nuevo.mostrarUsuario();

        sc.close();
    }
    
}
