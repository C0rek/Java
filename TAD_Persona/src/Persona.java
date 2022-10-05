public class Persona {
    // Variables privadas
    private String nombre;
    private int DNI;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;
    
    // clase Persona que pide todos los parametros 
    public Persona(String Nombre, int DNI_p, int Edad, char Sexo, double Peso, double Altura){
        this.nombre = Nombre;
        this.DNI = DNI_p;
        this.edad = Edad;
        this.sexo = Sexo;
        this.peso = Peso;
        this.altura = Altura;
    }

    // Imprime las caracteristicas de las personas
    public void mostarPersona(){
        System.out.println("La persona tiene las siguientes caracteristicas:\nNombre = " + this.nombre + 
        "\nDNI = " + this.DNI + "\nEdad = " + this.edad + "\nSexo = " + this.sexo + "\nPeso = " + this.peso + "\nAltura = " +this.altura);
    }
    
    // funciones get nombre-dni-edad-peso-sexo-altura
    public String getNombre(){
        return nombre;
    }

    public int getDNI(){
        return DNI;
    }

    public int getEdad(){
        return edad;
    }

    public char getSexo(){
        return sexo;
    }

    public double getPeso(){
        return peso;
    }

    public double getAltura(){
        return altura;
    }

    //otros metodos
    public  boolean MayorDeEdad(){
        if (this.edad >= 21) return true;
        else return false;
    }

}
