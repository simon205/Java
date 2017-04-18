/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class ArraySUM {
  public static void main(String[] args){
   int ann[]={1,22,33,44,55};
   int sum =0;
   for(int counter=0;counter<ann.length;counter++){
   sum+=ann[counter];
   }
   System.out.println("the sum of these numbers is"+sum);
   
  }  
}
