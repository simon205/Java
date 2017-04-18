/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class CompINTEREST {
    public static void main(String[] ags){
        double amount;
        double principle=30000;
        double rate=0.02;
        for(int day =1;day<=20;day++){
            amount=principle*Math.pow(1+rate,day);
         System.out.println(day+"  "+ amount);
              }
          }
       }

