import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HashMap <String, String> diccionario= new HashMap<>();

        diccionario.put("Scope", "Alcance");
        diccionario.put("Keyword", "Palabra reservada");
        diccionario.put("Loop", "Bucle");
        diccionario.put("Array", "Arreglo");
        diccionario.put("Thread", "Hilo de ejecucion");
        diccionario.put("String", "Cadena de texto");
        diccionario.put("Boolean", "Booleano");
        diccionario.put("Method", "Metodo");
        diccionario.put("Inheritance", "Herencia");
        diccionario.put("Encapsulation", "Encapsulamiento");
        diccionario.put("Polymorphism", "Polimorfismo");
        diccionario.put("Constructor", "Constructor");
        diccionario.put("Interface", "Interfaz");
        diccionario.put("Package", "Paquete");
        diccionario.put("Exception", "Excepcion");
        diccionario.put("Null", "Nulo");
        diccionario.put("Object", "Objeto");
        diccionario.put("Class", "Clase");
        diccionario.put("Key", "Clave");
        diccionario.put("Value", "Valor");

        //Creamos una nueva lista para guardar las palabras en español
        List<String> listaEspanol = new ArrayList<>(diccionario.keySet());

        //se desordena la lista con el metodo shuffle
        Collections.shuffle(listaEspanol);

        // 3. Variables para el juego
        Scanner teclado = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;

        System.out.println("---Estas liston para la prueba de fuego del programador?---");


    }
}