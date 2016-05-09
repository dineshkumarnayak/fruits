package com.shop.impl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.shop.Basket;
import com.shop.Item;

/**
 * 
 * @author Dinesh
 * 
 */
public class BasketImpl implements Basket {

	private final Map<Integer, Item> items = new ConcurrentHashMap<Integer, Item>();

	public Basket addItem(Item item) {
		items.put(item.getId(), item);
		return this;
	}

	public Basket removeItem(Item item) {
		items.remove(item.getId());
		return this;

	}

	public double getTotalPrice() {
		double total = 0;
		for (Item item : items.values()) {
			total += item.getFruit().getPrice() * item.getQuantity();
		}
		return total;
	}

}
