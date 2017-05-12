/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.animales;

/**
 *
 * @author marina
 */
public class Lobo extends Animal{
    // public void habla(){
   
    double Aauu;
     
    public Lobo (double Aauu){
        
        this.Aauu=Aauu;
    } 

    @Override
    public double getSonido() {
        return Aauu;
    }
    
    }
    
    
    
    

