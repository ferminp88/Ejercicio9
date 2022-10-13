

/**
 *Simula software de supermercado,varios metodos(ingresar , mostrar, guardar, borrar ,copiar)
 *Guarda los productos en un HashMap.
 *ArrayList con Keys de los productos.
 *Genera archivo .txt y copia en otra carpeta(tipo backup)
 *
 *
 *
 *
 * **/

import java.io.IOException;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collection;
import java.io.FileWriter;
import java.util.InputMismatchException;
public class Main {


    public static void main(String[] args) throws IOException {


        HashMap<String,Float> listaProductos = new HashMap<String,Float>();
        Scanner sc = new Scanner(System.in);
        int opcionElegida = 0;
        float precio;
        int codigo;



        boolean closed = false;


             while (opcionElegida != 5){
            System.out.println(" Introduce el numero de la opción que quieras:");
            System.out.println("1.- Introducir producto");
            System.out.println("2.- Modificar precio");
            System.out.println("3.- Mostrar todos los productos");
            System.out.println("4.- Eliminar producto");
            System.out.println("5.- Salir");

            opcionElegida = sc.nextInt();
        switch (opcionElegida) {
                    case 1 -> {
                        System.out.println("Introduce el códido del producto:");
                        codigo = sc.nextInt();
                        System.out.println("Introduce el precio del producto:");
                        precio = sc.nextFloat();
                        GuardarProducto.guardarProducto(String.valueOf(codigo), precio, listaProductos);

                    }

                    case 2 -> {
                        System.out.println("Introduce el códido del producto del que quieres cambiar el precio:");
                        codigo = sc.nextInt();
                        ModificarPrecio.modificaPrecio(String.valueOf(codigo), listaProductos);
                    }
                    case 3 -> {
                        System.out.println("El producto es : ");
                        MostrarProducto.mostrarProductos2(listaProductos);
                    }
                    case 4 -> {
                        System.out.println("Introduce el códido del producto que quieres eliminar:");
                        codigo = sc.nextInt();
                        EliminarProducto.eliminaProducto(String.valueOf(codigo), listaProductos);
                    }

                    case 5 -> closed = true;

                    default -> System.out.println("Tienes que introducir una opción valida");

                }


            }


        Set <String> keySet = listaProductos.keySet();
        ArrayList<String> listOfKeys = new ArrayList<String>(keySet);

        Collection<Float> values = listaProductos.values();
        ArrayList<Float> listOfValues = new ArrayList<Float>(values);


        System.out.println("The Keys of the Map are "
                + listOfKeys);

        System.out.println("The Values of the Map are "
                + listOfValues);


        FileWriter writer = new FileWriter("src/hola1.txt");
        for(String str: listOfKeys) {
            writer.write("Las keys generadas son las siguientes:");
            writer.write(str + System.lineSeparator());
        }
        writer.close();



        CopiarArchivo copiar = new CopiarArchivo();
        String fromFile = "src/hola1.txt";
        String toFile = "src/prueba/hola1.txt";
        boolean result = copiar.copyFile(fromFile, toFile);
        System.out.println(result?
                "(El fichero se copio correctamente)":
                "(Error! No se ha podido copiar el fichero)");
    }
}



