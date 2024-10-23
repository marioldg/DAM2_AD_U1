package org.example.controlFicheros;

import java.io.*;

public class lecturaFicheros {
    private String ruta;

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public lecturaFicheros(String ruta) {
        this.ruta = ruta;
    }
    public String lecturaTxt(){
        String texto="";
        File f = new File(ruta);
        try {

            FileReader fr = new FileReader(f);

            BufferedReader br = new BufferedReader(fr);

            /*
            Recorrer todo el txt
            Indexar a String texto
            mandar por returm
             */
            String linea;

            // Recorrer todo el archivo línea por línea
            while ((linea = br.readLine()) != null) {
                texto=texto + linea + "\n"; // Agregar cada línea y un salto de línea
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return texto;
    }
}
