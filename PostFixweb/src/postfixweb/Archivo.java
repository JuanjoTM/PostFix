/*Universidad del Valle de Guatemala
  Algoritmos y Estructura de Datos
  Autores:
  Juan Jose Tzun 	Carnet: 13017
  Carlos Cordero	Carnet: 13152
  Luis Tello		Carnet: 13161
  Fecha: 21/07/2014
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postfixweb;
import java.io.*;
/**
 *
 * @author Digo Regalado
 */
public class Archivo {
    //ATRIBUTOS
    private File archivo;
    private BufferedReader br;
    private FileReader fr;

    //Constructor
    public Archivo(String nombre){
            archivo = new File(nombre+".txt");
            if(!archivo.exists()){
                    System.out.print("No existe el archivo");
            }
            else{
                    try{
                            fr = new FileReader(archivo);
                            br = new BufferedReader(fr);
                    }catch (Exception e){
                            System.out.println(e.getMessage());
                    }
            }

    }

    //Metodo que permite leer el contenido del archivo de texto
    public String leerArchivo(){
            String contenido = new String("");
            try{
                    String Slinea;
                    while((Slinea=br.readLine())!=null){
                            contenido = Slinea;
                    }
                    fr.close();
            }catch (Exception e){
                    System.out.println(e.getMessage());
            }

            return contenido;
    }
}
