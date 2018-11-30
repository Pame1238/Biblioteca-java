package biblioteca;

import java.util.Date;

public class listaPrestamo {
    Prestamo primero;
    int tamaño;
    
    
    
    
    public listaPrestamo(){
        primero=null;
        tamaño=0;
    }
    
    
    
    
    public void agregarPrimero(Libro libro, Socio socio, Date fecha){
        if(primero==null){
            primero = new Prestamo(libro,socio,fecha);
        }
        else{
            Prestamo temp = primero;
            Prestamo nuevo = new Prestamo(libro,socio,fecha);
            nuevo.enlazarSiguiente(temp);
            primero=nuevo;
        }
        tamaño++;
    }
    
    
    
    
    
    public int tamaño(){
        return tamaño;
    }
    
    
    
    
    
    public Object buscarLibro(Libro libro, Socio socio){
        Prestamo temporal = primero;
        while((temporal!=null)&&(libro!=temporal.obtenerLibro())&&(socio!=temporal.obtenerSocio())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El prestamo no existe";
        }
        else{
            return temporal;
        }
    }
    
    
    
    
    
    public void eliminarPrestamo(Prestamo buscado){
        if(buscado==primero){
            primero=primero.obtenerSiguiente();
        }
        else{
            Prestamo aux1 = primero;
            Prestamo aux2 = primero.obtenerSiguiente();
            while((aux2!=null)&&(aux2!=buscado)){
                aux1=aux2;
                aux2=aux2.obtenerSiguiente();
            }
            aux1.enlazarSiguiente(aux1.obtenerSiguiente().obtenerSiguiente());
        }
        tamaño--;
    }
    
    
    
    
    public boolean estaVacia(){
        return(primero==null)?true:false;
    }
}
