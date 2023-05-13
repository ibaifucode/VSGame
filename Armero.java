/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misproyectos.juego;

/**
 *
 * @author Fuente$
 */
public class Armero {
   //-------------------------ARRAY ARMAS DISPONIBLES---------------------------------
     Arma[] Armas = new Arma[4];
    
    //--SE LLENA EN FUNCIÓN DEL NIVEL--
    
    Armero(int nivel){
        for (int cont=0; cont<nivel ; cont++){
            Armas[cont]= new Arma(cont+1);
        }
    }
    
    
}
