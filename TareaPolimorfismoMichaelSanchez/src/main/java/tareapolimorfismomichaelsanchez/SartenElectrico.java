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
public class SartenElectrico extends ArticuloElectrico implements Calentar{
    private String tamaño;
    
    //constructor
    public SartenElectrico(String tamaño, int voltaje, String color) {
        super(voltaje, color);
        this.tamaño = tamaño;
    }
    
    //gets and sets
    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    //metodos abstract
    @Override
    public String encender(){super.setEstado(true); return "SartenElectrico encendido..";}
    @Override
    public String apagar(){super.setEstado(false); return "SartenElectrico apagado..";}
    
    //metodos interface
    @Override
    public void Iniciar(int temp){
        for (int i=0;i>-2;i+=20){
            //if por si el bucle aumenta mas de la temp indicada
            if (temp<i){i=temp;}
            //if para cuando llegue al objetivo se detenga y llamar la funcion Alcanzado
            if (temp==i){Alcanzado(i);break;}
            System.out.println("Calentando temperatura actual: "+i+" grados.");
            //detener el programa medio segundo
            try{Thread.sleep(500);}catch(Exception e){System.out.println("Tiempo de espera corrompido.."+e);}
        }
    }
    @Override
    public void Alcanzado(int tempMax){System.out.println("Temperatura alcanzada "+tempMax+", ya puede cocinar..");}
    
}
