/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misproyectos.juego;
import java.util.*;
/**
 *
 * @author Fuente$
 */
public class Jugador {
    int nvljugador=1;
    Personaje miperso;
    Arma armaperso;
    Personajes catalogoperso = new Personajes();
    Scanner sc = new Scanner(System.in);
    
    public void ElegirPersonaje(){
        catalogoperso.llenarPersonajes();
        System.out.println("-------------------------------------");
        System.out.println("    ELECCIÓN DE PERSONAJE            ");
        System.out.println("-------------------------------------");
        for (int cont=0; cont<catalogoperso.conta;cont++){
            System.out.println("Nombre: "+catalogoperso.aPersonajes[cont].getNombre());
            System.out.println("Nivel: "+catalogoperso.aPersonajes[cont].getNivel());
            System.out.println("Velocidad: "+catalogoperso.aPersonajes[cont].getVelocidad());
            System.out.println("Vida: "+catalogoperso.aPersonajes[cont].getVida()); 
            System.out.println("-------------------------------------");
        }
        System.out.print("OPCION: ");
        int opcion = sc.nextInt();
        miperso = new Personaje(opcion);
    }
    
    public void ElegirArma(){
        System.out.println("-------------------------------------");
        System.out.println("    ELECCIÓN DE ARMA            ");
        System.out.println("-------------------------------------");
        System.out.println("1.PISTOLA");
        System.out.println("2.ESCOPETA");
        System.out.println("3.METRALLETA");
        System.out.println("4.DUALES");
        System.out.println("5.BAZOKA");
        System.out.println("-------------------------------------");
        System.out.print("OPCION: ");
        int opcion= sc.nextInt();
        do{
            armaperso = new Arma(opcion);
        }
        while (opcion<0&&opcion>5);
    }
}
