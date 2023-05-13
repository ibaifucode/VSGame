/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misproyectos.juego;

/**
 *
 * @author Ibai
 */
public class Arma {
    
    // --------------------------------ATRIBUTOS---------------------------------------
    
    private int id;
    private int municion;
    private double multiplicadano;
    private double veldisparo;
    private String nombre;   
    

    
    
    //-------------------------------CONSTRUCTORES-----------------------------------
    
    public Arma(int id){
        switch(id){
            case 1: 
                this.id=id;
                this.nombre="pistola";
                this.municion=100;
                this.veldisparo=1;
                this.multiplicadano=0.1;
                break;
            case 2:
                this.id=id;
                this.nombre="escopeta";
                this.municion=90;
                this.veldisparo=1.3;
                this.multiplicadano=0.4;
                break;
            case 3:
                this.id=id;
                this.nombre="metralleta";
                this.municion=80;
                this.veldisparo=1.6;
                this.multiplicadano=0.3;
                break;
            case 4:
                
                this.id=id;
                this.nombre="duales";
                this.municion=200;
                this.veldisparo=0.8;
                this.multiplicadano=0.1;
                break;
            case 5:
                this.id=id;
                this.nombre="bazoka";
                this.municion=2;
                this.veldisparo=1;
                this.multiplicadano=3;
                break;
        }
    }
    
    //--------------------------- GETTERS Y SETTERS---------------------------------
    
    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public double getMultiplicadano() {
        return multiplicadano;
    }

    public void setMultiplicadano(double multiplicadano) {
        this.multiplicadano = multiplicadano;
    }

    public double getVeldisparo() {
        return veldisparo;
    }

    public void setVeldisparo(double veldisparo) {
        this.veldisparo = veldisparo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    

    
}
