/*
biblioteca
libros: nombre autor cantidades
socios: nrodni apellido nombre direccion 
prestamo: libros+prestamos
 */
package biblioteca;

import java.util.Date;
import java.util.Scanner;
public class Biblioteca {
    public static void main(String[] args) {
        /*Scanner read=new Scanner(System.in);
        boolean a=true;
        int opc;
        while(a){
            System.out.println("1_ Opciones de libro");
            System.out.println("2_ Opciones de socio");
            System.out.println("3_ Prestamos");
            System.out.println("4_ Salir");
            opc=read.nextInt();
            switch(opc){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }*/
        //Libros primero = new Libros("Principito", "desconocido",5);
        listaLibros libros = new listaLibros();
        libros.agregarPrimero("Principito", "desconocido", 5);
        //libros.buscarNombre("Principito");
        //libros.buscarAutor("desconocido");
        ((Libro) libros.buscarNombre("Principito")).leerLibro();
        ((Libro) libros.buscarNombre("Principito")).modificar("Principito", "desconocido", 10);
        ((Libro) libros.buscarNombre("Principito")).leerLibro(); //casting
        
        /*Socios unomas = new Socios(37504803,"Leontes","Alan","Ardiles 679");
        unomas.obtenerSiguiente();*/
    }
}
