/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Priscila Kennedy
 */
public class Main {
    public static void main(String[] args) {
        Estudiante est = new Estudiante("Ana López", 20, "AALP030201", "Sistemas", 4);
        Docente doc = new Docente("Carlos Pérez", 40, "CAPE850101", "Programación", 12000.0);
        Administrativo adm = new Administrativo("Laura Gómez", 35, "LAGO890212", "Recursos Humanos", "Coordinadora");

        est.mostrarDatos();
        doc.mostrarDatos();
        adm.mostrarDatos();
    }
}