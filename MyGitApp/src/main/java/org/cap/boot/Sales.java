package org.cap.boot;

public class Sales {
	int[] arr={12,34,56,78,0};
	
	public void display(){
		System.out.println("Display Sum");
		int sum=0;
		for(int num:arr)
			sum+=num;
		
		System.out.println("Sum of Array:" + sum);
	}
	
	public void show(){
		System.out.println("Show Method!");
		System.out.println("Show Method!");
		System.out.println("Show Method!");
		System.out.println("Show Method!");
		
	}

}
