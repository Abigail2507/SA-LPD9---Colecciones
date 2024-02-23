/* Crear un diccionario Español-Inglés, que contenga al menos 20 palabras (con traducción).
Utiliza un objeto HashMap para almacenar los pares de palabras.
Debe solicitar al usuario una palabra en español e imprimir por consola la palabra en inglés.
Si la palabra escrita no se encuentra en el diccionario debe imprimir un mensaje por consola, diciendo que: “La palabra no se encuentra en el diccionario.”.
Prueba tu programa con las siguientes entradas para asegurarte que funcione correctamente:
gato
cat
Entradas: 
Salida:
Siempre y cuando la palabra se encuentre en el diccionario */

import java.util.HashMap;
import java.util.Scanner;

public class SALPD9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear el diccionario
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("mujer", "woman");
        diccionario.put("desarrolladora", "develop");
        diccionario.put("tarea", "task");
        diccionario.put("tambien", "also");
        diccionario.put("incluso", "even");
        diccionario.put("obtener", "get");
        diccionario.put("colocar", "set");
        diccionario.put("Base de datos", "Database");
        diccionario.put("desventaja", "drawback");
        diccionario.put("entorno", "environment");
        diccionario.put("mantener", "maintain");
        diccionario.put("reiniciar", "reboot");
        diccionario.put("resolver", "solve");
        diccionario.put("integer", "entero");
        diccionario.put("cadena", "string");
        diccionario.put("bucle", "loop");
        diccionario.put("pie de pagina", "footer");
        diccionario.put("poner", "append");
        diccionario.put("si", "if");
        diccionario.put("ademas", "else");

        System.out.println("Introduzca una palabra en español: ");
        String palabraEspanol = scanner.nextLine();

        String palabraIngles = diccionario.get(palabraEspanol);

        if (palabraIngles != null) {
            System.out.println("La traducción en inglés es: " + palabraIngles);
        } else {
            System.out.println("La palabra no se encuentra en el diccionario.");
        }
        scanner.close();
    }
}
