
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
public class Simpleprogram {
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    float total=0;
   float grade;
    float average;
    float counter=0;
    while(counter<10){
    grade=input.nextInt();
    total=total+grade;
    counter++;
    }
    average=total/10;
    System.out.println("yur averageis"+ average);    }
    
}
