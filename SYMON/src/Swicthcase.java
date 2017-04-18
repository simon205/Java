
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
public class Swicthcase {
public static void main(String[] args){
    Scanner input=new Scanner(System.in);
 int number;
 System.out.println("enter the no.position of colour of rainbow");
 number=input.nextInt();
switch(number){
    case 1 :
System.out.println("red");
 break;
    case 2:
System.out.println("orange");
break;
        
    case 3:
System.out.println("yellow");
break;
        
     case 4:
System.out.println("green");
break;
        case 5 :
System.out.println("blue");
break;
 
case 6:
System.out.println("indigo");
break;
case 7:
System.out.println("violet");
break;
default:
System.out.println("invalid no");
}
}
    
}
