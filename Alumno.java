
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
}
