
package mx.itson.carrito.entidades;

// @author Andrey

public class Sonido 
{

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the precio
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    /**
     * @return the musica
     */
    public String getMusica() {
        return musica;
    }

    /**
     * @param musica the musica to set
     */
    public void setMusica(String musica) {
        this.musica = musica;
    }

    /**
     * @return the tamanio
     */
    public String getTamanio() {
        return tamanio;
    }

    /**
     * @param tamanio the tamanio to set
     */
    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }
    
    private String marca;
    private float precio;
    private String musica;
    private String tamanio;
    
}
