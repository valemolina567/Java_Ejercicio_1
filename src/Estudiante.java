import javax.swing.*;
import java.util.Scanner;

public class Estudiante {
    // Declaración de atributos.
    private String nombre;
    private String apellido;
    private String carrera;
    private String semestre;
    private String banner;

    Scanner sc = new Scanner(System.in);

    // Constructores.
    public Estudiante(){

    }

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, String apellido) {
        this(nombre);
        this.apellido = apellido;
    }

    public Estudiante(String nombre, String apellido, String carrera) {
        this(nombre,apellido);
        this.carrera = carrera;
    }

    public Estudiante(String nombre, String apellido, String carrera, String semestre) {
        this(nombre, apellido, carrera);
        this.semestre = semestre;
    }

    public Estudiante(String nombre, String apellido, String carrera, String semestre, String banner) {
        this(nombre,apellido,carrera,semestre);
        this.banner = banner;
    }

    // Getters & setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    // Métodos propios

    public void leerInfoE(){

        setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre:"));
        setApellido(JOptionPane.showInputDialog(null, "Ingrese el apellido:"));
        setCarrera(JOptionPane.showInputDialog(null, "Ingrese la carrera:"));
        setSemestre(JOptionPane.showInputDialog(null, "Ingrese el semestre:"));
        setBanner(JOptionPane.showInputDialog(null, "Ingrese el ID Banner:"));
    }

    public String verDetalleE(){
        String vde = "Nombre: " + getNombre() /*this.marca*/ + "\n" +
                "Apellido: " + getApellido() + "\n" +
                "Carrera: " + getCarrera() + "\n" +
                "Semestre: " + getSemestre() + "\n" +
                "ID Banner: " + getBanner();
        return vde;
    }

}
