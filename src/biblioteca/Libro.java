
package biblioteca;
public class Libro {
    String nombre;
    String autor;
    int cantidad;
    Libro siguiente;
    
    //contructor
    public Libro(String nombre, String autor, int cantidad){
        this.nombre=nombre;
        this.autor=autor;
        this.cantidad=cantidad;
        this.siguiente=null;
    }
    
    
    
    public void enlazarSiguiente(Libro l){
        siguiente=l;
    }
    
    
    
    public Libro obtenerSiguiente(){
        return siguiente;
    }
    
    
    
    public String libroNombre(){
        return nombre;
    }
    public String libroAutor(){
        return autor;
    }
    public int libroCantidad(){
        return cantidad;
    }
    
    
    
    public void modificar(String nombre, String autor, int cantidad){
        this.nombre=nombre;
        this.autor=autor;
        this.cantidad=cantidad;
    }
    
    
    
    public void leerLibro(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Autor: "+autor);
        System.out.println("Cantidad: "+cantidad);
    }
}