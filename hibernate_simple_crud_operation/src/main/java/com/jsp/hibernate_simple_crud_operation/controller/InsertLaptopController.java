package com.jsp.hibernate_simple_crud_operation.controller;

import java.time.LocalDate;

import com.jsp.hibernate_simple_crud_operation.entity.Laptop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class InsertLaptopController {
	public static void main(String[] args) {
		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("hibernate");
		EntityManager em= emf.createEntityManager();
		
		EntityTransaction et= em.getTransaction();
		
		Laptop laptop= new Laptop();
		laptop.setId(11);
		laptop.setName("Aman");
		laptop.setPrice(25030);
	    laptop.setColor("White");
	    laptop.setPurchaseDate(LocalDate.parse("2025-05-06"));
	    laptop.setRam("8GM");
	    et.begin();
	    em.persist(laptop);
	    et.commit();
	    
	    
		
	}

}
