import java.util.List;

import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        

        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria",30 ,"F" ),
            new Persona("Pedro",20 ,"M" ),
            new Persona("Ana",28 ,"F" ));
    

            // BusquedaLineal busquedaLineal = new BusquedaLineal(personas);

            
                
            
            // System.out.println(busquedaLineal.findByName("Maria"));

            // System.out.println(busquedaLineal.findByName("Diego"));

            // System.out.println(busquedaLineal.findByName("Ana"));


            BusquedaBinaria bB = new BusquedaBinaria(personas);
            // int resultado = bB.findByName("Galazar");
            // if(resultado >=-1){
            //     System.out.println(" Se encontro en la pos = " + resultado);
            // }else{
            //     System.out.println(" No se encontro");
            // }

            int res = bB.findByName("Pedro");
            //Operador ternario
            System.out.println(res >= 0 ? "Se encontro en la pos = " + res : "No se encontro nada :(");
            
            int res2 = bB.findByAge(25);
            System.out.println(res2 >= 0 ? "Se encontro en la pos = " + res2 : "No se encontro nada :(");

            Persona pBuscar = new Persona ("Maria",
            30,
            "F");
            int res3 = bB.findByPerson(pBuscar);
            System.out.println(res3 >= 0 ? "Se encontro en la pos = " + res3 : "No se encontro nada :(");
        // 1. BUSQUE UNA PERSONA con nombre "Maria".
        // RETORNE LA PERSONAv SI LO ENCONTRO 
        // 2. BUSQUE UNA PERSONA con nombre "Diego"
        // RETORNE LA PERSONA SI LO ENCONTRO
        // 3. BUSQUE UNA PERSONA con nombre "Ana"
        // Imprima la posicion de la persona si lo encontro 



    }
}

