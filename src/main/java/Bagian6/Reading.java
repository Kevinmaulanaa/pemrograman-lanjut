

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


public class Reading {

	public static void main(String[]args)
	{
		try {
			File f = new File("a.txt");

			Scanner sc = new Scanner(f);

			while(sc.hasNext())
			{
				String a = sc.next();

				String b = sc.next();

				System.out.println(a + " " + b);
			}

			sc.close();
		}

		catch (Exception e)
		{
			System.out.println("Error");
		}
	}
}


