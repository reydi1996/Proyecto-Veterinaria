/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author  ROLANDO_GUADALUPE
 */
public enum Tipo {
    
    
    // especie de las aves
    
    canarios ("canarios",Especie.aves),
    pelicanos("pelicanos",Especie.aves),
    pinguinos("pinguinos",Especie.aves),
    patos("patos",Especie.aves),
    gallina("gallina",Especie.aves),
    turacus("turacus",Especie.aves),
    lechusas("lechusa",Especie.aves),
    palomas("palomas",Especie.aves),
    aguilas("aguilas",Especie.aves),
    loros("loros",Especie.aves),
    gaviotas("gaviotas",Especie.aves),
    garsas("garsas",Especie.aves),
    halcones("halcones",Especie.aves),
    piguichu("piguichu",Especie.aves),
    pavos("pavos",Especie.aves),
    
    
    // especie de los mamiferos
    
    
    perros("perros",Especie.Mamiferos),
    monos("monos",Especie.Mamiferos),
    vacas("vacas",Especie.Mamiferos),
    gatos("gatos",Especie.Mamiferos),
    conejos("conejos",Especie.Mamiferos),
    Higuanas("Higuanas",Especie.Mamiferos),
    caballos("caballos",Especie.Mamiferos),
    cuyes("cuyes",Especie.Mamiferos),
    ardillas("ardillas",Especie.Mamiferos),
    llamas("llamas",Especie.Mamiferos),
    ovejas("ovejas",Especie.Mamiferos),
    chivos("chivos",Especie.Mamiferos);
   
    
   private final String nombre;
   private final Enum especie;

    private Tipo(String nombre, Enum especie){
        this.nombre = nombre;
        this.especie = especie;
    }
    

    public String getNombre() {
        return nombre;
    }

    public Enum getEspecie() {
        return especie;
    }
   
    
    
    
    
    
    
            
    
}
