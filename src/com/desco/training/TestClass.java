package com.desco.training;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

import javax.swing.SwingConstants;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.out.println("First Class");

		// int a=5;
		// int b=2;
		// int c=a+b;

		// int a=5;
		// int b=2;
		// int c=3;
		// float d=++a/--b - --c/++a + b;

		// int b=129;
		// byte a = (byte) b;

		// String x ="10";
		// int a = Integer.parseInt(x);

		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

/*		if (a >= b) {
			if (a >= c) {
				System.out.println("a greater");
			} else {
				System.out.println("c greater");
			}
		} else {
			if (b >= c) {
				System.out.println("b greater");
			} else {
				System.out.println("c greater");
			}

		}
*/
		// System.out.println(a);

		switch (a) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
				
		default:
			break;
		}
		
		
	}

}
