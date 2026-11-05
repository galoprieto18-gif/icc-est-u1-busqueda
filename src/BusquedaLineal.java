import java.util.List;

import models.Persona;

public class BusquedaLineal {
    
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas) {
        this.personas = personas;
    }
    // BUSQUE UNA PERSONA
    // RETORNE LA PERSONA SI LO ENCONTRO
    // RETORNE ---NULL--- SI NO LO ENCUENTRA

    public Persona findByName(String name) {
        
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getName().equals(name)){
                return personas.get(i);
            }
        }
        return null;
    }
    
    // BUSQUE LA POS DE UNA PERSONA
    // RETORNE LA POS PERSONA SI LO ENCONTRO
    // RETORNE ___-1___ SI NO LO ENCUENTRA

    public int findPosByName(String name) {
        
        for (int i = 0; i < personas.size(); i++) {
            if(personas.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;

    }
}
