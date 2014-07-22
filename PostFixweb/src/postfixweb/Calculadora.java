/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package postfixweb;

/**
 *
 * @author Digo Regalado
 */
public class Calculadora {
    //ATRIBUTOS
    private Archivo miArchivo;
    private StackVector miPila;
    private String postfix;

    //Inicializa el archivo y la pila
    public Calculadora(String nombreArchivo){
            miArchivo = new Archivo(nombreArchivo);
            miPila = new StackVector<String>();
            postfix = miArchivo.leerArchivo();
    }

    //Divide y guarda los elementos del postfix en la pila
    public void separarGuardar(){
            String[] elementos = postfix.split("\\s+");
            int i = elementos.length - 1;
            while(i>=0){
                    miPila.push(elementos[i]);
                    i--;
            }
    }

    //Opera el postfix, se repite hasta no encontrar mas operadores
    public double operar(){
            double a,b, resultado = 0;
            String operacion;
            while(miPila.size()>2){
                    a = Double.parseDouble(miPila.pop()+"");
                    b = Double.parseDouble(miPila.pop()+"");
                    operacion = miPila.pop()+"";
                    if(operacion.equals("+")){
                            resultado = a + b;
                            miPila.push(resultado+"");
                    }
                    if(operacion.equals("-")){
                            resultado = a - b;
                            miPila.push(resultado+"");
                    }
                    if(operacion.equals("*")){
                            resultado = a * b;
                            miPila.push(resultado+"");
                    }
                    if(operacion.equals("/")){
                            resultado = a / b;
                            miPila.push(resultado+"");
                    }
            }
            return resultado;
    }
}
