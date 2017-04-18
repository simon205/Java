
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
public class GRADE {
    public static void main (String[] args){
    Scanner marks= new Scanner(System.in);
    System.out.println("enter student marks");
    int input= marks.nextInt();
    int x =input;
    if(x>100){
    System.out.println("out of range");
    }
    else if (x <=100 && x >=70)
    {
    System.out.println("grade A");
    }
    else if (x <=69 && x >=60)
    {
    System.out.println("grade is B");
    }
    else if (x <=59 && x >=50)
    {
    System.out.println("grade C" );
    }
    else if (x <=49 && x >=40)
    {
    System.out.println("grade D");
    }
    else if(x<=39)
    {
    System.out.println("fail");
    }
    }
}