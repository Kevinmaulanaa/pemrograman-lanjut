

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


public class SortingLists2 {	

   public static void main(String[ ] args) {
  
   List<Integer> list = new ArrayList<Integer>();

   list.add(4);

   list.add(2);

   list.add(1);

   Collections.sort(list);

   System.out.println(list.get(1));

   }
}


