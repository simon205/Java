
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class RANDOM {
    public static void main(String[] args){
    Random dice= new Random();
          int number;
          
for(int counter=1;counter<10;counter++){
number=1+dice.nextInt(6);
System.out.println(number +"  ");}
}
}

