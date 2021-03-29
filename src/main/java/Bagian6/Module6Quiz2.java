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


class B implements Runnable {
   public void run() {
     System.out.println("B");	
   }
}
class A extends Thread {
   public void run() {
    System.out.println("A");
    Thread t = new Thread(new B());
    t.start();
   }
public static void main(String[ ] args) {
   A object = new A();
   object.start();
   }
}


//kuis array list

public class Module6Quiz2
{
	ArrayList<Integer> list = new ArrayList<Integer>();
for (int i = 0; i < 6; i++) {
	list.add(i);
}
int x = 0;
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
	x+= it.next();	
}
System.out.println(x);
}

//kuis 3

int f=1, i=2;
while(++i<5)
   f*=i;
System.out.println(f);

