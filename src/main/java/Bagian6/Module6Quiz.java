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


public class Module6Quiz {


	//kuis 1

	void myFunc(int a, int b)
	{
		try{
			System.out.println(a / b);
		}
		catch(Exception e)
		{
			System.out.println("Error");
		}
	}

	//kuis 2

	void myFunc(int arg)
	throws IllegalArgumentException
	{
		if (arg < 0) {
			throw new IllegalArgumentException();
		}
	}



}


