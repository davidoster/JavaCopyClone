/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11;

/**
 *
 * @author mac
 */
public class JavaApplication11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        Assume we have two classes, class A and class B. 
        Instantiate an object of Class B so that the object 
        is a copy of an object of class A.
        
         */

 /*
        1. Assume we have two classes,
            1.1 class A
            1.2 class B
        2. Instantiate an object of Class B (Object b1 = new B() AND b1 = a1)
        3. So that the (previous) object is a copy of an object of class A.
        
        
        
         */
        A a = new A();
        B b = new B();

        a.name = "A";
        b.name = "B";

//        b = a; // can't do this!
        Object a1 = new A();
        Object b1 = new B();

        System.out.println("After constructor initilization : " + (b1.hashCode() == a1.hashCode()));
//        a1.name = "A"; // can't do this!
//        b1.name = "B"; // can't do this!
        b1 = a1;
        System.out.println("After b1 == a1 (hashCode Comparison): " + (b1.hashCode() == a1.hashCode()));
        System.out.println("After b1.equals(a1) : " + b1.equals(a1));

        System.out.println("\nThe OTHER WAY!!!\n");

        b1 = new A().getA();
        System.out.println("After b1 = new A().getA() (hashCode Comparison): " + (b1.hashCode() == a1.hashCode()));
        System.out.println("After b1.equals(a1) : " + b1.equals(a1));

    }

}
