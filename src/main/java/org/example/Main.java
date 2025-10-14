package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Leer el archivo con las claves
        LeerArchivo leer = new LeerArchivo();
        java.util.ArrayList<String> claves = leer.LeerArchivo();
        Runtime runtime = Runtime.getRuntime();
        
        System.out.println("Total de claves leídas: " + claves.size());
        System.out.println("Claves: " + claves);
        System.out.println();

        long inicio = System.nanoTime();
        long memoriaAntes = runtime.totalMemory() - runtime.freeMemory();
        BusquedaLineal busqueda = new BusquedaLineal();

        String claveBuscada = "reinaldo";
        String resultado = busqueda.busquedaLineal(claves, claveBuscada);
        long memoriaDespues = runtime.totalMemory() - runtime.freeMemory();
        long fin = System.nanoTime();
        
        System.out.println(resultado);

        long memoriaUsada = memoriaDespues - memoriaAntes;
        long duracion = fin - inicio;
        System.out.println("Tiempo de ejecución para encontrar el camino: " + duracion / 1_000_000 + " ms");
        System.out.println("Memoria usada aproximada: " + (memoriaUsada / (1024.0 * 1024.0)) + " MB");

        System.out.println("\nPresiona Enter para salir...");
        System.in.read(); // Espera una tecla antes de terminar el programa
    }
}