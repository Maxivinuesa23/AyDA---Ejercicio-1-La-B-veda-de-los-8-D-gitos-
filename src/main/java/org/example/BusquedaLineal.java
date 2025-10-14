package org.example;

import java.util.ArrayList;

public class BusquedaLineal {
    public String busquedaLineal(ArrayList<String> claves, String claveBuscada) {
        int nComparaciones = 0;
        for (int i = 0; i < claves.size(); i++) {
            String claveActual = claves.get(i);
            nComparaciones ++;
            // Verificar si la cadena actual contiene la clave buscada como subcadena
            if (claveActual.contains(claveBuscada)) {
                return "Clave '" + claveBuscada + "' encontrada en la posicion " + i + " (cadena completa: " + claveActual + "\n Numero de comparaciones: " + nComparaciones +")";
            }
        }
        return "Clave '" + claveBuscada + "' no encontrada";
    }
}
