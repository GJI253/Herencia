/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Priscila Kennedy
 */
public class Docente extends Persona {
    private String materia;
    private double sueldo;

    public Docente(String nombre, int edad, String curp, String materia, double sueldo) {
        super(nombre, edad, curp);
        this.materia = materia;
        this.sueldo = sueldo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== DOCENTE ===");
        super.mostrarDatos();
        System.out.println("Materia: " + materia);
        System.out.println("Sueldo: " + sueldo);
        System.out.println();
    }
}