/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class CHANGEinARRAYS {
    public static void main(String[] args){
    int ann[]={2,3,4,5,6,};
   change(ann); 

 for(int w:ann)
 System.out.println(w);
}
    public static void change(int x[]){
    for(int counter=0;counter<x.length;counter++)
        x[counter]+=5;
    }
}