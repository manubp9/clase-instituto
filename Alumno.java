
/**
 * Write a description of class Alumno here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alumno
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private int inicialVal = 1;
    private int numClase;
    private ArrayListInt notas;

    /**
     * Constructor for objects of class Alumno
     */
    public Alumno(String nombre,int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
        numClase = inicialVal;
        inicialVal++;
       notas = new ArrayListInt();
    }

    /**
     *permita introducir una nota entera del alumno. 
     *Este método se peude invocar tantas veces como deseemos.
     */
    public void enterGrade(int grade)
    {
        notas.add(grade);
    }
    /**
     * Un método que permita conocer la nota media (en decimal) del alumno en este momento.
     */
    public float notaMedia()
    {
        float suma = 0;
        for(int i = 0;i<notas.size();i++)
        {
            suma = suma + notas.get(i);
        }
        return suma/(float)notas.size();
    }
    /**
     * Un método que indique si el alumno esta aprobado o no en función de su nota media actual.
     */
    public boolean estado()
    {
        return notaMedia()>=5;
    }
    /**
     * Un método que muestre todos los datos del alumno: 
     * nombe, edad, numero de clase, notas, nota media y si esta o no aprobado.
     */
    public void verDatos()
    {
        System.out.println("Nombre "+nombre+"\n"+"Edad "+edad+"\n"+"Numero de clase "+numClase);
        for(int i =0;i <notas.size();i++)
        {
            System.out.println("Calificacion "+notas.get(i));
        }
        System.out.println("Nota media "+notaMedia()+"\n"+"Aprobado/Suspenso "+estado());
    }
}
