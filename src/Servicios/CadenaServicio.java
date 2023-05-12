/*
Crear una clase CadenaServicio en el
paquete servicios que implemente los siguientes métodos:

a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
que tiene la frase ingresada.

b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalb
asac".

c) Método vecesRepetido(String letra), recibirá un carácter ingresado
por el usuario y contabilizar cuántas veces se repite el carácter en la
frase, por ejemplo:

d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4
veces.

e) Método compararLongitud(String frase), deberá comparar la longitud
de la frase que compone la clase con otra nueva frase ingresada por
el usuario.

f) Método unirFrases(String frase), deberá unir la frase contenida en la
clase Cadena con una nueva frase ingresada por el usuario y mostrar
la frase resultante.

g) Método reemplazar(String letra), deberá reemplazar todas las letras
“a” que se encuentren en la frase, por algún otro carácter
seleccionado por el usuario y mostrar la frase resultante.

h) Método contiene(String letra), deberá comprobar si la frase contiene
una letra que ingresa el usuario y devuelve verdadero si la contiene y
falso si no.
 */
package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    Scanner lector = new Scanner(System.in).useDelimiter("\n");

    public Cadena cadena() {

        System.out.println("Ingrese la frase a analizar");
        String frase = lector.nextLine();

        return new Cadena(frase);

    }

    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales
    //que tiene la frase ingresada.
    public void mostrarVocales(Cadena cadena) {

        int contador = 0;

        for (int i = 0; i < cadena.getLongitud(); i++) {

            char c = cadena.getFrase().toLowerCase().charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') { //string con comillas dobles || char con comillas simples

                contador++;

            }
        }
        System.out.println("Su frase tiene " + contador + " vocales.");
    }

    //-----------------------------------------------------------------------------------------------------------------------------------
    /*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla
    por pantalla. Por ejemplo: Entrada: "casa blanca", Salida: "acnalbasac".
     */
    public void invertirFrase(Cadena cadena) {

        for (int i = cadena.getLongitud() - 1; i >= 0; i--) {

            char c = cadena.getFrase().toLowerCase().charAt(i);

            System.out.print(c);

        }

        System.out.println("");

    }

//c) Método vecesRepetido(String letra), recibirá un carácter ingresado
//por el usuario y contabilizar cuántas veces se repite el carácter en la
//frase, por ejemplo:
    
    public void vecesRepetido(Cadena cadena) {
        
        int contador=0;
        
        System.out.println("Que caracter quiere buscar?");
        char c = lector.next().charAt(0);
        System.out.println("");
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            char d = cadena.getFrase().toLowerCase().charAt(i);
            
            if (c==d) {
                
                contador++;
                
            }
        }
        
        System.out.println("Su letra "+ c + " se repite " + contador + " veces.");
    
    }
    
    /*
    d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    
    REPETIDO
    */
    
    
    /*
    e) Método compararLongitud(String frase), deberá comparar la longitud
    de la frase que compone la clase con otra nueva frase ingresada por
    el usuario.
    */
    
    public void compararLongitud(Cadena cadena){
        
        System.out.println("Ingrese una nueva frase para comparar su longitud con la frase primera");
        String nuevaFrase = lector.next();
        
        if (cadena.getFrase().length() == nuevaFrase.length()){
            
            System.out.println("La longitud de las frases es igual");
        
        } else {
            
            System.out.println("Las longitudes de las frases son distintas.");
        }
    
    }
    

    //f) Método unirFrases(String frase), deberá unir la frase contenida en la
    //clase Cadena con una nueva frase ingresada por el usuario y mostrar
    //la frase resultante.
    
    public void unirFrases(Cadena cadena) {
    
        System.out.println("Ingrese otra nueva frase para agregar a la principal:");
        String otraFrase = lector.nextLine();
        
        String fraseUnida = cadena.getFrase().concat(" " + otraFrase);
        
        System.out.println(fraseUnida);
    }
    
//    g) Método reemplazar(String letra), deberá reemplazar todas las letras
//    “a” que se encuentren en la frase, por algún otro carácter
//    seleccionado por el usuario y mostrar la frase resultante.
    
    public void reemplazar(Cadena cadena) {
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            char d = cadena.getFrase().toLowerCase().charAt(i);
            
           
            
            if (d =='a') {
                
                d = '@'; //para caracteres es con COMILLAS SIMPLES
                
            }
            
            System.out.print(d);
        }
    }

    
    //h) Método contiene(String letra), deberá comprobar si la frase contiene
    //una letra que ingresa el usuario y devuelve verdadero si la contiene y
    //falso si no.
    
    public boolean contiene(Cadena cadena){
        
        boolean verdad = false;
        
        System.out.println("Ingrese una letra para saber si esta");
        char letraBuscada = lector.next().charAt(0);
        
        for (int i = 0; i < cadena.getLongitud(); i++) {
            
            char letraFrase = cadena.getFrase().charAt(i);
            
            if (letraBuscada == letraFrase) {
                verdad = true;
                break;
            }
        }
        System.out.println("El resultado al final fue: " + verdad);
        return verdad;
    }
}
