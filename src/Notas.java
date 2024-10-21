import javax.swing.*;
import java.util.Scanner;

public class Notas {

    // Declaración de atributos
    private float nota1;
    private float nota2;
    private float nota3;

    // Creación de constructores.

    public Notas(){

    }

    public Notas(float nota1) {
        this.nota1 = nota1;
    }

    public Notas(float nota1, float nota2) {
        this(nota1);
        this.nota2 = nota2;
    }

    public Notas(float nota1, float nota2, float nota3) {
        this(nota1,nota2);
        this.nota3 = nota3;
    }

    // Creación de getters y setters.

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    // Métodos Propios

    public void leerInfoN(){
        setNota1(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la Nota 1:")));
        setNota2(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la Nota 2:")));
        setNota3(Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la Nota 3:")));
    }

    public String verDetalleN(){
        String vdn = "Nota 1: " + getNota1() /*this.marca*/ + "\n" +
                "Nota 2: " + getNota2() + "\n" +
                "Nota 3: " + getNota3();
        return vdn;
    }

}
