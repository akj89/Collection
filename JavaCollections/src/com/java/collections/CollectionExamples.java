package com.java.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionExamples {

	public static void main(String[] args) {
		Collection<String> fruitCollection = new ArrayList<>();
		
		fruitCollection.add("banana");
		fruitCollection.add("mango");
		fruitCollection.add("apple");
		System.out.println(fruitCollection);
		
		fruitCollection.forEach( fruit->{
			System.out.println( fruit );
		});
		
		fruitCollection.remove("mango");
		System.out.println(fruitCollection);

	}

}
