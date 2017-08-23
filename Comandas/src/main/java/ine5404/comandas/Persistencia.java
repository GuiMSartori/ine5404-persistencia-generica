package ine5404.comandas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author martin
 * @param <E>
 */
public class Persistencia<E> {

    public void serialiazar(E objeto, String arquivo) throws FileNotFoundException, IOException {
        FileOutputStream file = new FileOutputStream(arquivo);
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(objeto);
        out.close();
    }

    public E desserializar(String arquivo) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(arquivo);
        ObjectInputStream in = new ObjectInputStream(file);
        E object = (E) in.readObject();
        in.close();
        return object;
    }

}
