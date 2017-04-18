
import java.util.Arrays;




/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class ARRAYTABLE{
    public static void main(String[] args){
    int firstarray[][]={{8,9,10,11},{12,13,14,15,}};
    int secondarray[][]={{30,31,32,33},{43},{4,5,6}};
    int x;
  System.out.println("This is the first arrays");
   display(firstarray);
     System.out.println("This is the first array");
      display(secondarray);
    }
    public static void  display(int x[][]){ 
        for(int row=0;row<x.length;row++) {
            for(int column = 0; column <x.length; column++) {
                System.out.print(x[row][column] + "t");
            }
            System.out.println();
        }
     }
     }


      