import java.util.Scanner;
import java.util.HashMap;

public class ModificarPrecio {

    public static void modificaPrecio(String codigo, HashMap<String,Float> listaProductos){
        Scanner sc = new Scanner(System.in);
        if (listaProductos.containsKey(codigo)) {
            System.out.println("Introduce el precio del producto:");
            listaProductos.put(codigo, sc.nextFloat());
        } else {
            System.out.println("No hay ningun producto con ese código.");
        }
    }
}
