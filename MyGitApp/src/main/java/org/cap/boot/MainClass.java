package org.cap.boot;

public class MainClass {
	
	public static void greetings(){
		System.out.println("Hello! Good Morning!");
		System.out.println("We are in GIT Repo!");
		System.out.println("Hai!");
		System.out.println("Welcome!");
		System.out.println("We are in GIT Repo!");
		
	}

	public static void main(String[] args) {
		Sales sales=new Sales();
		greetings();
		sales.display();
	}

}
