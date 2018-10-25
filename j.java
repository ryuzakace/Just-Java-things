/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package java_learn;

/**
 *
 * @author ryuzakace
 */

class j{
	
	public static void main(String[] args){
		
		Animal an = new Dog();
		Animal ca = new Cat();
		an.setName("Dogg");
		ca.setName("Cat");
		an.getName();
		an.speak(ca);
		Animal.fly();
				

	}


	
}

abstract class Animal{

	private String name;

	static int x;
	
	public void setName(String s){
		name = s;
	}

	public String getName(){
		//System.out.println(name);
		return name;
	}

	abstract void speak(Animal ain);

	static void fly(){
		System.out.println("NO");
	}

	


}

interface pet{
	abstract public void tame();
}

abstract class demo{
	abstract public void x();
}

class Cat extends Animal{


	void speak(Animal x){
		System.out.println(x.getName());
		System.out.println("meow");
	}
}

class Dog extends Animal implements pet{
	void speak(Animal x){

		System.out.println(x.getName());
		System.out.println("B`ow Wow Wow!!");
	}


	public void tame(){
		System.out.println("Yes boss :)");
	}
}





/*	
	













		
//		animal an = new animal();
//		an.speak();
		
//		dog d = new dog();
//		d.speak();
//		d.walk();

//		animal ad = new dog();
//		ad.speak();
	//	ad.walk();
	//
	//	
		pub(0,2);

	
	}

	static void pub(int i, int j){
		try{
			int c = i/j;
			System.out.println("In try");
		}catch(Exception e){
			System.out.println("Except");
		}finally{
			System.out.println("I'm here");
		}

		System.out.println(i);
	}


}

class animal{
	
	public void speak(){
		System.out.println("Speak?");
	}
}

class dog extends animal{
	
	public void speak(){
		System.out.println("Bow Wow Wow");
	}

	public void walk(){
		System.out.println("slowwly");
	}
}

*/
