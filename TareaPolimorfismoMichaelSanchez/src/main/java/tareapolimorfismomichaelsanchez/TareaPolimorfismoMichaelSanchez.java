/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package tareapolimorfismomichaelsanchez;

/**
 *
 * @author Tulea4ever
 */
public class TareaPolimorfismoMichaelSanchez {

    public static void main(String[] args) {
        
        Cocina cocina = new Cocina(4,110,"Gris");
        
            System.out.println(cocina.encender());
            cocina.Iniciar(350);
        
        SartenElectrico sarten = new SartenElectrico("Grande",110,"Negro");
        
            System.out.println(sarten.encender());
            sarten.Iniciar(80);
        
        Arrocera arrocera = new Arrocera(20,110,"Gris");
        
            arrocera.Iniciar(20);
        
        Lavadora lavadora = new Lavadora(16,220,"Gris");
        
            System.out.println(lavadora.encender());
            lavadora.Girar(3);
        
        Secadora secadora = new Secadora(80,220,"Blanca");
        
            System.out.println(secadora.encender());
            secadora.Girar(20);
        
        SmarTV tv = new SmarTV(55,"LG",110,"Negro");
        
            System.out.println(tv.encender());
            tv.SubirVolumen();
        
        Computadora compu = new Computadora("Ryzen",32,"hack4you",110,"blanca");
        
            System.out.println(compu.encender());
            compu.BajarBrillo();
    }
}
