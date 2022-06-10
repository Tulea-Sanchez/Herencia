/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismomichaelsanchez;

import Abstractas.ArticuloElectrico;
import Interfaces.*;

/**
 *
 * @author Tulea4ever
 */
public class Secadora extends ArticuloElectrico implements Girar,Calentar{
    private int temperaturaSecado;
    
    //constructor
    public Secadora(int temperaturaSecado, int voltaje, String color) {
        super(voltaje, color);
        this.temperaturaSecado = temperaturaSecado;
    }
    
    //gets and sets
    public int getTemperaturaSecado() {
        return temperaturaSecado;
    }

    public void setTemperaturaSecado(int temperaturaSecado) {
        this.temperaturaSecado = temperaturaSecado;
    }
    
    //metodos abstract
    @Override
    public String encender(){super.setEstado(true); return "Secadora encendida..";}
    @Override
    public String apagar(){super.setEstado(false); return "Secadora apagada..";}
    
    //metodos interface
    //interface calentar
    @Override
    public void Girar(int tiempo){
        //llamando funcion iniciar
        Iniciar(temperaturaSecado);
        //continuacion al finalizar funcion anterior
        System.out.print("Girando ");
        for (int i=0;i>-2;i++){
           //if para cuando llegue al objetivo se detenga
           if (tiempo==i){System.out.println(" --> finalizado ..");break;}
           System.out.print("*");
           //detener el programa medio segundo
           try{Thread.sleep(1000);}catch(Exception e){System.out.println("Tiempo de espera corrompido.."+e);}
        }
     }
     
    //interface girar
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
    public void Alcanzado(int tempMax){System.out.println("Temperatura alcanzada "+tempMax);}
  
}
