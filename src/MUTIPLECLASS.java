
import java.util.Scanner;

/*
import java.util.Scanner;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class MUTIPLECLASS {
    public static void main(String[] args){
     Scanner input=new Scanner(System.in);
    Apples Applesobject=new Apples();
    System.out.println("Enter your name here:");
    String name=input.nextLine();
    
  Applesobject.simpleMessage(name);
    }
}
