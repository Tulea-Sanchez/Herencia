/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismomichaelsanchez;

import Abstractas.ArticuloElectrico;
import Interfaces.Girar;

/**
 *
 * @author Tulea4ever
 */
public class Lavadora extends ArticuloElectrico implements Girar{
    private int capacidadKilos;
    
    //constructor
    public Lavadora(int capacidad, int voltaje, String color) {
        super(voltaje, color);
        this.capacidadKilos = capacidad;
    }
    
    //get and set
    public int getCapacidad() {
        return capacidadKilos;
    }

    public void setCapacidad(int capacidad) {
        this.capacidadKilos = capacidad;
    }
    
    //metodos abstract
    @Override
    public String encender(){super.setEstado(true); return "Lavadora encendida..";}
    @Override
    public String apagar(){super.setEstado(false); return "Lavadora apagada..";}
    
    //metodos interface
    public void Girar(int tiempo){
        System.out.print("Girando ");
        for (int i=0;i>-2;i++){
           //if para cuando llegue al objetivo se detenga
           if (tiempo==i){System.out.println(" --> finalizado ..");break;}
           System.out.print("*");
           //detener el programa medio segundo
           try{Thread.sleep(1000);}catch(Exception e){System.out.println("Tiempo de espera corrompido.."+e);}
        }
     
     
     }
    
}
