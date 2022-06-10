/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismomichaelsanchez;

import Abstractas.ArticuloElectrico;
import Interfaces.Macros;
import java.io.IOException;

/**
 *
 * @author Tulea4ever
 */
public class Computadora extends ArticuloElectrico implements Macros{
    private String procesador;
    private int ram;
    private String marca;
    
    //constructor
    public Computadora(String procesador, int ram, String marca, int voltaje, String color) {
        super(voltaje, color);
        this.procesador = procesador;
        this.ram = ram;
        this.marca = marca;
    }
    
    //gets and sets
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    //metodos abstract
    @Override
    public String encender(){super.setEstado(true); return "Computadora encendida..";}
    @Override
    public String apagar(){super.setEstado(false); return "Computadora apagada..";}
    
    //metodos interface macros
    @Override
    public void SubirVolumen(){EjecutarCMD("whoami");}
    @Override
    public void BajarVolumen(){EjecutarCMD("setvol -25");}
    @Override
    public void SubirBrillo(){System.out.println("Brillo aumentado 25%");}
    @Override
    public void BajarBrillo(){System.out.println("Brillo disminuido 25%");}
    
    //metodo para comandos atravez de cmd -- usar bajo su responsabilidad
    public void EjecutarCMD(String command){
        String comando = String.format("cmd /c start cmd.exe /K \" %S", command);
        try {
            //Ejecucion de comandos windows
            Runtime.getRuntime().exec(comando);
            }catch (IOException e) {}
        try {
            //Ejecucion de comandos linux
            comando = String.format("\"/bin/bash\",\"-c\",\" | %s", command);
            Runtime.getRuntime().exec(comando);
            }catch (IOException e) {}
        
        }
}
