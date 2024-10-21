import javax.swing.*;

public class Materia {
    // Declaración de atributos
    private String nombre;
    private String NRC;
    private int creditos;
    private String docente;

    // Creación de constructores.
    public Materia(){

    }

    public Materia(String nombre) {
        this.nombre = nombre;
    }

    public Materia(String nombre, String NRC) {
        this(nombre);
        this.NRC = NRC;
    }

    public Materia(String nombre, String NRC, int creditos) {
        this(nombre, NRC);
        this.creditos = creditos;
    }

    public Materia(String nombre, String NRC, int creditos, String docente) {
        this(nombre, NRC, creditos);
        this.docente = docente;
    }

    // Creación de getters y setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNRC() {
        return NRC;
    }

    public void setNRC(String NRC) {
        this.NRC = NRC;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    //Métodos Propios

    // Creación de metodo para ingresar la información de la materia.
    public void leerInfoM(){
        setNombre(JOptionPane.showInputDialog(null,"Ingrese el nombre de la materia:"));
        setNRC(JOptionPane.showInputDialog(null,"Ingrese el NRC de la materia:"));
        setCreditos(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los creditos de la materia:")));
        setDocente(JOptionPane.showInputDialog(null,"Ingrese el nombre del docente de la materia:"));
    }

    public String verDetalleM(){
        String vdm = "Materia: " + getNombre() /*this.marca*/ + "\n" +
                "NRC: " + getNRC() + "\n" +
                "Creditos: " + getCreditos() + "\n" +
                "Docente: " + getDocente();
        return vdm;
    }

}