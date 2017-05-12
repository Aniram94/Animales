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
public class Pollito extends Animal{
    // public void habla(){

    double Pio;
     
    public Pollito (double Pio){
        
        this.Pio=Pio;
    } 

    @Override
    public double getSonido() {
        return Pio;
    }
    
    }
    
    
    
    

