/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class ODDEVEN {
    public static void main(String[] args) {
       int number = 14;
       String[] trick = { "even", "odd" };
       System.out.println(number + " is " + trick[number % 2]);
     }
 } 

