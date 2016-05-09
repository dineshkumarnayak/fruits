package com.shop.impl;

import com.shop.Fruit;

/**
 * 
 * @author Dinesh
 * 
 */
public enum Products {
	Apple(createFruit("Apple", 4.5)), Banana(createFruit("Banana", 5.5)), Orange(
			createFruit("Orange", 6.5)), Lemon(createFruit("Lemon", 7.5)), Peache(
			createFruit("Peache", 3.5));

	private Products(Fruit fruit) {
		this.fruit = fruit;
	}

	private Fruit fruit;

	public Fruit getFruit() {
		return fruit;
	}

	private static Fruit createFruit(final String name, final double price) {
		return new Fruit() {

			public String getName() {

				return name;
			}

			public double getPrice() {
				return price;
			}

		};
	}
}
