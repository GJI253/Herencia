/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Priscila Kennedy
 */
public class Administrativo extends Persona {
    private String area;
    private String puesto;

    public Administrativo(String nombre, int edad, String curp, String area, String puesto) {
        super(nombre, edad, curp);
        this.area = area;
        this.puesto = puesto;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("=== ADMINISTRATIVO ===");
        super.mostrarDatos();
        System.out.println("Área: " + area);
        System.out.println("Puesto: " + puesto);
        System.out.println();
    }
}
