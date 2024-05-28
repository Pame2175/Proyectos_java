/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

/**
 *
 * @author Pamela Gonzalez
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int cont = 0;
         int promedio;
         int suma=0;
        int vector[]= new int []{2,3,6,7};
            for (int i=0; i<=3; i++){
                
                suma=suma+vector[i];
               cont=cont+1;
  
    
      
    }
           
     promedio=suma/cont;
       System.out.println("La suma es" + suma); 
         System.out.println("El promedio es" +promedio);
            
 
      }
    
}
