/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author PFR
 */
public abstract class especie {
    
    
    private String nombreEspecie;
    private int peso;
    private int fechaNacimiento;
    private String observacion;
    private String nombre;


    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    

    
    
    
    
    
    
}
