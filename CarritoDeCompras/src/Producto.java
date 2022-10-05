public class Producto{
    private String nombre;
    private String marca;
    private int precio;
    private int cantidad;
    
    public Producto(String nombre_produc, String marca_produc, int precio_produc, int cantidad_disp){
        this.nombre = nombre_produc;
        this.marca = marca_produc;
        this.precio = precio_produc;
        this.cantidad = cantidad_disp;
        
    }

    public String getProducto(){
        return this.nombre;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public int getPrecio(){
        return this.precio;
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int nueva_cantidad){
        this.cantidad = nueva_cantidad;
    }

}