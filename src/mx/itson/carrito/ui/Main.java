
package mx.itson.carrito.ui;

// @author Andrey

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;
import mx.itson.carrito.entidades.Propietario;
import mx.itson.carrito.entidades.Sonido;
import mx.itson.carrito.enums.TipoMotor;
import mx.itson.carrito.enums.TipoTransmision;


public class Main 
{
    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresa la distancia recorrida en metros:");
        double distancia = sc.nextDouble();
        
        System.out.println("Ingresa la velocidad a la que viaja el carro en kilometros por hora:");
        double velocidad = sc.nextDouble();
        
        // Generamos una instancia de la clase Carro
        Carro tsuru = new Carro();
        tsuru.setMarca ("Tsuru");
        tsuru.setColor("Rojo");
        tsuru.setAnio(2008);
        tsuru.setKilometraje(10000);
        tsuru.setTipoMotor(TipoMotor.COMBUSTIÓN);
        tsuru.setTipoTransmision (TipoTransmision.AUTOMÁTICO);
        
        Propietario p = new Propietario();          // Creamos al propietario
        p.setNombre("Chapo Chihuahua");
        p.setDomicilio("Calle 26, colonia libertad");
        p.setTelefono("6221659354");
        p.setEmail("chapo_inzano777@gmail.com");
        tsuru.setPropietario(p);
        
        Sonido s = new Sonido();                    // Creamos el equipo de sonido
        s.setMarca("Bose");
        s.setPrecio(246f);
        s.setTamanio("6x9 pulgadas");
        s.setMusica("POP IN 2");
        tsuru.setSonido(s);
        
        // Invocamos al metodo contenido en la clase Carro
        double tiempo = tsuru.calcularTiempo(distancia, velocidad);
        
        System.out.println("El tiempo que le tomara al carro "
                + tsuru.getMarca()
                + " del anio " + tsuru.getAnio()
                + " de color " + tsuru.getColor()
                + " sera " + tiempo
                + " y ahora su kilometraje es de " + tsuru.getKilometraje()
                + ". El propietario de este auto es " + tsuru.getPropietario().getNombre()
                + " y esta escuchando " + tsuru.getSonido().getMusica() + " a todo volumen!");
        
    }
    
}
