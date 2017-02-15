package com.all_pattern.stategy_pattern;

public class Stategy {
 public static void main(String args[]){
	 DUCK myduck = new MyDuck();
	 myduck.performFly();
	 myduck.performQuack();
	 myduck.setFlyBehavior(new FlyNoWay());
	 myduck.performFly();
	 myduck.performFly();
	 myduck.performFly();
	 myduck.performFly();
 }
}
