
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
    public void add(int elemento)
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
     * Añade un elemento a la coleccion en la posicion especificada
     */
    public void add(int index,int elemento)
    {
        int tamaño = lista.length;
        if(index <= lista.length && index >=0)//compruebo que el indice es valido
        {
            int indiceTemp = 0;
            int indiceLista = 0;
            int[] lista2 = new int[tamaño+1];
            while(indiceLista<tamaño)
            {
                if (indiceTemp == index)//
                {
                    lista2[indiceTemp]= elemento;
                }
                else{
                    lista2[indiceTemp] = lista[indiceLista];
                    indiceLista++;
                }
                indiceTemp++;
            }

            lista = lista2;
        }
    }

    /**
     *Vacia la coleccion 
     */
    public void clear()
    {
        lista = new int[0];//igualo la lista a 0 para resetearla

    }

    /**
     * devuelve true si la coleccion contiene ese elemento
     */
    public boolean contains(int elemento)
    {
        boolean enLaLista = false;//interruptor logico para devolver si hay ese elemento en la lista 
        int index = 0;
        while(index < lista.length && !(enLaLista))//
        {
            if(lista[index]==elemento)
            {
                enLaLista = true;
            }
            index++;

        }
        return enLaLista;

    }

    /**
     *  devuelve el elemento existente en la posición indicada. 
     *  Si el valor de index no es válido, entonces devuelve -1.
     */
    public int get(int index)
    {
        int num = 0;
        if(index >= 0 && index < lista.length )
        {
            num = lista[index];
        }
        else 
        {
            num = -1;
        }
        return num;

    }

    /**
     * reemplaza el elemento en la posicion index con el valor del elemento
     * si el idice no es valido , no hace nada
     */
    public void set(int index, int element)
    {

    }

    /**
     * reemplaza el elemento en la posición index con el valor de element. 
     * Si el índice no es válido, no hace nada.
     */
    public void set(int index,int element)
    {

    }

    /**
     * devuelve el indice en el que aparece la primera ocurrencia 
     * del elemento especificado o -1 en caso de que la colección no contenga el elemento especificado.
     */
    public int indexOf(int elemento)
    {

    }

    /**
     * Devuelve true si la lista no contiene elementos.
     */
    public boolean isEmpty()
    {
        boolean vacio = false;
        if(lista.length == 0)
        {
            vacio = true;
        }
        return vacio;
    }

    /**
     * elimina de la colección el elemento que ocupa la posición especificada y devuelve dicho elemento. 
     * Si el valor de index no es válido, no hace nada y devuelve -1.
     */
    public void remove(int index)
    {

    }

    /**
     * Devuelve el numero de elementos de la coleccion
     */
    public int size()
    {
        return lista.length;
    }
}
