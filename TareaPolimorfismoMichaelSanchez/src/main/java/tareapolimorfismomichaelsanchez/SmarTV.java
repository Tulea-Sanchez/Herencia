/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismomichaelsanchez;
import Abstractas.ArticuloElectrico;
import Interfaces.Macros;

/**
 *
 * @author Tulea4ever
 */
public class SmarTV extends ArticuloElectrico implements Macros{
    private int pulgadas;
    private String marca;
    
    //constructor
    public SmarTV(int pulgadas, String marca, int voltaje, String color) {
        super(voltaje, color);
        this.pulgadas = pulgadas;
        this.marca = marca;
    }
    
    //gets and sets
    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    //metodos abstract
    @Override
    public String encender(){super.setEstado(true); return "TV encendida..";}
    @Override
    public String apagar(){super.setEstado(false); return "TV apagada..";}
    
    //metodos interface macros
    @Override
    public void SubirVolumen(){System.out.println("Volumen aumentado 25%");}
    @Override
    public void BajarVolumen(){System.out.println("Volumen disminuido 25%");}
    @Override
    public void SubirBrillo(){System.out.println("Brillo aumentado 25%");}
    @Override
    public void BajarBrillo(){System.out.println("Brillo disminuido 25%");}
    

}
