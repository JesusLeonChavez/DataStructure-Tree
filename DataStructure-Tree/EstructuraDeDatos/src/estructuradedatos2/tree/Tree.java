
package estructuradedatos2.tree;

import java.util.Iterator;


public interface Tree<E> {
    
    //Metodos basicos
    public int size(); //devuelve el tamaño
    public boolean isEmpty(); //devuelve si esta vacio
    Iterator iterator(); //devolvemos un iterador con todos sus elementos
    Iterable positions(); //devolvemos una collection de todos sus nodos
    
    //Metodos de acceso
    Position<E> root();//devolvemos la raiz del arbol
    Position<E> parent(Position<E> p);//devuelve el padre del nodo
    Iterable children(Position<E> p);//devuelve una lista con todos sus nodos hijo de un nodo
    
    //Metodos de consulta
    public boolean isLeaf(Position<E> p); //preguntamos si el nodo es hoja o no        
    public boolean isInternal(Position<E> p); //preguntamos si un nodo es interno o no
    public boolean isRoot(Position<E> p); //preguntamos si este nodo es raiz o no
    
    //Metodos de actualizacion
    E replace(Position<E> P, E elemento); //reemplaza el elemento del nodo p por el elmento e
}
