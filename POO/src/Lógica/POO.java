
package Lógica;


public class POO {

   
    public static void main(String[] args) {
        
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(5,"Sicpio","Scipio");
        
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es:  " + alu2.getNombre());
        System.out.println("-----------------------------------");
        alu1.setId(8);
        alu1.setNombre("Suscribete");
        alu2.setApellido("Todocode");
        System.out.println("La id del alumno 1 es: " + alu1.getId());
        System.out.println("El nombre es:  " + alu1.getNombre());
        System.out.println("-----------------------------------");
        //cambio de valor
        alu2.setId(35);
        System.out.println("-----------------------------------");
        System.out.println("La id del alumno 2 es: " + alu2.getId());
        System.out.println("El nombre es:  " + alu2.getNombre());
            
        
        
        
    }
    
}
