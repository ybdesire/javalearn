package com.me.pkg.animal;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal();
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		if(dog instanceof Animal)//���԰�dogǿ������ת��ΪAnimal
		{
			Animal obj1 = (Animal)dog;//��dog����ǿ��ת��ΪAnimal
			System.out.println("��dogǿ������ת��ΪAnimal");
		}
	}
}
