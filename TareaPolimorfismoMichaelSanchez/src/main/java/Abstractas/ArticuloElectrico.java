package Abstractas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Tulea4ever
 */
public abstract class ArticuloElectrico {
    private int voltaje;
    private String color;
    private boolean estado;
    
    //constructor
    public ArticuloElectrico(int voltaje, String color) {
        this.voltaje = voltaje;
        this.color = color;
    }
    
    //Gets and Sets

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //metodos abstractos
    //encender articulo
    public abstract String encender();
    //apagar articulo
    public abstract String apagar();
}
