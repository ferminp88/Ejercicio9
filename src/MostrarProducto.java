import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MostrarProducto {

    public static void mostrarProductos2(HashMap<String, Float> listaProductos) {
        Iterator iterador = listaProductos.entrySet().iterator();
        Map.Entry producto;
        while (iterador.hasNext()) {
            producto = (Map.Entry) iterador.next();

            System.out.println(producto.getKey() + " - " + producto.getValue());
        }
    }
}
