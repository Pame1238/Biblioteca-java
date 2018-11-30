package biblioteca;
public class listaSocios {
    Socio primero;
    int tamaño;
    
    
    
    
    public listaSocios(){
        primero = null;
        tamaño = 0;
    }
    
    
    
    
    public void agregarPrimero(int dni, String apellido, String nombre, String direccion){
        if(primero==null){
            primero = new Socio(dni,apellido,nombre,direccion);
        }
        else{
            Socio temp = primero;
            Socio nuevo = new Socio(dni,apellido,nombre,direccion);
            nuevo.enlazarSiguiente(temp);
            primero = nuevo;
        }
        tamaño++;
    }
    
    
    
    
    
    
    public int tamaño(){
        return tamaño;
    }
    
    
    
    
    
    
    
    
    public Object buscarNombre(String nombre){
        Socio temporal=primero;
        while((temporal!=null)&&(nombre!=temporal.socioNombre())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El socio no existe";
        }
        else{
            return temporal;
        }
    }
    public Object buscarApellido(String apellido){
        Socio temporal=primero;
        while((temporal!=null)&&(apellido!=temporal.socioApellido())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El socio no existe";
        }
        else{
            return temporal;
        }
    }
    public Object buscarDireccion(String direccion){
        Socio temporal=primero;
        while((temporal!=null)&&(direccion!=temporal.socioDireccion())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El socio no existe";
        }
        else{
            return temporal;
        }
    }
    public Object buscarDNI(int dni){
        Socio temporal=primero;
        while((temporal!=null)&&(dni!=temporal.socioDNI())){
            temporal=temporal.obtenerSiguiente();
        }
        if(temporal==null){
            return "El socio no existe";
        }
        else{
            return temporal;
        }
    }
    
    
    
    
    
    public void eliminar(Socio buscado){
        if(buscado==primero){
            primero=primero.obtenerSiguiente();
        }
        else{
            Socio aux1 = primero;
            Socio aux2 = primero.obtenerSiguiente();
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
    
    /*
    public void obtenerTodo(int index){ //obtiene todos los datos del socio especificado
        obtenerDNI(index);
        obtenerNombre(index);
        obtenerApellido(index);
        obtenerDireccion(index);
    }
    public int obtenerDNI(int index){
        int contador = 0;
        Socios temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.socioDNI();
    }
    public String obtenerNombre(int index){
        int contador = 0;
        Socios temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.socioNombre();
    }
    public String obtenerApellido(int index){
        int contador = 0;
        Socios temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.socioApellido();
    }
    public String obtenerDireccion(int index){
        int contador = 0;
        Socios temporal = primero;
        while(contador<index){
            temporal=temporal.obtenerSiguiente();
            contador++;
        }
        return temporal.socioDireccion();
    }
    */
    /*
    public void eliminarPrimero(){
        primero = primero.obtenerSiguiente();
        tamaño--;
    }*/
    /*
    public void modificar(int index, int dni, String apellido, String nombre, String direccion){
        if(index<=tamaño){
            int contador=0;
            Socios temporal = primero;
            while(contador<index){
                temporal=temporal.obtenerSiguiente();
                contador++;
            }
            if(!(temporal==null)){
                temporal.leerSocio();
                temporal.modificar(dni,nombre, apellido, direccion);
            }
        }
    }*/
    
    
}
