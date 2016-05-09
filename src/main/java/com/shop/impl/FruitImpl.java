package com.shop.impl;

import com.shop.Fruit;

/**
 * 
 * @author Dinesh
 * 
 */
public class FruitImpl implements Fruit {

	private final String name;
	private final double price;

	public FruitImpl(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
