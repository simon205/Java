/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Amon
 */
public class Polymorphism {
  class Person
{
void walk()
{
System.out.println("Can Run....");
}
}
class Employee extends Person
{
void walk()
{
System.out.println("Running Fast...");
}
public static void main(String arg[])
{
Person p=new Employee(); //upcasting
p.walk();
}
}
  
}
