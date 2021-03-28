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
public class AnonymousClasses {

	Machine m = new Machine()
	{
		@Override public void start()
		{
			System.out.println("Hi");
		}
	}
	
	
 }

