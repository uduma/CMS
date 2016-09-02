/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crmdata;

/**
 *
 * @author JAVA2
 */
public class crmValidator {
    
    
    public static boolean isValid(String text){
        
        boolean valid = false;
        if(!text.isEmpty()){
            valid =true;
        }
        if(text.length()!=0){
            valid=true;
        }
        return valid;
        
    }
    
    
    
}
