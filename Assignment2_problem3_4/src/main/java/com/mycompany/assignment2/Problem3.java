/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2;

import java.util.ArrayList;

/**
 *
 * @author Moaaz
 */
public class Problem3 {
    
    Tree root ;

    public Problem3() {
        this.root = new Tree();
    }
    
    void getArraySum(Tree t , String s ,ArrayList<String> ArrSums)
    {
        
        if(t == null )
        {
            return ;
        }
        
        String temp = s + Integer.toString(t.data);
        
        if (t.left == null && t.right == null) {
            ArrSums.add(temp);
            temp = "";
        }
        else
        {
            getArraySum(t.left , temp , ArrSums);
            getArraySum(t.right , temp , ArrSums);
        }   
    }
    
    long digitSum(Tree t){
    
        long sum = 0;
        ArrayList<String> SumsString = new ArrayList();
        getArraySum(t,"",SumsString);
        
        for (int i = 0; i < SumsString.size(); i++) {
            sum += Integer.parseInt(SumsString.get(i));
        }
        
        return sum;
    }
    
    
    
    
}
