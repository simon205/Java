
import java.io.PrintStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class TOSTRIN {
    private int month;
    private  int day;
    private  int year;
      public TOSTRIN( int m, int d,int y){
       month=m;
       day=y;
       year=y;
       
       System.out.printf("the contrtuctor for  this is %s\n",this);
       
       
      }
    
      public String toString(){
        return String  .format("%d/%d,%d",month,day,year);
      }
      }
      
     

