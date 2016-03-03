package com.me.pkg.animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		if(dog instanceof Animal)//可以把dog强制类型转换为Animal
		{
			Animal obj1 = (Animal)dog;//把dog类型强制转换为Animal
			System.out.println("把dog强制类型转换为Animal");
		}
	}
}
