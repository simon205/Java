
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
public class DICEROLLARRAY {
    public static void main(String[] args){
    Random rand=new Random();
    int freq[]=new int[7];
    for (int roll=0;roll<100;roll++){
      ++freq[1+rand.nextInt(6)];
    }
    System.out.println("face\tfrequency");
    for(int face=1;face<freq.length;face++){
    System.out.println(face+"\t"+freq[face]);
    }
    }
    
}
