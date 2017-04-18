/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class SingleInheritance {class Faculty
{  
float salary=30000;  
}  
class Science extends Faculty
{ 
float bonous=2000;
public static void main(String args[)
{
Science obj=new Science(); 
System.out.println("Salary is:"+obj.salary);  
System.out.println("Bonous is:"+obj.bonous);  
}  
} 
    
}
