/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagian4;

/**
 *
 * @author User
 */
public class Static {

	public static int x = 0;
	
 }

//static bagian ke 2
	class Person {

	public static int pCount;

	public static void main(String[ ] args) {	

	   Person.pCount = 1; 

	   Person.pCount++;
	   
	   System.out.println(Person.pCount);		
	  }
	}
