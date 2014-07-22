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

/**
 *
 * @author Digo Regalado
 */
public class Principal {
    public static void main(String[] args){
            Calculadora miCalculadora = new Calculadora("prueba");
            miCalculadora.separarGuardar();
            double resultado = miCalculadora.operar();
            System.out.println(resultado+"");
    }
}
