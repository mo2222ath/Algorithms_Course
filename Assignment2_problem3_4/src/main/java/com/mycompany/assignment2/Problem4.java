/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Moaaz
 */
public class Problem4 {
    
   HashMap<Integer,ArrayList<Integer>> tree = new HashMap<Integer,ArrayList<Integer>>();
   
   void clubAccepted(ArrayList<Integer> arr, int n)
   {
       boolean ch = true;
       int i = 0;
       while (i < n*2){
           ArrayList<Integer> temp = new ArrayList();
           if (!tree.containsKey(arr.get(i))) {
                temp.add(arr.get(i+1));
                for (int j = i+2; j < n*2;j+=2) {
                    if (arr.get(i) == arr.get(j))
                    {
                        temp.add(arr.get(j+1));
                    }
                }
                ch = false;
           }
           if (!ch) {
               tree.put(arr.get(i), temp);
               ch = true;
           }
           i+=2;
       }
       
//To Print the tree ...
//       for (Map.Entry<Integer, ArrayList<Integer>> entry : tree.entrySet()) {
//        System.out.println( "Value: " +  entry.getKey());
//        System.out.println("List: " +  entry.getValue());
//       }

       ArrayList<Integer> Q = new ArrayList();
       for (int j =n*2; j < arr.size(); j++) {
           Q.add(arr.get(j));
       }
       int min = Q.get(0);
       for (int j = 1; j < Q.size(); j++) {
           if (Q.get(j) < min) {
               min = Q.get(j);
           }
       }
       boolean e = true;
       while(e){
            if (tree.get(1).contains(min)) {
                System.out.println(min);
                e = false;
            }
            else
            {
                Q.remove(min);
                min = Q.get(0);
                for (int j = 1; j < Q.size(); j++) {
                    if (Q.get(j) < min) {
                        min = Q.get(j);
                    }
                }
            }
       }
   }
   
}
