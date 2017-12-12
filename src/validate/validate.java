/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validate;

import java.util.regex.Pattern;

/**
 *
 * @author Student
 */
public class validate implements validateInt{

    @Override
    public boolean checkSize(int size, String value) {
        if(value.length() < size)
            return false;
        return true;
    }

    @Override
    public boolean checkSameSize(int size, String value) {
        if(value.length()!= size)
            return false;
        return true;
    }

    @Override
    public boolean checkAlpha(String value) {

        char c[] = value.toCharArray();
        
        for(char x: c){
            if(!Character.isAlphabetic(x))
                return false;
        }
        
        return true;
    }

    @Override
    public boolean checkName(String value) {
        char c[] = value.toCharArray();
        for(char x: c){
            if(!Character.isAlphabetic(x) && !Character.isWhitespace(x))
                return false;
        }
        return true;
    }

    @Override
    public boolean checkDigit(String value) {
        
        char c[] = value.toCharArray();
        for(char x: c){
            if(!Character.isDigit(x))
                return false;
        }
        return true;
    }

    @Override
    public boolean checkEmail(String value) {
        if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", value))) 
            return false;
    
        return true;
    }

    @Override
    public boolean isEmpty(String value) {

        if(value.isEmpty())
            return true;
        return false;
    }
   
}
