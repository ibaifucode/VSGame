/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misproyectos.juego;

/**
 *
 * @author Fuente$
 */
public class Personajes{
    Personaje[] aPersonajes = new Personaje[4];
    int conta=0;
    
    public void llenarPersonajes(){
        for (int cont=0; cont<aPersonajes.length;cont++){
            aPersonajes[cont]= new Personaje(cont+1);
            conta++;
        }
    }
    
}
