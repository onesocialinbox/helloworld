package com.demo;

import java.util.Date;

public class SimpleJava {
	
	public static void main(String[] args) {
		printMsg();
		currentDate();
	}

	public static void printMsg () {
		System.out.println("Hello");
		System.out.println("HelloWorld");
	}
	
	public static void printMsg (String msg) {		
		System.out.println(msg);
	}
	
	public static void currentDate() {
		System.out.println("Added some useful method which presents current date" + new Date());
		
	}
}
