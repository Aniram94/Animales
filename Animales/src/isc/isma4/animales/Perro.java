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
public class Perro extends Animal{
    // public void habla(){

   
    double Wof;
     
    public Perro (double Wof){
        
        this.Wof=Wof;
    } 

    @Override
    public double getSonido() {
        return Wof;
    }
    
    }
    
    
