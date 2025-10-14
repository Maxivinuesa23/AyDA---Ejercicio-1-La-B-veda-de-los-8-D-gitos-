package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeerArchivo {
    FileReader lector = new FileReader("clavesb.txt");
    BufferedReader br = new BufferedReader(lector);

    ArrayList <String> claves = new ArrayList<>();
    String linea;

    public LeerArchivo() throws FileNotFoundException {
    }

    public ArrayList<String> LeerArchivo() throws IOException {
        while ((linea = br.readLine()) != null){
            String valorDado = linea;
            claves.add(valorDado);
        }
        return claves;
    }
}
