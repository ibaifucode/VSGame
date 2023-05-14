/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package misproyectos.juego;

/**
 *
 * @author Ibai
 */
public class Juego {

    public static void main(String[] args) {
        Jugador jugador1 = new Jugador();
        jugador1.ElegirPersonaje();
        jugador1.ElegirArma();
        
        //VERIFICAMOS QUE TODO ESTA BIEN
        System.out.println("SEGURO QUE DESEAS ELEGIR EL PERSONAJE "+jugador1.miperso.getNombre() +"Y EL ARMA " + jugador1.armaperso.getNombre());
        
    }
}
