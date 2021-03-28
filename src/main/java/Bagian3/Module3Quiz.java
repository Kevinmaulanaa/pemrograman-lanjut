/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bagian3;

/**
 *
 * @author User
 */
public class Module3Quiz {

    public static void main(String[]args)
    {
    	//latihan kuis bagian 1

       int arr[ ] = new int[3];
        for (int i = 0; i < 3; i++) {
           arr[i] = i;
        } 
        int res = arr[0] + arr[2];
        System.out.println(res);

        //kuis bagian 2
        int result = 0;
		for (int i = 0; i < 5; i++) {
		  if (i == 3) { 
		     result += 10;
		   } else {
		     result += i;
		   }	
		}
		System.out.println(result);

		//kuis bagian 3
		int res = 0;
		for(int el : arr) {
		res += el;

		}
    }
}
