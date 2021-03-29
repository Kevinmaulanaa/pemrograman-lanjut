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
public class Enums2 {

	enum Color
	{
		RED, BLUE, GREEN;
	}
	
 }

class PrintColor {

   public static void main(String[ ] args) {

   Color color = Color.RED; 

   switch(color) {

   case BLUE:
     System.out.println("1");
   break;

   case GREEN:
     System.out.println("2");
   break;
   
   default:
     System.out.println("0");
   break;		 
   }
}
}

