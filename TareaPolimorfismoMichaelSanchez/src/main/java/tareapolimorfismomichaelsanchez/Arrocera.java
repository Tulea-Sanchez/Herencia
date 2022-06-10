/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismomichaelsanchez;

import Abstractas.ArticuloElectrico;
import Interfaces.Calentar;

/**
 *
 * @author Tulea4ever
 */
public class Arrocera extends ArticuloElectrico implements Calentar{
    private int CantidadTasas;
    
    //constructor
    public Arrocera(int CantidadTasas, int voltaje, String color) {
        super(voltaje, color);
        this.CantidadTasas = CantidadTasas;
    }
    
    //gets and sets
    public int getCantidadTasas() {
        return CantidadTasas;
    }

    public void setCantidadTasas(int CantidadTasas) {
        this.CantidadTasas = CantidadTasas;
    }
    
    //metodos abstract
    @Override
    public String encender(){super.setEstado(true); return "Arrocera encendida..";}
    @Override
    public String apagar(){super.setEstado(false); return "Arrocera apagada..";}
    
    //metodos interface
    @Override
    public void Iniciar(int tiempo){
        System.out.println("Cocinando el arroz...");
        for (int i=0;i>-2;i+=2){
            System.out.print("*/");
            //if por si el bucle aumenta mas de la temp indicada
            if (tiempo<i){i=tiempo;}
            //if para cuando llegue al objetivo se detenga y llamar la funcion Alcanzado
            if (tiempo==i){Alcanzado(i);break;}
            //detener el programa medio segundo
            try{Thread.sleep(2000);}catch(Exception e){System.out.println("Tiempo de espera corrompido.."+e);}
        }
    }
    
    @Override
    public void Alcanzado(int tiempo){System.out.println("El arroz esta listo, a comer..");}
}
