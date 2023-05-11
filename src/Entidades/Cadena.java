/*
Realizar una clase llamada Cadena, en el paquete de entidades, que
tenga como atributos una frase (String) y su longitud. Agregar
constructor vacío y con atributo frase solamente. Agregar getters y
setters. 

El constructor con frase como atributo debe setear la longitud
de la frase de manera automática. 
 */
package Entidades;

public class Cadena {

    //atributos
    private String frase;
    private int longitud;

    //constructores
    public Cadena() {
    }

    public Cadena(String frase) {

        this.frase = frase;
        this.longitud = frase.length();
        
    }
    
    //GETTER & SETTER
    public void setFrase(String frase){
        
        this.frase = frase;
        
    }

    public String getFrase(){
        
        return frase;
        
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
}
