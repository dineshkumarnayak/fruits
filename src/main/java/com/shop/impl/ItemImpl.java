package com.shop.impl;

import java.util.concurrent.atomic.AtomicInteger;

import com.shop.Fruit;
import com.shop.Item;

/**
 * 
 * @author Dinesh
 * 
 */
public class ItemImpl implements Item {
	private final int id;
	private static final AtomicInteger seq = new AtomicInteger(1);
	private final int quantity;
	private final Fruit fruit;

	public ItemImpl(int quantity, Fruit fruit) {
		super();
		this.id = seq.incrementAndGet();
		this.quantity = quantity;
		this.fruit = fruit;
	}

	public int getId() {
		return id;
	}

	public int getQuantity() {
		return quantity;
	}

	public Fruit getFruit() {
		return fruit;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Item) {
			return ((Item) obj).getId() == this.id;
		}
		return super.equals(obj);
	}

}
