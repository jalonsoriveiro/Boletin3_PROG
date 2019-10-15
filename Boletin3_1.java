/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin3_1;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin3_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Consumo pepito = new Consumo();
        float tiempo = pepito.getTempo(500,6);        
        System.out.println("Tiempo de Viaje "+tiempo);        
        float consumoMd = pepito.consumoMedio(50,400);
        System.out.println("Consumo media cada 100km "+consumoMd);
        /**/
        float mdEuros = pepito.consumoEuros(50,400);
        System.out.println("Consumo media cada 100km "+mdEuros);
       /* */
       /* */
        pepito.setKms(50);   
       /* */
        pepito.setLitros(50);
        /**/
        pepito.setvMed(50);
        /**/   
        pepito.setPGas(50);
        /**/   
       
       
       /*
       
       
        Alumno antia = new Alumno("ant",8);
        antia.amosar();
        System.out.println("Nombre anterior "+antia.getNome());
        antia.setNome("Antia");
        System.out.println("Nuevo nombre "+antia.getNome());*/
    }
    
}