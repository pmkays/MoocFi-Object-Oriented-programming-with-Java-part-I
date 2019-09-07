/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author paula
 */
public class StringUtils 
{
    
    public static boolean included(String word, String searched)
    {
        boolean included = true; 
        if((word.isEmpty() || searched.isEmpty()) || 
            !word.toUpperCase().trim().contains(searched.toUpperCase().trim()))
        { 
            included = false; 
        }
        
        return included;
    }
    
}
