package com.exercise11oop.app;

import com.exercise11oop.model.Cat;
import com.exercise11oop.model.Angora;
import com.exercise11oop.model.Persa;

public class CatApp {
	public static void main(String[] args) 
	{
		Cat michi = new Persa();
		
		michi.setId(1);
		michi.setName("Michi");
		michi.setAge(3);
		
		//System.out.format("%s age is %d\n", michi.getName(), michi.getAge());
		System.out.println(michi.ToString());
		
		Angora tom = new Angora(2, "Tom", 4, 1.1);
		
		System.out.println(tom.ToString());
		
		Cat chula;
		chula = new Angora();
		chula = new Persa();
	}
}
