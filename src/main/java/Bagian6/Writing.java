

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


public class Writing {

	Formatter f = new Formatter("a.txt");

	f.format("%s", "Hi ");

	f.format("%s", "there ");

	f.close();
	
}


