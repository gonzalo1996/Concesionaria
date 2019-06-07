package Utils;

import Model.ControladoraUsuario;

import java.io.*;

/**
 * Clase que se encarga de leer o escribir objetos en un archivo en forma de bytes, implementando la interfaz serializable.
 */
public class IOArchivoGenerico {

    /**
     * Escribe un objeto en un archivo.
     * @param file dirección del archivo contenedor.
     * @param <T> objeto que implementa la interfaz serializable.
     */
    public static <T extends Serializable> void escribirObjeto(T t, String file) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {

            out.writeObject(t);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Lee un archivo.
     * @param file dirección del archivo contenedor.
     * @return devuelve un objeto T de lo que se guardó en el archivo.
     */
    @SuppressWarnings("unchecked")
    public static <T extends Serializable> T leerObjeto(String file) {

        T t = null;

        try (ObjectInputStream in = new ObjectInputStream( new FileInputStream(file) )) {

            t = (T) in.readObject();

        } catch (IOException | ClassNotFoundException e) {
            ControladoraUsuario.mostrar_error("No existe objeto Correspondiente");
        }
        return t;
    }
}