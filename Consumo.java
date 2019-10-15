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
class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    public float tiempo;
    public float euros;
    public float nuevoKm;
    public float nuevoLitros;
    public float nuevoMed;
    public float nuevoPgas;
    public float v_mediaKm;
    public float v_mediaLitros;
    public float v_medPgas;
    public float v_mediaComsumo;
        
    /*Atributos :
        km   kilómetros percorridos polo coche
        litros  Litros de combustible consumidos
        vMedvelocidade media
        pGas  Prezo da gasolina*/

  public Consumo(int km ,float litros,float vMed,float pGas){    
        //nome = nom;
        //nota = not;
    }
    //Contructor sin parametros
    public Consumo(){
        //Valores por defcto
    }
    public float getTempo(float v_med,float v_km){
    //getTempo  Indica o tempo empregado en realizar a viaxe 
        km = v_km;
        vMed = v_med;
        tiempo= vMed /km;
        return tiempo;
    }
    public float consumoMedio(float litros,float km){
    //consumoMedio consumo medio do vehículo ( en litros cada 100 km )
      v_mediaKm = km /100;
      return v_mediaLitros = (litros/v_mediaKm);              
    }
     public float consumoEuros(float pGas, float km){
    //consumoEuros consumo medio( en € cada 100 km )
        v_medPgas = pGas/100;   
        return v_mediaComsumo = (km/v_medPgas);          
    }
     public void setKms(float nuevoKm){
        //setKms  modifica o valor dos km
        km = nuevoKm;
         System.out.println("Nuevos kilometros "+km);
    }              
      public void setLitros(float nuevoLitros){
        //litros
        litros = nuevoLitros;          
        System.out.println("Nuevos litros "+litros);
    }
      public void setvMed(float nuevoMed){
        //media
         vMed = nuevoMed;  
    } 
       public void setPGas(float nuevoPgas){
        //gas
         pGas = nuevoPgas;  
    } 

   
}


