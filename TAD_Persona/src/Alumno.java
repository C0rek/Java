public class Alumno extends Persona {
    private String carrera;

    public Alumno(String Nombre, int DNI_p, int Edad, char Sexo, double Peso, double Altura, String carrera) {
        super(Nombre, DNI_p, Edad, Sexo, Peso, Altura);
        this.carrera = carrera;
    }

    public String getCarrera(){
        return this.carrera;
    }

    public String getInfo(){
        return "Nombre:" + this.getNombre() + " - " + "DNI:" + this.getDNI() + " - " + "Edad:" + getEdad() + " - " + "Carrera:" + getCarrera();
    }
     
}
