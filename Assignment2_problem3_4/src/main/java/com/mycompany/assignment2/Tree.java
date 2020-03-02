/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2;

/**
 *
 * @author Moaaz
 */
public class Tree {
    int data;
    Tree left, right; 
   
    Tree(int item)  
    { 
        data = item; 
        left = right = null;
    }
    
    Tree() {}
}