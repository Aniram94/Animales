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
public class Gato extends Animal{
    // public void habla(){

      double Miau;
     
    public Gato (double Miau){
        
        this.Miau=Miau;
    } 

    @Override
    public double getSonido() {
        return Miau;
    }
    
    }
    
    
    
    

