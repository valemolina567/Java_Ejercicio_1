import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Universidad universidad1 = new Universidad();
        Universidad universidad2 = new Universidad();
        Universidad universidad3 = new Universidad();

        Materia materia1 = new Materia();
        Materia materia2 = new Materia();
        Materia materia3 = new Materia();

        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();

        Notas nota1 = new Notas();
        Notas nota2 = new Notas();
        Notas nota3 = new Notas();

        //Estudiante 1
        JOptionPane.showMessageDialog(null,"Estudiante #1");
        // Datos de la universidad
        JOptionPane.showMessageDialog(null,"Datos de la Universidad");
        universidad1.leerInfoU();
        // Datos del estudiante
        JOptionPane.showMessageDialog(null,"Datos del Estudiante");
        estudiante1.leerInfoE();
        // Datos de la materia
        JOptionPane.showMessageDialog(null,"Datos de la Materia");
        materia1.leerInfoM();
        // Datos de las notas
        JOptionPane.showMessageDialog(null,"Calificaciones");
        nota1.leerInfoN();

        /*// Estudiante 2
        JOptionPane.showMessageDialog(null,"Estudiante #2");
        // Datos de la universidad
        JOptionPane.showMessageDialog(null,"Datos de la Universidad");
        universidad2.leerInfoU();
        // Datos del estudiante
        JOptionPane.showMessageDialog(null,"Datos del Estudiante");
        estudiante2.leerInfoE();
        // Datos de la materia
        JOptionPane.showMessageDialog(null,"Datos de la Materia");
        materia2.leerInfoM();
        // Datos de las notas
        JOptionPane.showMessageDialog(null,"Calificaciones");
        nota2.leerInfoN();

        // Estudiante 3
        JOptionPane.showMessageDialog(null,"Estudiante #3");
        // Datos de la universidad
        JOptionPane.showMessageDialog(null,"Datos de la Universidad");
        universidad3.leerInfoU();
        // Datos del estudiante
        JOptionPane.showMessageDialog(null,"Datos del Estudiante");
        estudiante3.leerInfoE();
        // Datos de la materia
        JOptionPane.showMessageDialog(null,"Datos de la Materia");
        materia3.leerInfoM();
        // Datos de las notas
        JOptionPane.showMessageDialog(null,"Calificaciones");
        nota3.leerInfoN();*/

        System.out.println("Datos del estudiante 1:");
        System.out.println("\n" + universidad1.verDetalleU() + "\n" + estudiante1.verDetalleE() + "\n" + materia1.verDetalleM() + "\n" + nota1.verDetalleN());

        /*System.out.println("Datos del estudiante 2:");
        System.out.println("\n" + universidad2.verDetalleU() + "\n" + estudiante2.verDetalleE() + "\n" + materia2.verDetalleM() + "\n" + nota2.verDetalleN());

        System.out.println("Datos del estudiante 3:");
        System.out.println("\n" + universidad3.verDetalleU() + "\n" + estudiante3.verDetalleE() + "\n" + materia3.verDetalleM() + "\n" + nota3.verDetalleN());*/
        
    }
}
