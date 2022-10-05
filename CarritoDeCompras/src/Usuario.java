public class Usuario {
        
        private String nombre;
        private int edad;
        private int DNI;
        private String email;
        
        public Usuario(String nombre, int edad, int DNI, String email){
            this.nombre = nombre;
            this.edad = edad;
            this.DNI = DNI;
            this.email = email;
        }
        
        
        public void mostrarUsuario(){
            System.out.println("Nombre: "+this.nombre+" - DNI: " +this.DNI+ " - Edad: " +this.edad);
        }

        public String getEmail(){
            return this.email;
        }
}
