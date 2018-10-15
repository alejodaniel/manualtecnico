
package com.alejandro.ucc;


public class ValidarNumeros {

   public boolean validacion(String cadena){
       int numero;
               try{
                   numero = Integer.parseInt(cadena);
                   return true;
               }catch(Exception e)
               {
                   return false;
                   
               }
       
   }
}
