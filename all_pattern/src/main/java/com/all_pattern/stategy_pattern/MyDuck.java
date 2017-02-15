package com.all_pattern.stategy_pattern;

public class MyDuck extends DUCK{

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("MyDuck----");
	}
	
	public MyDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Mutequack();
	}

}
