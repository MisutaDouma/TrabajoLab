package ar.edu.lab.domain;

public class Cliente {
    protected String nombre;
    protected String DNI;

    public Cliente(String nombre, String DNI) {
        this.nombre = nombre;
        this.DNI = DNI;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + nombre +" Dni: "+DNI);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDNI() {
        return DNI;
    }

    
    
}
