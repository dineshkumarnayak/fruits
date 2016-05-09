package com.shop;

public interface Basket {

	Basket addItem(Item item);

	Basket removeItem(Item item);

	double getTotalPrice();
}
