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
public class Equals {

	private int x;

	public boolean equals(Object o)
	{
		return ((A)o).x == this.x;
	}

	public static void main(String[ ] args)  {


    A a = new A();


    a.x = 9;


    A b = new A();

    b.x = 5;

    System.out.println(a.equals(b));
	
 }

