/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagian5;

/**
 *
 * @author User
 */
 	class A {
	   public void print() {
	      System.out.println("A");
	   }
	}
	
	class B extends A {
	   public void print() {
	      System.out.println("B");
	   }
	   public static void main(String[ ] args) {
	    A object = new B();
	    B b = (B) object;
	    b.print();
	   }
	}




