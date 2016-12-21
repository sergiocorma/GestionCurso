/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestioncurso;

import Menus.Menu;
import java.util.Scanner;

/**
 *
 * @author Sergio Corma
 */
public class GestionCurso {
    
    public Curso buscarCurso(Curso[] vCursos, String nombre){
        Curso nuevo=null;
        
        for (Curso curso1:vCursos){
            if (curso1.getNombre().equalsIgnoreCase(nombre)){
                nuevo = curso1;
            }
        }
        return nuevo;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion1=0;
        Curso[] vCursos=new Curso[3];
        Curso cursoActual;
        String nombre;
        //menu
        
        
        
        do{
            Scanner leer=new Scanner(System.in);
            Menu.pintaMenu();
            opcion1=leer.nextInt();
            switch(opcion1){
                case 1:
                    
                    break;
                case 2:
                    System.out.println("Introduce el nombre del Curso: ");
                    nombre=leer.next();
                    cursoActual = buscarCurso();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    System.out.println("¡Opcion no valida!");
                    break;
                
            }
            
        }while(opcion1!=4);
        
        
        
        
       
        
        int opcion;
        
        do{
            Scanner leer=new Scanner(System.in);
            Menu.pintaMenuPrimero();
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    cursoActual.insertarModulo();
                    break;
                case 2:
                    cursoActual.mostrarModulos();
                    break;
                case 3:
                    cursoActual.consultarHorasTotales();
                    break;
                case 4:
                    System.out.println("Introduce el nombre del modulo a eliminar: ");
                    String nombre=leer.next();
                    cursoActual.eliminarModulo(nombre);
                    
                    break;
                case 5:
                    System.out.println("ADIOS!");
                    break;
                default:
                    System.out.println("¡Opcion invalida!");
                    break;
            }
                
            
            }while (opcion!=5);
        
        
        
        
        
        
        
        
        
        
       /* 
       for (int i=0;i<3;i++){
        
        vModulos[i]= Menu.pedirModulos();
        
        }
        */
        
    }
    
}
