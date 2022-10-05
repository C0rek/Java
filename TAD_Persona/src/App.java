public class App {
    public static void main(String[] args) {
        //Variables privadas
       Persona persona = new Persona ("Tomas", 43136992, 20, 'M', 75.0, 1.70);
       persona.mostarPersona();
       //System.out.println(persona.MayorDeEdad());
       //System.out.println(persona.getAltura());

       // arreglo de varias personas
       Persona [] arreglo = new Persona[2];
       arreglo[0] = new Persona("Rosi", 44760600, 18, 'F', 60.0, 1.74);
       arreglo[1] = new Persona("Ginebra", 12, 1, 'F', 500, 0.24);
       for (int i = 0; i<=1; i++){
           System.out.println(arreglo[i].getDNI());
       }


       // arreglo de varios Alumnos 
       Alumno [] arreglo1 = new Alumno[2];
       arreglo1[0] = new Alumno("Popo", 12, 1, 'F', 500, 0.24, "Profesorado de Siesta");
       arreglo1[1] = new Alumno("BoliBoli", 44760600, 18, 'F', 60, 1.74, "Medicina");

       for (int i = 0; i<=1; i++){
           System.out.println(arreglo1[i].getInfo());
       }
    }


}
