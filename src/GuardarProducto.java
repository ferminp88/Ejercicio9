
import java.util.HashMap;
public class GuardarProducto {
    public static void guardarProducto(String codigo, float precio, HashMap <String,Float> listaProductos){
        if (listaProductos.containsKey(codigo)) {
            System.out.println("No se puede introducir el producto. El código esta repetido.");
        } else {
            listaProductos.put(codigo, precio);
        }
    }

}
