
/**
 * Write a description of class ArrayListInt here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArrayListInt
{
    // Atributo que crea una lista de tipo int
    private int[] lista;

    /**
     * Constructor for objects of class ArrayListInt
     */
    public ArrayListInt()
    {
        lista = new int[0];//iniia la lista con 0 espacios para no desperdiciar espacio sin usar
    }

    /**
     *Añade un elemento a la coleccion al final de la misma
     */
    public void addElemento(int elemento)
    {
        int tamaño = lista.length;//variable local que representa el tamaño de la lista
        int[] lista2 = new int[tamaño+1];//crea una V L  arraylist lista2 que equivale al tamaño 
                                       //actual de la lista mas uno(el elemento que añadimos)
        for(int num = 0;num < tamaño;num++)
        {
            lista2[num] = lista[num];
        }
        lista2[tamaño]= elemento;
        lista = lista2;

    }

   
    /**
     * Devuelve el numero de elementos de la coleccion
     */
    public int size()
    {
        return lista.length;
    }
}
