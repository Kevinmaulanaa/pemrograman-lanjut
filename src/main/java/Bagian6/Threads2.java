/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagian6;

/**
 *
 * @author User
 */

	class A implements Runnable
	{
		public void run()
		{
			System.out.println("Bye");
		}
	}

	public class Threads2
	{
		public static void main(String[]args)
		{
			Thread ob = new Thread(new A());

			ob.start();
		}
	}

