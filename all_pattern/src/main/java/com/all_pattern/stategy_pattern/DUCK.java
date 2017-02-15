package com.all_pattern.stategy_pattern;

public abstract class DUCK {
   public abstract void display();
   
   QuackBehavior quackBehavior;
   FlyBehavior flyBehavior;
   
   void performFly(){
	   flyBehavior.fly();
   }
   
   void performQuack(){
	   quackBehavior.quack();
   }
   
   public DUCK() {}
	
   public void setQuackBehavior(QuackBehavior qb){
	   this.quackBehavior = qb;
   }
   
   public void setFlyBehavior(FlyBehavior fb){
	   this.flyBehavior = fb;
   }
}
