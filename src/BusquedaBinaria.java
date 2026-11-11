import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Persona;

public class BusquedaBinaria {
    
    private List<Persona> personas;

    public BusquedaBinaria(List<Persona> personas){
        this.personas = new ArrayList<>(personas);
            
    }
    
    public Integer findByName(String name) {

        //ORDENADO -> Nombre 
        personas.sort(Comparator.comparing(Persona:: getName));



        //Busqueda Binaria
        // 1.Definir limites 
        
        int lo = 0;
        int hi = personas.size();
    
        //2. Bucle con su condición

        while(lo <= hi){
        
        //3. Definimos el centro
            int mid = (lo + hi) /2;

        //4. preguntar si el [min] es lo buscado
            if(personas.get(mid).getName().equals(name)){
                return mid;
            }
            // 5 actualizar
            // 5.1 verificar si es mayor o menor y escoger un lado 
            if(personas.get(mid).getName().compareTo(name) < 0) 
                //5.2 actualizo el limit XXXX
                           
                lo = mid +1;
            else
                // 5.2 actualizo el limit YYYY
                hi = mid - 1;
        }
        return -1; 
    }

    public int findByAge (int age){

        personas.sort(Comparator.comparing(Persona:: getAge));
          
        int lo = 0;
        int hi = personas.size();
    
        //2. Bucle con su condición

        while(lo <= hi){
        
        //3. Definimos el centro
            int mid = (lo + hi) /2;

        //4. preguntar si el [min] es lo buscado
            if(personas.get(mid).getAge() == age){
                return mid;
            }
            // 5 actualizar
            // 5.1 verificar si es mayor o menor y escoger un lado 
            if(personas.get(mid).getAge ()  < age) 
                //5.2 actualizo el limit XXXX
                           
                lo = mid +1;
            else
                // 5.2 actualizo el limit YYYY
                hi = mid - 1;
        }
        return -1; 
        
    }
    public int findByPerson(Persona p){

        personas.sort(null);
         int lo = 0;
        int hi = personas.size();
    
        //2. Bucle con su condición

        while(lo <= hi){
        
        //3. Definimos el centro
            int mid = (lo + hi) /2;

        //4. preguntar si el [min] es lo buscado
            if(personas.get(mid).compareTo(p) == 0){
                return mid;
            }
            // 5 actualizar
            // 5.1 verificar si es mayor o menor y escoger un lado 
            if(personas.get(mid).getAge ()  < 0) 
                //5.2 actualizo el limit XXXX
                           
                lo = mid +1;
            else
                // 5.2 actualizo el limit YYYY
                hi = mid - 1;
        }
        return -1; 
    }
}
   
 