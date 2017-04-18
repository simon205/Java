/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class NOLOOP {
  
public static void recursivefun(int n) 
{ 
 
  if(n <= 10) {
 
       System.out.println(n); 
         recursivefun(n+1);   }
}
 
public static void main(String args[]) 
{
 
recursivefun(1); 
 
 }
 
}
  

