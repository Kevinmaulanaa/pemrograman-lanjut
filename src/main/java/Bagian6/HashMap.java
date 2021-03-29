



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

import java.util.HashMap;
public class HashMap {	
   public static void main(String[ ] args) {
   HashMap<String, String> m = new HashMap<String, String>();
   m.put("A", "First");
   m.put("B", "Second");
   m.put("C", "Third");
   System.out.println(m.get("B"));
   }
}


