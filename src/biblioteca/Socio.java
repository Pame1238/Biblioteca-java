package biblioteca;
public class Socio {
    int dni;
    String apellido;
    String nombre;
    String direccion;
    Socio siguiente;
    //constructor
    public Socio(int dni, String apellido, String nombre, String direccion){
        this.dni=dni;
        this.apellido=apellido;
        this.nombre=nombre;
        this.direccion=direccion;
        this.siguiente=null;
    }
    
    
    
    public void enlazarSiguiente(Socio s){
        siguiente=s;
    }
    
    
    
    public Socio obtenerSiguiente(){
        return siguiente;
    }
    
    
    
    public String socioNombre(){
        return nombre;
    }
    public String socioApellido(){
        return apellido;
    }
    public String socioDireccion(){
        return direccion;
    }
    public int socioDNI(){
        return dni;
    }
    
    
    
    public void modificar(int dni, String apellido, String nombre, String direccion){
        this.dni=dni;
        this.apellido=apellido;
        this.nombre=nombre;
        this.direccion=direccion;
    }
    
    
    
    public void leerSocio(){
        System.out.println("Nombre del socio: "+nombre);
        System.out.println("Apellido del socio: "+apellido);
        System.out.println("Direccion del socio: "+direccion);
        System.out.println("DNI del socio: "+dni);
    }
}
