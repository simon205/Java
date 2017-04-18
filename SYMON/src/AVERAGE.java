/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class AVERAGE {
   public static void main(String[] args){
 System.out.println(average(40,32,43,54,67,87));
   }
   public static int average(int...numbers){
   int total=0;
   for(int x:numbers)
       total+=x;
    return total/numbers.length;
   }
    
}
