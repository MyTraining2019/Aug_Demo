package org.cap.boot;

public class MainClass {
	
	public static void greetings(){
		System.out.println("Hello! Good Morning!");
	}

	public static void main(String[] args) {
		Sales sales=new Sales();
		greetings();
		sales.display();
	}

}
