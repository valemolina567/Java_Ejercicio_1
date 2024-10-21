import javax.swing.*;
import java.util.Scanner;

public class Universidad {
    private String nombre;
    private String direccion;

    Scanner sc = new Scanner(System.in);

    // Constructores

    public Universidad(){

    }

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public Universidad(String nombre, String direccion) {
        this(nombre);
        this.direccion = direccion;
    }

    // Creación de getters y setters.

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos Propios

    public void leerInfoU(){
        setNombre(JOptionPane.showInputDialog(null, "Ingrese el nombre:"));
        setDireccion(JOptionPane.showInputDialog(null, "Ingrese la dirección:"));
    }

    public String verDetalleU(){
        String vdu = "Nombre: " + getNombre() /*this.marca*/ + "\n" +
                "Direccion: " + getDireccion();
        return vdu;
    }
}