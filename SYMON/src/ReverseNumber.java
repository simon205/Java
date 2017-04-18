
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
public class ReverseNumber {
private static Scanner sc;
public static void main(String[] args){
int number;
sc=new Scanner(System.in);
 System.out.println("\n please enter any  number you want to reverse:");
 number=sc.nextInt();
String str= Integer.toString(number);
String reverse=new StringBuffer(str).reverse().toString();
        System.out.format("\n Reverse of entered number is =%s",reverse);
}
    	}

    

