/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author PFR
 */
public  class Animal extends especie {
    
    private int codigo;
    private String nombre;
    private String tipoAlimento;

    
    public Animal(String nombre,String tipoAlimento)
    {
        this.codigo=001;
        this.nombre=nombre;
        this.tipoAlimento=tipoAlimento;
        
        
    }
    
    
    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlimento() {
        return tipoAlimento;
    }

    public void setTipoAlimento(String tipoAlimento) {
        this.tipoAlimento = tipoAlimento;
    }
    
    
    
    
    
    
    
}
