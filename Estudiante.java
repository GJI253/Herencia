/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Priscila Kennedy
 */
public class Estudiante extends Persona {
    private String carrera;
    private int semestre;

    public Estudiante(String nombre, int edad, String curp, String carrera, int semestre) {
        super(nombre, edad, curp);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== ESTUDIANTE ===");
        super.mostrarDatos();
        System.out.println("Carrera: " + carrera);
        System.out.println("Semestre: " + semestre);
        System.out.println();
    }
}