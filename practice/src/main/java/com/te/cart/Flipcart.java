package com.te.cart;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Flipcart {
public static void main(String[] args) {
	Item item = new Item();
	item.setItemno(1);
	Cart cart = new Cart();
	cart.setId(101);
	cart.setName("Laptop");
	cart.setCost(60000);
	
	Item item2 = new Item();
	item2.setItemno(2);
	item2.setName("Dell");
	item2.setPrice(45000);
	
	Item item3 = new Item();
	item3.setItemno(3);
	item3.setName("Hp");
	item3.setPrice(55000);
	
	List<Item> asList = Arrays.asList(item,item2,item3);
	cart.setItem(asList);
	item.setCart(cart);
	item2.setCart(cart);
	item3.setCart(cart);
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping1");
	EntityManager em = emf.createEntityManager();
	EntityTransaction transaction = em.getTransaction();
	transaction.begin();
	em.persist(cart);
	em.persist(item);
	em.persist(item2);
	em.persist(item3);
	transaction.commit();
	
	
	
}
}
