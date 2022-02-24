/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.awt.Color;

/**
 *
 * @author yahir
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         System.out.println("Hola Mundo Java !!!!");

        //per1 es un ejemplar(instancia) #INDENTIDAD nombre/variable
        Persona per1 = new Persona();
        per1.setNombre("Yahir RM ");
        System.out.println("Nombre: " + per1.getNombre());
        per1.comer("hamburguesa hawiana!!!");

         Persona per2 = new Persona();
        per2.setNombre("Yahir Ruiz");
        System.out.println("Nombre per 2: " + per2.getNombre());
        per2.comer("pizza hawaiana ");

        
        Automovil miBocho = new Automovil();
        miBocho.setMarca("VW ");
        System.out.println("Marca: "+ miBocho.getMarca());
        miBocho.setSubMarca("sedan");
        System.out.println("subMarca: "+ miBocho.getSubMarca());
        miBocho.setModelo(1970);
        System.out.println("Modelo: "+miBocho.getModelo());
        miBocho.setColor(Color.BLUE);
        System.out.println("Color: "+miBocho.getColor());
        
        Automovil miAkura = new Automovil();
        miAkura.setMarca("Akura");
        System.out.println("Marca: "+ miAkura.getMarca());
        miAkura.setSubMarca("NSX");
        System.out.println("subMarca: "+ miAkura.getSubMarca());
        miAkura.setModelo(2013);
        System.out.println("Modelo: "+miAkura.getModelo());
        miAkura.setColor(Color.GRAY);
        System.out.println("Color: "+miAkura.getColor());

        Automovil miMustang = new Automovil(); 
        miMustang.setMarca("Ford"); 
        System.out.println("Marca: "+ miMustang.getMarca()); 
        miMustang.setSubMarca("Mustan");
        System.out.println("subMarca: "+ miMustang.getSubMarca()); 
        miMustang.setModelo(2010);
        System.out.println("Modelo: "+miMustang.getModelo()); 
        miMustang.setColor(Color.YELLOW); 
        System.out.println("Color: "+miMustang.getColor());

        // TODO code application logic here
    }
    
}
