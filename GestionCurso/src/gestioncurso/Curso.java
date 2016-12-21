/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncurso;

import Menus.Menu;

/**
 *
 * @author Sergio Corma
 */
public class Curso {
    
    private String nombre;
    private Modulo[] vModulos =new Modulo[5];
    
    
    
    public Curso() {
        
    }
    
    public Curso(String nombre){
        this.nombre= nombre;
        vModulos[0]= new Modulo("Programacion",59,"Juan Francisco");
        vModulos[1]= new Modulo("Bases de Datos",60,"Pepe");
        vModulos[2]= new Modulo("Ingles",61,"Ana");
        vModulos[3]= new Modulo("Sistemas Informaticos",63,"Jose Juan");
        
        
    }
    
    //GET'S
    public String getNombre() {
        return nombre;
    }

    public Modulo[] getvModulos() {
        return vModulos;
    }
    
    private int buscarHueco(){
        int posicion=0;
        
        for(int i=0;i<vModulos.length;i++){
            if (vModulos[i]==null ){
                posicion=i;
                break;
            }
        }
        
        return posicion;
    }
    
    public void insertarModulo(){
        Modulo nuevo=Menu.pedirModulos();
        vModulos[buscarHueco()]=nuevo; 
    }
    
    public void mostrarModulos(){
        System.out.println("Los modulos del curso: "+this.nombre+"\n");
        for (Modulo modulo:vModulos){
            if (modulo!=null){
            
            System.out.println(modulo+"\n");
            
            }
            
        }  
    }
    
    public void consultarHorasTotales(){
        int totales=0;
        System.out.println("Las horas totales del curso: "+this.nombre+"\n");
        for (Modulo modulo:vModulos){
            if (modulo!=null){
            totales+=modulo.getNumhoras();
            }
        }
        System.out.println("Son: "+totales);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("\n");
    }
    
    public void eliminarModulo(String nombre){
        int posicion=0;
        
        for(Modulo modulo1:this.vModulos){
            if (modulo1.getNombre().equalsIgnoreCase(nombre)){
                vModulos[posicion]=null;
                break;
            }
           posicion++; 
           
        }
        
    }
    
}
