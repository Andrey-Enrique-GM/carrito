
package mx.itson.carrito.ui;

// @author Andrey

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTransmision;


public class Main 
{
    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa la distancia recorrida:");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro:");
        double velocidad = sc.nextDouble();
        
        // Generamos una instancia de la clase Carro
        Carro tsuru = new Carro();
        tsuru.setMarca ("Tsuru");
        tsuru.setColor("Rojo");
        tsuru.setAnio(2008);
        tsuru.setKilometraje(10000);
        tsuru.setTipoMotor(TipoMotor.COMBUSTIÓN);
        tsuru.setTipoTransmision (TipoTransmision.AUTOMÁTICO);
        
        // Invocamos al metodo contenido en la clase Carro
        double tiempo = tsuru.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomara al carro "
                + tsuru.getMarca()
                + " del año " + tsuru.getAnio()
                + " de color " + tsuru.getColor()
                + " sera " + tiempo
                + " y ahora su kilometraje es de " + tsuru.getKilometraje());
        
    }
    
}
