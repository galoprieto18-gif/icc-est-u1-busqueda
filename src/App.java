import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria",30 ,"F" ),
            new Persona("Pedro",20 ,"M" ),
            new Persona("Ana",28 ,"F" ));
    

            BusquedaLineal busquedaLineal = new BusquedaLineal(personas);

            System.out.println(busquedaLineal.findByName("Maria"));
            
            System.out.println(busquedaLineal.findByName("Diego"));

            System.out.println(busquedaLineal.findByName("Ana"));
            
            
        // 1. BUSQUE UNA PERSONA con nombre "Maria".
        // RETORNE LA PERSONA SI LO ENCONTRO 
        // 2. BUSQUE UNA PERSONA con nombre "Diego"
        // RETORNE LA PERSONA SI LO ENCONTRO
        // 3. BUSQUE UNA PERSONA con nombre "Ana"
        // Imprima la posicion de la persona si lo encontro 



    }
}

