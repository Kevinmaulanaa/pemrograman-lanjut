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
public class Inheritance {

	//belajar inheritance

	class Car extends vehicle
	{

	}

	//latihan ke 2
	class Animal {

   public void makeSound() {

   System.out.println(''Hi'');

    }

	}

	class Dog extends Animal
	{

	}

	class A 
	{
		public static void main(String args[]) {

   		Dog dog = new Dog();

   		dog.makeSound();
	}


	
 }

