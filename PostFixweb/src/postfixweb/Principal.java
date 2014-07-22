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
