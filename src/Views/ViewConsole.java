package Views;
import Models.*;
import Controllers.*;

public class ViewConsole {
    
    public void mostrarArreglo(Book[] libros){
        System.out.println("Lista original: ");
        for (Book b: libros){
            System.out.println(b);
        }
    }

    public void mostrarBusqueda(Book[] libros, String libroABuscar){
        showMessage("\nMetodo de Busqueda");
        showMessage("Libro a buscar: " + libroABuscar);
        LibroController bookC = new LibroController();
        Book buscar = bookC.searchByName(libros, libroABuscar);
        if (buscar != null){
            showMessage("Su libro es: "+buscar.getName());
            System.out.println(buscar);
            System.out.println(" ");
        } else{
            showMessage("Libro no encontrado :(");
        }
    }

    public void showMessage (String message){
        System.out.println(message);
    }
}
