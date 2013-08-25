/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

/**
 *
 * @author PFR
 */
public class Granja {
    
    
    public static void main(String[] args) {
        
        
        Granja.doAplicacion();
        
    }
    
    public static void doAplicacion()
    {
        
        
        Animal animal = new Animal("Caballo","Cereal");
        System.out.println(animal.getCodigo());
        System.out.println(animal.getNombre());
        System.out.println(animal.getTipoAlimento());
        
        Alimentos alimentos = new Alimentos();
        alimentos.setNombreAlimento("papa");
        System.out.println(alimentos.getNombreAlimento());
        Dieta dieta = new Dieta();
        dieta.setAlimento("fruta");
        System.out.println(dieta.getAlimento());
        
        animal.setObservacion("Alimentar al caballlo con mas agua y vitaminas");
        System.out.println(animal.getObservacion());
        
        
        
        
        animal.setNombre("vaca");
        System.out.println(animal.getNombre());
        alimentos.setCantidad(30);
        alimentos.getCantidad();
        
        
        
        
    }
    
    
    
    
    
}
