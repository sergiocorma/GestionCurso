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
 * @author alumno
 */
public class GestionCurso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        
        Curso primeroDAW = new Curso("primero DAW");
        
        int opcion;
        
        do{
            Scanner leer=new Scanner(System.in);
            Menu.pintaMenuPrimero();
            opcion=leer.nextInt();
            switch(opcion){
                case 1:
                    primeroDAW.insertarModulo();
                    break;
                case 2:
                    primeroDAW.mostrarModulos();
                    break;
                case 3:
                    primeroDAW.consultarHorasTotales();
                    break;
                case 4:
                    System.out.println("ADIOS!");
                    
                    break;
                default:
                    System.out.println("¡Opcion invalida!");
                    break;
            }
                
            
            }while (opcion!=4);
        
        
        
        
        
        
        
        
        
        
       /* 
       for (int i=0;i<3;i++){
        
        vModulos[i]= Menu.pedirModulos();
        
        }
        */
        
    }
    
}
