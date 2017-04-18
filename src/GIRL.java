/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class GIRL {
private String girlName;

    GIRL(String jed) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void setName(String name){
    girlName=name;
}
public String getName(){
    return girlName;
}
public void saying(){
    System.out.printf("Your first gf was %s",getName());
    
}
}
