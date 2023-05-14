/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misproyectos.juego;

/**
 *
 * @author Fuente$
 */
public class Personaje {

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    private String nombre;
    private int id;
    private int nivel=1;
    private int vida=100;
    private double danio = 7;
    private double velocidad=1;
    
    Personaje(int id) {
        switch (id){
            case 1 -> {
                this.nombre="Mafioso";
                this.id=id;
                this.vida=vida+12;
                this.danio=danio+3;
                this.velocidad=velocidad+0.2;
            }
            case 2 -> {
                this.nombre="Soldados";
                this.id=id;
                this.vida=vida+10;
                this.danio=this.danio;
                this.velocidad=(this.velocidad-0.2);
                break;
            }
            case 3 -> {
                this.nombre="Ninja";
                this.id=id;
                this.vida=vida+7;
                this.danio=this.danio-0.1;
                this.velocidad=(this.velocidad+0.7);
                break;
            }
            case 4 -> {
                this.nombre="Inmortal";
                this.id=id;
                this.vida=vida+40;
                this.danio=this.danio;
                this.velocidad=(this.velocidad-0.5);
                break;
            }
        }
    }
    
    //------------------------GETTERS Y SETTERS------------------------------
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public double getDanio() {
        return danio;
    }

    public void setDanio(double danio) {
        this.danio = danio;
    }

    public double getVelocidad() {
        return velocidad;
    }
}
