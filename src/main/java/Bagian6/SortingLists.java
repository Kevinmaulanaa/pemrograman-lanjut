





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


public class SortingLists {	

   public static void main(String[ ] args) {
  
   	List<String> list = new ArrayList<String>();
	list.add("b");
	list.add("a");
	list.add("c");
	Collections.sort(list);
	System.out.println(list.get(0));

   }
}


