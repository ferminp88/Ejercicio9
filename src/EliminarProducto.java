import java.util.HashMap;


public class EliminarProducto {

    public static void eliminaProducto(String codigo, HashMap<String,Float> listaProductos) {
        if (listaProductos.containsKey(codigo)) {
            listaProductos.remove(codigo);
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }
}
