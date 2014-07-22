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
public interface Stack<E> {
    public void push(E item);
   // pre: 
   // post: item is added to stack
   // will be popped next if no intervening push
   
   public E pop();
   // pre: stack is not empty
   // post: most recently pushed item is removed and returned
   
   public E peek();
   // pre: stack is not empty
   // post: top value (next to be popped) is returned
   
   public boolean empty();
   // post: returns true if and only if the stack is empty
   
   public int size();
   // post: returns the number of elements in the stack
}
