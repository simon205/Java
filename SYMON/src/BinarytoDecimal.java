
import java.util.Scanner;

/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class BinarytoDecimal {
    
 public static void main(String[] args) {
        
 Scanner in = new Scanner( System.in );
 System.out.println("Enter a binary number: ");
 
  int  binarynum =in.nextInt();
  int binary=binarynum;
        
int decimal = 0;
int power = 0;
 
while(true){
 
 if(binary == 0){
 
        break;
 
 } else {
 
   int tmp = binary%10;
   decimal += tmp*Math.pow(2, power);
   binary = binary/10;
   power++;
 
 }
}
        System.out.println("Binary="+binary+" Decimal="+decimal); ;
}
 
}

