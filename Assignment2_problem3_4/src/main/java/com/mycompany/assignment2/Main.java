/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.assignment2;

import java.util.ArrayList;
import java.util.Scanner;



/**
 *
 * @author Moaaz
 */
public class Main {
   
    public static void main(String[] args) {
//        Problem3 tree = new Problem3();
//        
//        tree.root = new Tree(1); 
//        tree.root.left = new Tree(2);
//        tree.root.right = new Tree(3);
//        tree.root.left.left = new Tree(4);
//        tree.root.left.right = new Tree(5);
//        tree.root.right.left = new Tree(6);
//        
//        long sum ;
//        sum = tree.digitSum(tree.root);
//        System.out.println("The sum is: " + sum);
        
//6
// 1 2 1 3 1 4 2 5 2 6 4 5 6 3 4   => 3
//9
//1 2 1 3 1 4 2 5 2 6 3 7 3 8 3 9 4 5 6 3 4 6 2 4 => 2

        Problem4 p4 = new Problem4();
        
        ArrayList<Integer> countriesAndQ = new ArrayList();
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        for (int i = 0; i < (N-1) * 3 ; i++) {
            int n = input.nextInt();
            countriesAndQ.add(n);
        }
        
        p4.clubAccepted(countriesAndQ , N-1);
    }
}
