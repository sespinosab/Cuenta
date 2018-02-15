/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancion;

/**
 *
 * @author Estudiante
 */
public class Cancion {
    // Atributos
    public String nombre; 
    
    //Métodos
    
    public Cancion(String titulo){
        this.nombre=titulo;
    }
    public void sonar(){
       System.out.println("Sonando " + this.nombre);
    }

    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
