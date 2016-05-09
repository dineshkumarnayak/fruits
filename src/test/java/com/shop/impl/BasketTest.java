package com.shop.impl;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.shop.Basket;
import com.shop.Item;

/**
 * 
 * @author Dinesh
 * 
 */
public class BasketTest {

	private Basket basket;

	@Before
	public void setup() {
		basket = new BasketImpl();
	}

	@Test
	public void testBasketWithOneQuantityOfEachProduct() {

		basket.addItem(new ItemImpl(1, Products.Apple.getFruit()))
				.addItem(new ItemImpl(1, Products.Banana.getFruit()))
				.addItem(new ItemImpl(1, Products.Lemon.getFruit()))
				.addItem(new ItemImpl(1, Products.Orange.getFruit()))
				.addItem(new ItemImpl(1, Products.Peache.getFruit()));
		Assert.assertEquals(27.5, basket.getTotalPrice());
	}

	@Test
	public void testBasketWithMoreThaOneQuantityOfSomeProduct() {

		basket.addItem(new ItemImpl(1, Products.Apple.getFruit()))
				.addItem(new ItemImpl(5, Products.Banana.getFruit()))
				.addItem(new ItemImpl(2, Products.Lemon.getFruit()))
				.addItem(new ItemImpl(3, Products.Orange.getFruit()))
				.addItem(new ItemImpl(2, Products.Peache.getFruit()));
		Assert.assertEquals(73.5, basket.getTotalPrice());
	}

	@Test
	public void testBasketWithNoProduct() {

		Assert.assertEquals(0.0, basket.getTotalPrice());
	}

	@Test
	public void testBasketWithRemovingOneItemOfSomeProduct() {

		Item remove;
		basket.addItem(new ItemImpl(1, Products.Apple.getFruit()))
				.addItem(new ItemImpl(1, Products.Banana.getFruit()))
				.addItem(remove = new ItemImpl(2, Products.Lemon.getFruit()))
				.addItem(new ItemImpl(1, Products.Orange.getFruit()))
				.addItem(new ItemImpl(1, Products.Peache.getFruit()))
				.removeItem(remove);
		Assert.assertEquals(20.0, basket.getTotalPrice());
	}
}
