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
public class Module4Quiz {

	// soal 1

	public void calc();

	//soal 2

	public int max(int a, int b)
	{
		if(a >b)
		{
			return a;
		}
			return b;
	}
	
	//soal 3
	public int myFunc(int x)
	{
		return x*10;
	}


	//soal 4
	public int minFunc(int n1, int n2)
	{
		int min;

		if(n1 > n2)
		
			min = n2;
		else
			min = n1;

		return min;
	}

	//soal 5

	public class MyClass 
	{
		public void myFunc()
		{
			System.out.println("Hi!");
		}
	}


 }

