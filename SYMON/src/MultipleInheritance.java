/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class MultipleInheritance {
    
class Faculty
{  
float total_sal=0, salary=30000;  
}  

class HRA extends Faculty
{  
float hra=3000;  
}  

class DA extends HRA
{  
float da=2000;  
}  

class Science extends DA
{ 
float bonous=2000;
public static void main(String args[])
{
Science obj=new Science(); 
obj.total_sal=obj.salary+obj.hra+obj.da+obj.bonous;
System.out.println("Total Salary is:"+obj.total_sal);   
}  
}
}
