
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

import java.util.ArrayList;

public class Iterators {

	List<Integer> list = new ArrayList<Integer>();
	list.add(10);
	list.add(20);
	list.add(30);
	Iterator<Integer> it = list.iterator();
	it.next();
	System.out.println(it.next());

}


