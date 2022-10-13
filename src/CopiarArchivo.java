

import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.File;

public class CopiarArchivo {
      public boolean copyFile(String fromFile, String toFile) {
            File origin = new File(fromFile);
            File destination = new File(toFile);

            if (origin.exists()) {
                try {
                    InputStream in = new FileInputStream(origin);
                    OutputStream out = new FileOutputStream(destination);

                    byte[] dato = new byte[1024];
                    int tam;

                    while ((tam = in.read(dato)) > 0) {
                        out.write(dato, 0, tam);
                    }
                    in.close();
                    out.close();
                    return true;
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                    return false;
                }
            } else {
                return false;
            }
        }
    }

