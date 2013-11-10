
package com.wonderbiz.app.helloeclipse;

import com.wonderbiz.lib.maths.Maths;

public class HelloEclipse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Git is fun...!");
		System.out.println("Eclipse is cool...!!");
		
		Maths mymaths1 = new Maths(7, 2);
		
		doMaths(mymaths1);
		
		mymaths1.set_num1(89);
		doMaths(mymaths1);
		
		Maths mymaths2 = new Maths(57, 209);
		
		doMaths(mymaths2);

		mymaths2.set_num2(635);
		doMaths(mymaths2);
	}
	
	private static void doMaths(Maths mathsObj) {
		
		System.out.println("Maths: ADD [ " + mathsObj.get_num1() + " + " + mathsObj.get_num2() + " ] = " + mathsObj.add());
		System.out.println("Maths: SUB [ " + mathsObj.get_num1() + " - " + mathsObj.get_num2() + " ] = " + mathsObj.subtract());
	}

}

