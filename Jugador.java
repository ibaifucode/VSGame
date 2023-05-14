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
    private int nvljugador=1;




    Personaje miperso;
    Arma armaperso;
    Armero catalogoarmas = new Armero(nvljugador);
    Personajes catalogoperso = new Personajes();
    Scanner sc = new Scanner(System.in);
    
    public void ElegirPersonaje(){
        
        catalogoperso.llenarPersonajes();
        System.out.println("-------------------------------------");
        System.out.println("    ELECCIÓN DE PERSONAJE            ");
        System.out.println("-------------------------------------");
        for (int cont=0; cont<catalogoperso.conta;cont++){
            System.out.println("Id: "+catalogoperso.aPersonajes[cont].getId());
            System.out.println("Nombre: "+catalogoperso.aPersonajes[cont].getNombre());
            System.out.println("Nivel: "+catalogoperso.aPersonajes[cont].getNivel());
            System.out.println("Velocidad: "+catalogoperso.aPersonajes[cont].getVelocidad());
            System.out.println("Vida: "+catalogoperso.aPersonajes[cont].getVida()); 
            System.out.println("-------------------------------------");
        }
        System.out.print("OPCION(id): ");
        int opcion = sc.nextInt();
        miperso = new Personaje(opcion);
    }
    
    public void ElegirArma(){
        System.out.println("-------------------------------------");
        System.out.println("    ELECCIÓN DE ARMA            ");
        System.out.println("-------------------------------------");
        for(int cont=0; cont<catalogoarmas.conta;cont++){
            System.out.println("ID: " +catalogoarmas.Armas[cont].getId());
            System.out.println("Nombre: " +catalogoarmas.Armas[cont].getNombre());
            System.out.println("Municion: "+catalogoarmas.Armas[cont].getMunicion());
            System.out.println("xDano: " +catalogoarmas.Armas[cont].getMultiplicadano());
            System.out.println("Velocidad de disparo: " +catalogoarmas.Armas[cont].getMultiplicadano());
            System.out.println("-------------------------------------");
        }
        System.out.print("OPCION: ");
        int opcion= sc.nextInt();
        do{
            armaperso = new Arma(opcion);
        }
        while (opcion<0&&opcion>5);
    }
    
    public int getNvljugador() {
        return nvljugador;
    }
    public void setNvljugador(int nvljugador) {
        this.nvljugador = nvljugador;
    }
}
