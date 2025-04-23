package Controllers;
import Models.*;
import Views.ViewConsole;
public class LibroController {
        
    ViewConsole view = new ViewConsole();

    public void sortByName(Book[] libros) {
        view.showMessage("Lista Ordenada por Metodo Insercion");
        int n = libros.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMayor = i;
            for (int j = i + 1; j < n; j++) {
                if (libros[j].getName().toLowerCase().compareTo(libros[indiceMayor].getName().toLowerCase()) > 0) {
                    indiceMayor = j;                                                    
                }
            }
            if (i != indiceMayor) {
                Book temp = libros[i];
                libros[i] = libros[indiceMayor];
                libros[indiceMayor] = temp;
            }
        }

    }
    

    public Book searchByName(Book[] libros, String name) {
        String nombreBuscado = name.toLowerCase();
        int inicio = 0, fin = libros.length - 1;
    
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            String nombreActual = libros[medio].getName().toLowerCase();
            int comparacion = nombreActual.compareTo(nombreBuscado);
    
            if (comparacion == 0) {
                return libros[medio];
            } else if (comparacion < 0) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return null;
    }


}
