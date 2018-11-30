package biblioteca;
public class listaLibros {
    Libro primero;
    int tamaño;
    
    
    
    
    
    public listaLibros(){
        primero = null;
        tamaño = 0;
    }
    
    
    
    
    
    
    public void agregarPrimero(String nombre, String autor, int cantidad){
        if(primero==null){
            primero = new Libro(nombre,autor,cantidad);
        }
        else{
            Libro temp = primero;
            Libro nuevo = new Libro(nombre,autor,cantidad);
            nuevo.enlazarSiguiente(temp);
            primero = nuevo;
        }
        tamaño++;
    }
    
    
    
    
    
    
    
    public int tamaño(){
        return tamaño;
    }
    
    
    
    
    
    
    
    
    public Object buscarNombre(String nombre){
        Libro temporal=primero;
        while((temporal!=null)&&(nombre!=temporal.libroNombre())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El libro no existe";
        }
        else{
            return temporal;
        }
    }
    public Object buscarAutor(String autor){
        Libro temporal=primero;
        while((temporal!=null)&&(autor!=temporal.libroAutor())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El libro no existe";
        }
        else{
            return temporal;
        }
    }
    
    
    
    
    
    
    
   
    public void eliminarLibro(Libro buscado){
        if(buscado==primero){
            primero=primero.obtenerSiguiente();
        }
        else{
            Libro aux1 = primero;
            Libro aux2 = primero.obtenerSiguiente();
            while((aux2!=null)&&(aux2!=buscado)){
                aux1=aux2;
                aux2=aux2.obtenerSiguiente();
            }
            aux1.enlazarSiguiente(aux1.obtenerSiguiente().obtenerSiguiente());  
        }
        tamaño--;
    }
    
    
    
    
    
    
    public boolean estaVacia(){
        return (primero==null)?true:false;
    }
    /* public void eliminarPrimero(){
        primero = primero.obtenerSiguiente();
        tamaño--;
    }*/
    /*
    public void modificarLibro(Libros encontrado,String nuevonombre, String nuevoautor, int nuevacantidad){//MODIFICAR POR INDICE
        Libros temporal = primero;
        if(!(temporal==null)){
            temporal.modificar(nuevonombre, nuevoautor, nuevacantidad);
            temporal.leerLibro();
        }
    }
    */
    /*
    public Object obtenerLibro(Libros temporal){ //OBTENER DATOS
        Libros auxiliar=primero;
        while((auxiliar!=null)&&(auxiliar!=temporal)){
            auxiliar=auxiliar.obtenerSiguiente();
        }
        return temporal;
    }
    
    public void obtenerTodo(int index){ //obtiene todos los datos del libro especificado
        obtenerNombre(index);
        obtenerAutor(index);
        obtenerCantidad(index);
    }
    public String obtenerNombre(int index){
        int contador = 0;
        Libros temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.libroNombre();
    }
    public String obtenerAutor(int index){
        int contador = 0;
        Libros temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.libroAutor();
    }
    public int obtenerCantidad(int index){
        int contador = 0;
        Libros temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.libroCantidad();
    }
    */
    
    
    
    
}
