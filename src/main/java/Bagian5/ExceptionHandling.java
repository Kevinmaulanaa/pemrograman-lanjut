

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


public class ExceptionHandling {

	int x = 12;

	int y = 0;
	
	try {
	int z = x / y;

   	System.out.println(z);
	}
	catch (Exception e) {

   System.out.println("Error");

	}
 }

