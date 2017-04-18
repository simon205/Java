
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
public class BOY {
    public static void main(String[] args){
    Scanner  input= new Scanner(System.in);
    GIRL GIRLobject=new GIRL("JED");
    System.out.println("Enter name of first gf here:");
    String temp =input.nextLine();
    GIRLobject.setName(temp);
    GIRLobject.saying();
    
    }

    private static void saying() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
    

