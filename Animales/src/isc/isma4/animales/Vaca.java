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
public class Vaca extends Animal{
    // public void habla(){
   
    double Muuu;
     
    public Vaca (double Muuu){
        
        this.Muuu=Muuu;
    } 

    @Override
    public double getSonido() {
        return Muuu;
    }
    
    }
   
