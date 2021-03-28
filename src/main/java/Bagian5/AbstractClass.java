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
public class AbstractClass {

	abstract class Animal {

  	public int age;

  	public  int printAge();

}

	class Dog extends Animal
	{
		public int printAge()
		{
			return age;
		}
	}
	
 }

