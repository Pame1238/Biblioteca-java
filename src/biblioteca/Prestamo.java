package biblioteca;

import java.util.Date;

public class Prestamo {
    Libro libro;
    Socio socio;
    Date fecha;
    Prestamo siguiente;
    //constructor
    public Prestamo(Libro libro, Socio socio,Date fecha){
        this.libro=libro;
        this.socio=socio;
        this.fecha=fecha;
        this.siguiente=null;
    }
    
   
    
    
    public void enlazarSiguiente(Prestamo p){
        siguiente=p;
    }
    
    
    
    public Prestamo obtenerSiguiente(){
        return siguiente;
    }
    
    
    
    public Object obtenerLibro(){
        return libro;
    }
    public Object obtenerSocio(){
        return socio;
    }
    public Date obtenerFecha(){
        return fecha;
    }
}
